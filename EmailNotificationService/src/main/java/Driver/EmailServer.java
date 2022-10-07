package Driver;

import common.CommonService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.EmailNotificationService;

import java.io.IOException;


public class EmailServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Inside main class");
        Server server = ServerBuilder.forPort(Integer.valueOf(CommonService.properties.getString("emailNotificationService.port"))).addService(new EmailNotificationService()).build();
        server.start();
        System.out.println("Server started on port:" + server.getPort());
        server.awaitTermination();
    }
}
