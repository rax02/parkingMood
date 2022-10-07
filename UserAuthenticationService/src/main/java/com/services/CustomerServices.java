package com.services;

import com.connections.EmailNotificationServiceConnector;
import com.customer.grpc.Customer;
import com.customer.grpc.Customer.APIResponse;
import com.customer.grpc.Customer.CustomerDetails;
import com.customer.grpc.newCustomerGrpc.newCustomerImplBase;
import com.dao.DaoUtility;
import io.grpc.stub.StreamObserver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerServices extends newCustomerImplBase {

    @Override
    public void addCustomer(CustomerDetails request, StreamObserver<APIResponse> responseObserver) {

        Connection connection = DaoUtility.getCustomerConnection();
        String query = "INSERT INTO public.\"CustomerDetails\"(\"fullName\", username, email_id, password, phone_number)\n"
                + "	VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = null;
        Customer.APIResponse.Builder response = Customer.APIResponse.newBuilder();

        try {
            statement = connection.prepareStatement(query);

            statement.setString(1, request.getFullName());
            statement.setString(2, request.getUsername());
            statement.setString(3, request.getEmailId());
            statement.setString(4, request.getPassword());
            statement.setLong(5, Long.valueOf(request.getPhoneNumber()));
            statement.execute();
            response.setResponseCode(2).setResponseMessage("Customer Registered Successfully!");

            EmailNotificationServiceConnector connect = new EmailNotificationServiceConnector();
            connect.emailConnect(request.getFullName(), request.getUsername()
                    , request.getUserId()
                    , request.getEmailId()
                    , request.getPassword()
                    , request.getPhoneNumber());
            System.out.println(request.getFullName() + "\t" + request.getUsername() + "\t"
                    + request.getUserId() + "\t"
                    + request.getEmailId() + "\t"
                    + request.getPassword() + "\t"
                    + request.getPhoneNumber());

        } catch (SQLException e) {
            e.printStackTrace();
            response.setResponseCode(1).setResponseMessage(e.getMessage());
        }finally {
            responseObserver.onNext(response.build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getCustomer(Customer.empty request, StreamObserver<CustomerDetails> responseObserver) {
        Connection connection = DaoUtility.getCustomerConnection();
        String query = "SELECT * FROM public.\"CustomerDetails\"";
        //  PreparedStatement statement = null;
        Customer.CustomerDetails.Builder response = Customer.CustomerDetails.newBuilder();
        // ResultSet customerList = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet customerList = statement.executeQuery(query);
            while (customerList.next()) {
                String name = customerList.getString("fullName");
                String uName = customerList.getString("username");
                int id = customerList.getInt("userId");
                String emailId = customerList.getString("email_id");
                String password = customerList.getString("password");
                String phoneNo = customerList.getString("phone_number");
                System.out.format("Customer Name: %s\nUsername: %s\nUser_ID: %d\nEmail_ID: %s\nPhone Number: %d"
                        , name, uName, id, emailId, password, phoneNo);
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

