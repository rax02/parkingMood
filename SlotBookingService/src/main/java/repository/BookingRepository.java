package repository;

import config.db.postgres.DBUtil;
import generatedGRPCCode.booking.BookingOuterClass;
import lombok.extern.slf4j.Slf4j;
import utility.DateTimeUtil;

import java.sql.*;
import java.util.UUID;

@Slf4j
public class BookingRepository {

    public String addBookingDetails(BookingOuterClass.BookingRequest request, Integer paymentId) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        String bookingId = UUID.randomUUID().toString();
        String query = "INSERT INTO public.\"BookingDetail\" values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, bookingId);
        statement.setInt(2, request.getBookingDetails().getCustomerId());
        statement.setInt(3,request.getBookingDetails().getParkingSpaceId());
        statement.setInt(4,request.getBookingDetails().getParkingLotId());
        statement.setTimestamp(5, Timestamp.valueOf(DateTimeUtil.getLocalDateTime(request.getBookingDetails().getStartDateTime())));
        statement.setTimestamp(6, Timestamp.valueOf(DateTimeUtil.getLocalDateTime(request.getBookingDetails().getEndDateTime())));
        statement.setString(7,request.getBookingDetails().getPaymentMethod());
        statement.setString(8, request.getBookingDetails().getBookingStatus());
        statement.setInt(9, paymentId);
        log.info(statement.toString());
        statement.executeUpdate();
        return bookingId;
    }

    public void updateBookingStatus(String bookingId, String status) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        String query ="UPDATE public.\"BookingDetail\" SET \"bookingStatus\" = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setString(1, status);
        statement.setString(2, bookingId);
        log.info(statement.toString());
        statement.executeUpdate();
    }

    public ResultSet getBookingDetailsFilteredBy(BookingOuterClass.BookingDetailsFilterRequest request) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        StringBuilder query = new StringBuilder();
        query.append("select * from public.\"BookingDetail\" ");
        int availableParameters = 0;
        if(request.getBookingId()!=null && request.getBookingId()!=""){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("id='"+request.getBookingId()+"'");
            availableParameters++;
        }
        if(request.getCustomerId()!=-1){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"customerId\"="+request.getCustomerId()+"");
            availableParameters++;
        }
        if(request.getParkingSpaceId()!=-1){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"parkingSpaceId\"="+request.getParkingSpaceId()+"");
            availableParameters++;
        }
        if(request.getParkingLotId()!=-1){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"parkingLotId\"="+request.getParkingLotId()+"");
            availableParameters++;
        }
        if(request.getFromDateTime()!=null && request.getFromDateTime()!=""){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"startDateTime\" > '"+request.getFromDateTime()+"'");
            availableParameters++;
        }
        if(request.getToDateTime()!=null && request.getFromDateTime()!=""){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"endDateTime\" <'"+request.getToDateTime()+"'");
            availableParameters++;
        }
        if(request.getPaymentMethod()!=null && request.getBookingId()!=""){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"paymentMethod\"='"+request.getPaymentMethod()+"'");
            availableParameters++;
        }
        if(request.getBookingStatus()!=null && request.getBookingId()!=""){
            query.append(availableParameters==0 ? "WHERE ": "AND ");
            query.append("\"bookingStatus\"='"+request.getBookingStatus()+"'");
            availableParameters++;
        }
        PreparedStatement statement = connection.prepareStatement(query.toString());
        log.info(statement.toString());
        ResultSet resultSet = statement.executeQuery();

        return resultSet;
    }
}
