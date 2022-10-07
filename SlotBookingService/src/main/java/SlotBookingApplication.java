import config.server.grpc.ServerUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class SlotBookingApplication {
    public static void main(String[] args) throws IOException, InterruptedException {
        log.info("Starting booking service...");
        ServerUtil.runServer();

    }
}