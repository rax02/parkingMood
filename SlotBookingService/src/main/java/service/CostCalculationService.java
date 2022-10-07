package service;

import generatedGRPCCode.booking.BookingOuterClass;
import service.clientService.SpaceProviderService;
import utility.DateTimeUtil;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CostCalculationService {

    private SpaceProviderService spaceProviderService;
    public CostCalculationService(){
        this.spaceProviderService = new SpaceProviderService();
    }

    public Double getTotalCost(BookingOuterClass.BookingDetails bookingDetails) throws SQLException {
        // TODO: 21/09/22 integerate provider service to get the price
        LocalDateTime startDateTime = DateTimeUtil.getLocalDateTime(bookingDetails.getStartDateTime());
        LocalDateTime endDateTime = DateTimeUtil.getLocalDateTime(bookingDetails.getEndDateTime());
        long totalHours = ChronoUnit.HOURS.between(startDateTime,endDateTime);
//        long pricePerHour = spaceProviderService.getParkingLotDetails(bookingDetails.getParkingSpaceId(), bookingDetails.getParkingLotId()).getPrice();
        long pricePerHour = spaceProviderService.getPriceBySlotNumber(bookingDetails.getParkingSpaceId(), bookingDetails.getParkingLotId());
        return (double) totalHours*pricePerHour;
    }
}
