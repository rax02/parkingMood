package service.clientService;

import common.CommonService;
import generatedGRPCCode.booking.BookingOuterClass;
import generatedGRPCCode.email.Email;
import generatedGRPCCode.email.MailGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;

@Slf4j
public class NotificationService {
    public void sendConfirmationNotification(BookingOuterClass.BookingDetails bookingDetails, String bookingId, Integer paymentId, Double totalCost) {
        log.info("Email has been initiated to Customer ID: {}", bookingDetails.getCustomerId());
        ManagedChannel channel = ManagedChannelBuilder.forAddress(CommonService.properties.getString("emailNotificationService.address"), Integer.valueOf(CommonService.properties.getString("emailNotificationService.port"))).usePlaintext().build();
        MailGrpc.MailBlockingStub mailStub = MailGrpc.newBlockingStub(channel);
        Email.SlotConfirmation message = Email.SlotConfirmation.newBuilder()
                .setCustomerId(bookingDetails.getCustomerId())
                .setBookingId(bookingId)
                .setParkingSpaceId(bookingDetails.getParkingSpaceId())
                .setParkingLotId(bookingDetails.getParkingLotId())
                .setBookingStatus(bookingDetails.getBookingStatus())
                .setEmailId(getEmailId(bookingDetails.getCustomerId()))
                .setTotalCost(totalCost)
                .build();
        Email.Response response = mailStub.slotBookingConfirmation(message);
        log.info(response.getResponseMessage());

    }

    public void sendCancellationNotification(BookingOuterClass.CancelBookingRequest request) {
        log.info("Email has been initiated to Customer ID: {}", request);
        ManagedChannel channel = ManagedChannelBuilder.forAddress(CommonService.properties.getString("emailNotificationService.address"), Integer.valueOf(CommonService.properties.getString("emailNotificationService.port"))).usePlaintext().build();
        MailGrpc.MailBlockingStub mailStub = MailGrpc.newBlockingStub(channel);
        Email.BookingCancellation message = Email.BookingCancellation.newBuilder()
                .setBookingId(request.getBookingId())
                .setEmailId("ravi.k.maurya@globallogic.com")
                .build();

        Email.Response response = mailStub.slotBookingCancellation(message);
        log.info(response.getResponseMessage());

    }


//    ---------------
    String getEmailId(int customerId){
        String customerEmailId="";
        try {
            ResultSet resultset = getCustomerEmailId(customerId);
            while(resultset.next()){
                customerEmailId = resultset.getString("email_id");
                break;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return customerEmailId;
    }

    private Connection getCustomerConnection() {

        String jdbcUrl = CommonService.properties.getString("userAuthenticationService.db.jdbcUrl");
        String username = CommonService.properties.getString("db.username");
        String password = CommonService.properties.getString("db.password");
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to database.");

        } catch (SQLException e) {
            System.out.println("Cannot connect to database in PostgreSQL");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return connection;

    }
    public ResultSet getCustomerEmailId(int customerId) {
        Statement createStatement;
        try {
            createStatement = getCustomerConnection().createStatement();

            ResultSet executeQuery = createStatement
                    .executeQuery("SELECT email_id FROM public.\"CustomerDetails\" WHERE email_id = '"+customerId+"'");
            log.info(executeQuery.toString());
            return executeQuery;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
