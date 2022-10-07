package UserService;

import com.user.grpc.UserGrpc;

import com.user.grpc.UserOuterClass;
import io.grpc.stub.StreamObserver;
import serviceRepo.userRepo;


public class UserServices extends UserGrpc.UserImplBase {

    @Override
    public void removeUser(UserOuterClass.removeById request, StreamObserver<UserOuterClass.APIResponse> responseObserver) {
      Integer userid=  request.getUserId();

        int result=userRepo.delete(userid);


        UserOuterClass.APIResponse.Builder response = UserOuterClass.APIResponse.newBuilder();

        if(result==1){
            response.setResponseCode(2).setResponseMessage("User Removed");
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }else{
            response.setResponseCode(3).setResponseMessage("Incorrect UserId, try again");
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateUser(UserOuterClass.UserDetails request, StreamObserver<UserOuterClass.APIResponse> responseObserver) {

try {
    int result= userRepo.update(request.getFullName(), request.getPassword(), request.getEmailId(), request.getUserId());

        UserOuterClass.APIResponse.Builder response = UserOuterClass.APIResponse.newBuilder();
    if(result==1){
        response.setResponseCode(2).setResponseMessage("User Details Updated.");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }else{
        response.setResponseCode(3).setResponseMessage("Update Failure. Try Again.");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

}catch(Exception e){
    e.printStackTrace();
}
//        try {
//            statement = connection.prepareStatement(Query);
//            statement.setString(1, request.getFullName());
//            statement.setString(2, request.getPassword());
//            statement.setString(3, request.getEmailId());
//            statement.setString(4, request.getUsername());
//            statement.execute();
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        response.setResponseCode(2).setResponseMessage("SUCCESS");
//
//        responseObserver.onNext(response.build());
//        responseObserver.onCompleted();

 }
  

}