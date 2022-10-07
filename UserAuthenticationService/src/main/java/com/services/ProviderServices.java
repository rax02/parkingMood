package com.services;

import com.connections.EmailNotificationServiceConnector;
import com.dao.DaoUtility;
import com.provider.grpc.Provider;
import com.provider.grpc.Provider.APIResponse;
import com.provider.grpc.Provider.providerDetails;
import com.provider.grpc.newProviderGrpc.newProviderImplBase;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProviderServices extends newProviderImplBase {

    @Override
    public void addProvider(providerDetails request, StreamObserver<APIResponse> responseObserver) {
        Connection connection = DaoUtility.getProviderConnection();
        String query = "INSERT INTO public.\"ProviderDetails\"(\"fullName\", username, password, email_id, \"address\") "
                + "		VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        Provider.APIResponse.Builder response = Provider.APIResponse.newBuilder();
        try {
            statement = connection.prepareStatement(query);

            statement.setString(1, request.getFullName());
            statement.setString(2, request.getUsername());
            statement.setString(3, request.getPassword());
            statement.setString(4, request.getEmailId());
            statement.setString(5, request.getAddress());
//            statement.setInt(6, request.getNoOfParkingSlots());
            statement.execute();
            response.setResponseCode(2).setResponseMessage("Provider Registered Successfully.");

            EmailNotificationServiceConnector connect = new EmailNotificationServiceConnector();
            connect.emailConnect(request.getFullName(), request.getUsername()
                    , request.getUserId()
                    , request.getEmailId()
                    , request.getPassword()
                    , request.getAddress());
            System.out.println(request.getFullName() + "\t" + request.getUsername() + "\t"
                    + request.getUserId() + "\t"
                    + request.getEmailId() + "\t"
                    + request.getPassword() + "\t"
                    + request.getAddress());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error in SQL insertion");
            response.setResponseCode(1).setResponseMessage(e.getMessage());
        } finally {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }


    }

  /*  @Override
    public void getProvider(Provider.empty request, StreamObserver<providerDetails> responseObserver) {
        super.getProvider(request, responseObserver);
    }*/

    @Override
    public void getProvider(Provider.empty request, StreamObserver<providerDetails> responseObserver) {
        Connection connection = DaoUtility.getProviderConnection();
        String query = "SELECT * FROM public.\"ProviderDetails\"";
        //PreparedStatement statement = null;
        Provider.providerDetails.Builder response = Provider.providerDetails.newBuilder();
        //ResultSet providerList = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet providerList = statement.executeQuery();
            while (providerList.next()) {
                String name = providerList.getString("fullName");
                String uName = providerList.getString("username");
                int id = providerList.getInt("userId");
                String emailId = providerList.getString("email_id");
                String password = providerList.getString("password");
                String address = providerList.getString("address");
//                int noOfSpaces = providerList.getInt("No_Of_Parking_Slots");
                /*System.out.format("Provider Name: %s\nUsername: %s\nUser_ID: %d\nEmail_ID: %s\nLocation of Parking Space: %s" +
                        "Spots Provided: %d", name,uName,id,emailId,password,address,noOfSpaces);*/
                response.setFullName(name)
                        .setUsername(uName)
                        .setUserId(id)
                        .setEmailId(emailId)
                        .setPassword(password)
                        .setAddress(address);
                responseObserver.onNext(response.build());
            }
        } catch (SQLException e) {
            //response.setResponseCode(1).setResponseMessage("No records found");
            throw new RuntimeException(e);
            //e.printStackTrace();
        }

        //response.setResponseCode(2).setResponseMessage("SUCCESS");
        //responseObserver.onCompleted();
    }
}
