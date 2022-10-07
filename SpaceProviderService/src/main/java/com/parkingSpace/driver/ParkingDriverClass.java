package com.parkingSpace.driver;

import java.io.IOException;

import com.parkingSpace.service.ParkingService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ParkingDriverClass {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("inside main class");
		Server server = ServerBuilder.forPort(8003).addService(new ParkingService()).build();
		
		server.start();
		System.out.println("server started at port "+server.getPort()); 
		server.awaitTermination();

	} 
}
  