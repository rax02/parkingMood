package service;

import generatedGRPCCode.parkingStatus.ParkingStatusGrpc;
import generatedGRPCCode.parkingStatus.ParkingStatusOuterClass;
import io.grpc.stub.StreamObserver;
import repository.ParkingStatusRepository;

import java.sql.SQLException;

public class ParkingStatusService extends ParkingStatusGrpc.ParkingStatusImplBase {
    private final ParkingStatusRepository parkingStatusRepository;

    public ParkingStatusService(){
        parkingStatusRepository= new ParkingStatusRepository();
    }
    @Override
    public void getStatusByParkingLotId(ParkingStatusOuterClass.ParkingLotId request, StreamObserver<ParkingStatusOuterClass.ParkingLotStatusResponse> responseObserver) {
        ParkingStatusOuterClass.ParkingLotStatusResponse.Builder response = ParkingStatusOuterClass.ParkingLotStatusResponse.newBuilder();
        String parkingLotStatus = null;
        try {
            parkingLotStatus = parkingStatusRepository.getStatusByParkingLotId(request.getParkingLotId());
            response.setApiResponse(ParkingStatusOuterClass.APIResponse.newBuilder().setResponseMessage("success").setResponseCode(200).build());
            response.setParkingLot(ParkingStatusOuterClass.ParkingLot.newBuilder().setParkingLotId(request.getParkingLotId()).setParkingLotStatus(parkingLotStatus));

        } catch (SQLException e) {
            response.setApiResponse(ParkingStatusOuterClass.APIResponse.newBuilder().setResponseMessage("failure").setResponseCode(400).build());

        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void setStatusByParkingLotId(ParkingStatusOuterClass.SetParkingLotStatusRequest request, StreamObserver<ParkingStatusOuterClass.APIResponse> responseObserver) {
        ParkingStatusOuterClass.APIResponse.Builder response = ParkingStatusOuterClass.APIResponse.newBuilder();

        try {
            parkingStatusRepository.setStatusByParkingLotId(request.getParkingLotId(), request.getParkingLotStatus());
            response.setResponseMessage("status updated successfully.").setResponseCode(200);

        } catch (SQLException e) {
            response.setResponseMessage("failure"+ e.getMessage()).setResponseCode(400);

        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStatusByParkingSpaceId(ParkingStatusOuterClass.ParkingSpaceId request, StreamObserver<ParkingStatusOuterClass.ParkingSpaceStatusResponse> responseObserver) {
        super.getStatusByParkingSpaceId(request, responseObserver);
    }

    @Override
    public void setStatusByParkingSpaceId(ParkingStatusOuterClass.SetParkingSpaceStatusRequest request, StreamObserver<ParkingStatusOuterClass.APIResponse> responseObserver) {
        super.setStatusByParkingSpaceId(request, responseObserver);
    }

    @Override
    public void addParkingLots(ParkingStatusOuterClass.AddParkingLotsRequest request, StreamObserver<ParkingStatusOuterClass.APIResponse> responseObserver) {
        ParkingStatusOuterClass.APIResponse.Builder response = ParkingStatusOuterClass.APIResponse.newBuilder();

        try {
            parkingStatusRepository.addParkingLots(request.getParkingLotsList());
            response.setResponseMessage("parking Lots added successfully.").setResponseCode(200);

        } catch (SQLException e) {
            response.setResponseMessage("failure"+ e.getMessage()).setResponseCode(400);

        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void removeParkingLots(ParkingStatusOuterClass.RemoveParkingLotsRequest request, StreamObserver<ParkingStatusOuterClass.APIResponse> responseObserver) {
        super.removeParkingLots(request, responseObserver);
    }
}
