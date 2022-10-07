import UserService.UserServices;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Inside main class");
        io.grpc.Server server = ServerBuilder.forPort(8005).addService(new UserServices()).build();

        server.start();
        System.out.println("Server started on port:"+ server.getPort());
        server.awaitTermination();

    }

}
