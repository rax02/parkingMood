package com.services;

import com.customer.grpc.Customer;
import com.customer.grpc.newCustomerGrpc;
import com.dao.DaoUtility;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetCustomerDetails extends newCustomerGrpc.newCustomerImplBase {
    @Override
    public void getCustomer(Customer.empty request, StreamObserver<Customer.CustomerDetails> responseObserver) {
        Connection connection = DaoUtility.getProviderConnection();
        String query = "SELECT * FROM public.\"CustomerDetails\"";
        PreparedStatement statement = null;
        Customer.CustomerDetails.Builder response = Customer.CustomerDetails.newBuilder();
        ResultSet customerList = null;
        try{
            statement = connection.prepareStatement(query);
            customerList = statement.executeQuery(query);
            while(customerList.next()){
                String name = customerList.getString("fullName");
                String uName = customerList.getString("username");
                int id = customerList.getInt("userId");
                String emailId = customerList.getString("email_id");
                String password = customerList.getString("password");
                String phoneNo = customerList.getString("phone_number");
                System.out.format("Customer Name: %s\nUsername: %s\nUser_ID: %d\nEmail_ID: %s\nPhone Number: %d"
                        , name,uName,id,emailId,password,phoneNo);
                response.setFullName(name)
                        .setUsername(uName)
                        .setUserId(id)
                        .setEmailId(emailId)
                        .setPassword(password)
                        .setPhoneNumber(phoneNo);

            }
        } catch (SQLException e) {
           // response.setResponseCode(1).setResponseMessage("No records found");
            throw new RuntimeException(e);
        }

        //response.setResponseCode(2).setResponseMessage("SUCCESS");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
