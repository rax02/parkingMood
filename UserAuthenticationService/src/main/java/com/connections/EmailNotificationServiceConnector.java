package com.connections;

import EmailNotificationSever.grpc.Email;
import EmailNotificationSever.grpc.MailGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class EmailNotificationServiceConnector extends MailGrpc.MailImplBase {



    /*@Override
    public void customerRegistration(Email.Registration request, StreamObserver<Email.Response> responseObserver) {
        String name = request.getFullName();
        String username = request.getUsername();
        String emailId = request.getEmailId();notify()
        String password = request.getPassword();
        long phoneNum = request.getPhoneNumber();
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8282).usePlaintext().build();
        MailGrpc.MailBlockingStub blockingStub = MailGrpc.newBlockingStub(channel);
        Email.Registration messege = Email.Registration.newBuilder().setFullName(name)
                .setUsername(username)
                .setEmailId(emailId)
                .setPassword(password)
                .setPassword(password)

                .build();
        Email.Response newResponse = blockingStub.customerRegistration(messege);

    }*/
    public void emailConnect(String name, String username, Integer userId, String emailId, String password, String phoneNum){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8002).usePlaintext().build();
        MailGrpc.MailBlockingStub blockingStub = MailGrpc.newBlockingStub(channel);
        Email.Registration messege = Email.Registration.newBuilder().setFullName(name)
                .setUsername(username)
                .setUserId(userId)
                .setEmailId(emailId)
                .setPassword(password)
                .setPhoneNumber(phoneNum)
                .build();
        Email.Response newResponse = blockingStub.customerRegistration(messege);
    }
}
