package com.services;

import java.sql.*;

import com.authentication.grpc.User;
import com.authentication.grpc.User.APIResponse;
import com.authentication.grpc.User.LoginRequest;
import com.authentication.grpc.User.LogoutRequest;
import com.authentication.grpc.userAuthenticationGrpc.userAuthenticationImplBase;
import com.dao.DaoUtility;

import io.grpc.ManagedChannel;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
public class UserLogin extends userAuthenticationImplBase{

	@Override
	public void loginProvider(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		
        Connection connection = DaoUtility.getProviderConnection();
        String query = "SELECT \"password\" FROM public.\"ProviderDetails\"\n"
        		+ "WHERE \"username\" = ? and \"password\" = ?";
        ResultSet passwordTemp = null;
        PreparedStatement statement = null;
		User.APIResponse.Builder response = User.APIResponse.newBuilder();
        try {
			statement = connection.prepareStatement(query);
        	statement.setString(1, request.getUsername());
        	statement.setString(2, request.getPassword());
			passwordTemp = statement.executeQuery();
			 if(passwordTemp.next()) {
				 System.out.println("Logged in Successfully.");
				 response.setResponseCode(100).setResponseMessage("Logged In.");
				 responseObserver.onNext(response.build());
				 responseObserver.onCompleted();
			 }
			 else {
				 System.out.println("Log in failed, try again");
				 response.setResponseCode(200).setResponseMessage("Invalid username or password");
				 responseObserver.onNext(response.build());
				 responseObserver.onCompleted();
			 }
			
		} catch (SQLException e) {
			System.out.println("Error in SQL");
			response.setResponseCode(1).setResponseMessage("INVALID UPDATE");
			e.printStackTrace();
		}

		/*response.setResponseCode(100).setResponseMessage("Logged In.");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();*/

	}

	@Override
	public void loginCustomer(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
			Connection connection = DaoUtility.getCustomerConnection();
			String query = "SELECT \"password\" FROM public.\"CustomerDetails\"\n"
					+ "WHERE \"username\" = ? and \"password\" = ?";
			ResultSet passwordTemp = null;
			PreparedStatement statement = null;
			User.APIResponse.Builder response = User.APIResponse.newBuilder();
			try {
				statement = connection.prepareStatement(query);
				statement.setString(1, request.getUsername());
				statement.setString(2, request.getPassword());
				passwordTemp = statement.executeQuery();
				if(passwordTemp.next()) {
					System.out.println("Logged in Successfully.");
					response.setResponseCode(100).setResponseMessage("Logged In.");
					responseObserver.onNext(response.build());
					responseObserver.onCompleted();
				}
				else {
					System.out.println("Log in failed, try again");
					response.setResponseCode(200).setResponseMessage("Invalid username or password");
					responseObserver.onNext(response.build());
					responseObserver.onCompleted();
				}

			} catch (SQLException e) {
				System.out.println("Error in SQL");
				response.setResponseCode(1).setResponseMessage("INVALID DATA ENTERED");
				e.printStackTrace();
			}
	}

	@Override
	public void logout(LogoutRequest request, StreamObserver<APIResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.logout(request, responseObserver);
	}
	
	

}
