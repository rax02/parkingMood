package repository;

import config.db.postgres.DBUtil;
import generatedGRPCCode.parkingStatus.ParkingStatusOuterClass;
import lombok.extern.slf4j.Slf4j;

import java.sql.*;
import java.util.List;
@Slf4j
public class ParkingStatusRepository {
    public String getStatusByParkingLotId(int parkingLotId) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        String query = "SELECT status FROM public.\"ParkingStatus\" where \"ParkingStatus\".\"parkingLotId\" = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setInt(1,parkingLotId);
        log.info(statement.toString());
        ResultSet resultSet = statement.executeQuery();

        String status = "";
        while(resultSet.next()){
            status=resultSet.getString("status");
        }
        return status;
    }

    public void setStatusByParkingLotId(int parkingLotId, String parkingLotStatus) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        String query = "UPDATE public.\"ParkingStatus\" SET status = ? WHERE \"ParkingStatus\".\"parkingLotId\" = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1,parkingLotStatus);
        statement.setInt(2,parkingLotId);
        log.info(statement.toString());
        statement.executeUpdate();

    }

    public void addParkingLots(List<ParkingStatusOuterClass.ParkingLot> parkingLotsList) throws SQLException {
        Connection connection= DBUtil.getDBConnection();
        StringBuilder query = new StringBuilder();
        query.append("INSERT INTO public.\"ParkingStatus\" values");
        parkingLotsList.stream().forEach(lot->query.append("("+ lot.getParkingLotId()+",00,'"+lot.getParkingLotStatus()+"'),"));
        query.deleteCharAt(query.length()-1);
        PreparedStatement statement = connection.prepareStatement(query.toString());
        log.info(statement.toString());
        statement.executeUpdate();
    }

}
