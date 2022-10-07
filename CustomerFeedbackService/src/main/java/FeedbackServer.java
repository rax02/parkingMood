import com.feedbackserver.Service.FeedbackService;
import com.feedbackserver.Service.ProviderFeedbackService;
import com.feedbackserver.common.CommonService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class FeedbackServer {
    public static void main(String[] args) throws Exception  {

        System.out.println("inside client main method");
        Server server1 = ServerBuilder.forPort(Integer.valueOf(CommonService.properties.getString("feedbackService.port"))).addService(new FeedbackService()).addService(new ProviderFeedbackService()).build();

        server1.start();
        System.out.println("Server is stared:"+server1.getPort());

        server1.awaitTermination();
    }
}
