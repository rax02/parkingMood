package service.clientService;

import common.CommonService;
import common.Constants;
import generatedGRPCCode.parkingSpace.ParkingSpaceGrpc;
import generatedGRPCCode.parkingSpace.ParkingSpaceOuterClass;
import generatedGRPCCode.parkingStatus.ParkingStatusOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import org.postgresql.util.PSQLException;
import repository.ParkingStatusRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SpaceProviderService {

    private final ParkingStatusRepository parkingStatusRepository;

    public SpaceProviderService() {
        parkingStatusRepository = new ParkingStatusRepository();
    }

    public ParkingSpaceOuterClass.slot getParkingLotDetails(int parkingSpaceId, int parkingLotId) throws SQLException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(CommonService.properties.getString("spaceProviderService.address"), Integer.valueOf(CommonService.properties.getString("spaceProviderService.port"))).usePlaintext().build();
        ParkingSpaceGrpc.ParkingSpaceBlockingStub parkingSpaceStub = ParkingSpaceGrpc.newBlockingStub(channel);
        ParkingSpaceOuterClass.SlotNumber message = ParkingSpaceOuterClass.SlotNumber.newBuilder()
                .setSlotNum(parkingLotId)
                .build();

        ParkingSpaceOuterClass.slot response = parkingSpaceStub.getBySlotNumber(message);
        List<ParkingStatusOuterClass.ParkingLot> parkingLots = new ArrayList<>();
        ParkingStatusOuterClass.ParkingLot parkingLot = ParkingStatusOuterClass.ParkingLot.newBuilder().setParkingLotId(response.getSlotNumber()).setParkingLotStatus(Constants.AVAILABLE).build();
        parkingLots.add(parkingLot);
        parkingStatusRepository.addParkingLots(parkingLots);
        return response;


    }


//    ------
private static Connection connection;

    static Connection connection() throws SQLException {
        try {
            String jdbcUrl = CommonService.properties.getString("spaceProviderService.db.jdbcUrl");
            String username = CommonService.properties.getString("db.username");
            String password = CommonService.properties.getString("db.password");
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            return connection;
        } catch (PSQLException e) {

        }
        return connection;

    }

    public void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ResultSet getByNum(Integer spaceProviderUId, Integer slotNumber)
            throws SQLException, PSQLException, StatusRuntimeException {
        Statement createStatement = connection().createStatement();

        ResultSet executeQuery = createStatement.executeQuery("select * from spaceProvider where slotNumber='"
                + slotNumber + "' and providerUserId= '" + spaceProviderUId + "'");

        return executeQuery;
    }

    public long getPriceBySlotNumber(int parkingSpaceId, int parkingLotId) throws SQLException {

        Integer slotNumber = parkingLotId;
        Integer providerUserId = parkingSpaceId;

        long price=0;
        int slot=0;
        String vehicleType="";


             if (slotNumber != null && providerUserId != null) {


                ResultSet getresult = getByNum(providerUserId, slotNumber);
                boolean next = getresult.next();
                while (next==true) {
                    price = getresult.getLong("price");
                    slot = getresult.getInt("slotNumber");
                    vehicleType = getresult.getString("VehicleType");

                    List<ParkingStatusOuterClass.ParkingLot> parkingLots = new ArrayList<>();
                    ParkingStatusOuterClass.ParkingLot parkingLot = ParkingStatusOuterClass.ParkingLot.newBuilder().setParkingLotId(slot).setParkingLotStatus(Constants.AVAILABLE).build();
                    parkingLots.add(parkingLot);
                    parkingStatusRepository.addParkingLots(parkingLots);
                    break;

                }

            }




        return price;
    }
}
