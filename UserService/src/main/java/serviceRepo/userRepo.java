package serviceRepo;

import Dao.DaoUtility;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import com.user.grpc.UserOuterClass;


public class userRepo {
    public static int update(String fullName,String password,String Email,Integer userId) {



        try {
            Connection connection = DaoUtility.getUserConnection();

            Statement createStatement = connection.createStatement();
            int executeUpdate =  createStatement.executeUpdate("UPDATE public.\"ProviderDetails\" Set \"fullName\" ='"+fullName+"',\"password\" ='"+password+"',\"email_id\" ='"+Email+"'  Where \"userId\" ="+userId);
            return executeUpdate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static int delete(Integer id) {
        Connection connection = DaoUtility.getUserConnection();

        try {
            String query = "DELETE FROM public.\"ProviderDetails\"  WHERE \"userId\"=" + id;
            Statement stmnt = connection.createStatement();
           stmnt.executeUpdate(query);
           if (stmnt.getUpdateCount() == 1)
                return 1;
           else
               return 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void deleteGRPC(UserOuterClass.removeById request){
    	ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
      
    
    }
}
