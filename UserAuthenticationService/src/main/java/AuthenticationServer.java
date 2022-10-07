import com.common.CommonService;
import com.services.*;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AuthenticationServer {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Inside main class");
        io.grpc.Server serverMain = ServerBuilder.forPort(Integer.valueOf(CommonService.properties.getString("userAuthenticationService.port"))).addService(new ProviderServices())
                .addService(new CustomerServices())
                .addService(new UserLogin())
                .build();

        io.grpc.Server getServer = ServerBuilder.forPort(8185).addService(new GetCustomerDetails()).addService(new GetProviderDetails()).build();
       // io.grpc.Server login = ServerBuilder.forPort(8183).addService(new UserLogin()).build();*/
        serverMain.start();
        getServer.start();
        System.out.println("User Authentication Server started on port:" + serverMain.getPort());
        serverMain.awaitTermination();
        getServer.awaitTermination();

    }
}
