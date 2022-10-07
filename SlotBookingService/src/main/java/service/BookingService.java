package service;


import common.Constants;
import exception.BookingException;
import generatedGRPCCode.booking.BookingGrpc;
import generatedGRPCCode.booking.BookingOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import repository.BookingRepository;
import repository.ParkingStatusRepository;
import service.clientService.NotificationService;

import java.sql.ResultSet;
import java.sql.SQLException;
@Slf4j
public class BookingService extends BookingGrpc.BookingImplBase {

    private final BookingRepository bookingRepository;
    private final PaymentService paymentService;
    private final CostCalculationService costCalculationService;
    private final ParkingStatusRepository parkingStatusRepository;
    private final NotificationService notificationService;
    public BookingService(){
        bookingRepository = new BookingRepository();
        paymentService = new PaymentService();
        costCalculationService = new CostCalculationService();
        parkingStatusRepository = new ParkingStatusRepository();
        notificationService = new NotificationService();

    }
    @Override
    public void bookParkingLot(BookingOuterClass.BookingRequest request, StreamObserver<BookingOuterClass.BookingResponse> responseObserver){
        BookingOuterClass.BookingResponse.Builder response = BookingOuterClass.BookingResponse.newBuilder();
        Double totalCost = 0.0;
        try {
            totalCost = costCalculationService.getTotalCost(request.getBookingDetails());
        } catch (SQLException e) {
            response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage("Parking Lot is not Available. Try Again.").setResponseCode(400).build());

            log.info("problem while connecting to space provider service");
            
        }
        try {
            if(parkingStatusRepository.getStatusByParkingLotId(request.getBookingDetails().getParkingLotId()).equals(Constants.AVAILABLE)) {

                Integer paymentId = paymentService.doPayment(request, totalCost);
                String bookingId = bookingRepository.addBookingDetails(request, paymentId);
                parkingStatusRepository.setStatusByParkingLotId(request.getBookingDetails().getParkingLotId(), Constants.BOOKED);
                notificationService.sendConfirmationNotification(request.getBookingDetails(),bookingId,paymentId,totalCost);
                response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage("Booking Completed with BookingId : "+ bookingId).setResponseCode(200).build());
            }else{
                throw new BookingException("Parking Lot is not Available. Try Again.");
            }
        } catch (SQLException e) {
            response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage("Booking Failed:"+e.getMessage()).setResponseCode(400).build());
        } catch (BookingException e){
            response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage("Booking Failed:"+e.getMessage()).setResponseCode(400).build());

        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    @Override
    public void getBookingDetailsFilteredBy(BookingOuterClass.BookingDetailsFilterRequest request, StreamObserver<BookingOuterClass.BookingDetailsFilteredResponse> responseObserver) {
        // TODO: 22/09/22
        BookingOuterClass.BookingDetailsFilteredResponse.Builder response = BookingOuterClass.BookingDetailsFilteredResponse.newBuilder();
        try {
            ResultSet resultSet = bookingRepository.getBookingDetailsFilteredBy(request);
            while(resultSet.next()){
                response.addBookingDetailsFilteredList(bookingDetailsMapper(resultSet));
               }
            response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage("Details successfully fetched.").setResponseCode(200).build());

        } catch (SQLException e) {
            response.setApiResponse(BookingOuterClass.APIResponse.newBuilder().setResponseMessage(e.getMessage()).setResponseCode(400).build());
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    private BookingOuterClass.BookingDetailsResponse bookingDetailsMapper(ResultSet resultSet) throws SQLException {
        BookingOuterClass.BookingDetailsResponse.Builder bookingDetails = BookingOuterClass.BookingDetailsResponse.newBuilder();
        bookingDetails.setBookingId(resultSet.getString(1))
                .setCustomerId(resultSet.getInt(2))
                .setParkingSpaceId(resultSet.getInt(3))
                .setParkingLotId(resultSet.getInt(4))
                .setStartDateTime(resultSet.getTimestamp(5).toString())
                .setEndDateTime(resultSet.getTimestamp(6).toString())
                .setPaymentMethod(resultSet.getString(7))
                .setBookingStatus(resultSet.getString(8))
                .setPaymentId(resultSet.getInt(9))
                .setCreatedAt(resultSet.getTimestamp(10).toString());
        return bookingDetails.build();
    }

    @Override
    public void cancelBooking(BookingOuterClass.CancelBookingRequest request, StreamObserver<BookingOuterClass.APIResponse> responseObserver) {
        BookingOuterClass.APIResponse.Builder response = BookingOuterClass.APIResponse.newBuilder();

        if(Constants.PROVIDER.equals(request.getCancelledBy())){
//            bookingRepository.getBookingDetailsFilteredBy();
        }
        try {
            bookingRepository.updateBookingStatus(request.getBookingId(), Constants.CANCELLED);
            parkingStatusRepository.setStatusByParkingLotId(request.getParkingLotId(), Constants.AVAILABLE);
            notificationService.sendCancellationNotification(request);
            response.setResponseMessage("Booking is cancelled successfully.").setResponseCode(200);
        } catch (SQLException e) {
            response.setResponseMessage(e.getMessage()).setResponseCode(400);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
