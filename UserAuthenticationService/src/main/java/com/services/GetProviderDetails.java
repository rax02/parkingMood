package com.services;

import com.dao.DaoUtility;
import com.provider.grpc.Provider;
import com.provider.grpc.newProviderGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetProviderDetails extends newProviderGrpc.newProviderImplBase {
    @Override
    public void getProvider(Provider.empty request, StreamObserver<Provider.providerDetails> responseObserver) {
        Connection connection = DaoUtility.getProviderConnection();
        String query = "SELECT * FROM public.\"ProviderDetails\"";
        PreparedStatement statement = null;
        Provider.providerDetails.Builder response = Provider.providerDetails.newBuilder();
        ResultSet providerList = null;
        try{
            statement = connection.prepareStatement(query);
            providerList = statement.executeQuery(query);
            while(providerList.next()){
                String name = providerList.getString("fullName");
                String uName = providerList.getString("username");
                int id = providerList.getInt("userId");
                String emailId = providerList.getString("email_id");
                String password = providerList.getString("password");
                String address = providerList.getString("address");
                int noOfSpaces = providerList.getInt("No_Of_Parking_Slots");
                System.out.format("Provider Name: %s\nUsername: %s\nUser_ID: %d\nEmail_ID: %s\nLocation of Parking Space: %s" +
                        "Spots Provided: %d", name,uName,id,emailId,password,address,noOfSpaces);
                response.setFullName(name)
                        .setUsername(uName)
                        .setUserId(id)
                        .setEmailId(emailId)
                        .setPassword(password)
                        .setAddress(address);

            }
        } catch (SQLException e) {
            //response.setResponseCode(1).setResponseMessage("No records found");
            throw new RuntimeException(e);
        }

        //response.setResponseCode(2).setResponseMessage("SUCCESS");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
