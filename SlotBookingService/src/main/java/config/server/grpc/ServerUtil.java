package config.server.grpc;

import common.CommonService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lombok.extern.slf4j.Slf4j;
import service.BookingService;
import service.ParkingStatusService;

import java.io.IOException;
@Slf4j
public class ServerUtil {
    public static void runServer() throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(Integer.valueOf(CommonService.properties.getString("slotBookingService.port"))).addService(new BookingService()).addService(new ParkingStatusService()).build();

        server.start();
        log.info("Server started on port:"+ server.getPort());
        server.awaitTermination();
    }
}
