package service;

import DaoUtility.MailUtility;
import EmailNotificationSever.grpc.Email;
import EmailNotificationSever.grpc.MailGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.ResultSet;

import static DaoUtility.DbConnection.getAllCustomerEmailId;

public class EmailNotificationService extends MailGrpc.MailImplBase {
    static boolean sendmail;

    @Override
    public void send(Email.SendBody request, StreamObserver<Email.Response> responseObserver) {
        try {
            ResultSet result = getAllCustomerEmailId();
            while(result.next()) {
                String subject = request.getSubject();
                String bodyText = request.getText();
                String recipients = result.getString("email_id");
                sendmail = MailUtility.sendMail(recipients, subject, bodyText);
                System.out.println(sendmail);
            }
            Email.Response.Builder response = Email.Response.newBuilder();
            if (sendmail == true) {
                response.setResponseMessage("sent email is successfully").setReponseCode(100);
            } else {
                response.setResponseMessage("failed to send email").setReponseCode(2);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Override
    public void slotBookingConfirmation(Email.SlotConfirmation request, StreamObserver<Email.Response> responseObserver) {
        String recipients = request.getEmailId();
        String subject = "Booking";
        Integer customerId = request.getCustomerId();
        Integer parkingSpaceId = request.getParkingSpaceId();
        Integer parkingLotId = request.getParkingLotId();
        String bookingId = request.getBookingId();
        Double totalCost = request.getTotalCost();
        String startDateTime = request.getStartDateTime();
        String endDateTime = request.getEndDateTime();
        String bookingStatus = request.getBookingStatus();
        String bodyText = "Successfully Booked" + "\n Customer Id :" + customerId.toString() + "\n parking space Id :" + parkingSpaceId.toString() +
                "\n Parking LotId:" + parkingLotId.toString() + "\n Booking Id:" + bookingId.toString() + "\n Total cost :" + totalCost.toString() +
                "\nStart Date Time:"+startDateTime.toString()+"\n End Date Time"+endDateTime.toString()+ "\n Booking Status :" + bookingStatus.toString();
        try {
            sendmail = MailUtility.sendMail(recipients, subject, bodyText);
            System.out.println(sendmail);
            Email.Response.Builder response = Email.Response.newBuilder();
            if (sendmail == true) {
                response.setResponseMessage("sent email is successfully").setReponseCode(100);
            } else {
                response.setResponseMessage("failed to send email").setReponseCode(2);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void customerRegistration(Email.Registration request, StreamObserver<Email.Response> responseObserver) {
        String recipients = request.getEmailId();
        String subject = "parking Registration";
        Integer userId= request.getUserId();
        String fullName= request.getFullName();
        String phoneNumber=request.getPhoneNumber();
        String userName= request.getUsername();
        String bodyText= "Successfully Registered with the details"+"\nUserId :"+userId.toString()+
                "\nUser Name:"+userName+"\nFullName :"+fullName+"\nPhoneNumber"+phoneNumber.toString()+
                "\nThanks for the Registration";

        try {
            sendmail = MailUtility.sendMail(recipients, subject, bodyText);
            System.out.println(sendmail);
            Email.Response.Builder response = Email.Response.newBuilder();
            if (sendmail == true) {
                response.setResponseMessage("sent email is successfully").setReponseCode(100);
            } else {
                response.setResponseMessage("failed to send email").setReponseCode(2);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void slotBookingCancellation(Email.BookingCancellation request, StreamObserver<Email.Response> responseObserver) {
        String recipients = request.getEmailId();
        String subject ="Booking Cancellation";
        Integer bookingId = request.getBookingId();
        String bodyText="Booking Id:"+bookingId.toString()+"\nBooking successfully cancelled";
        try {
            sendmail = MailUtility.sendMail(recipients, subject, bodyText);
            System.out.println(sendmail);
            Email.Response.Builder response = Email.Response.newBuilder();
            if (sendmail == true) {
                response.setResponseMessage("sent email is successfully").setReponseCode(100);
            } else {
                response.setResponseMessage("failed to send email").setReponseCode(2);
            }
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
