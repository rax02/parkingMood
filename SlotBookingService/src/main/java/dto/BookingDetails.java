package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BookingDetails {
    private String bookingId;
    private String customerId;
    private Integer parkingSpaceId;
    private Integer parkingLotId;
    private String startDateTime;
    private String endDateTime;
    private String paymentMethod;
    private String bookingStatus;
    private Integer paymentId;
    private String createdAt;
}
