package com.parkingSpace.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.postgresql.util.PSQLException;

import com.ParkingSpace.grpc.ParkingSpaceGrpc.ParkingSpaceImplBase;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.APIResponse.Builder;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.SlotNumber;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.VType;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.carAndBikeSlot;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.empty;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerUserid;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerlocation;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.setprice;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot1;
import com.ParkingSpace.grpc.ParkingSpaceOuterClass.updateSlot;
import com.parkingSpace.repository.SpaceProviderRepository;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class ParkingService extends ParkingSpaceImplBase {
	Connection connection;
	boolean result = false;
	SpaceProviderRepository repo = new SpaceProviderRepository();

	@Override
	public void addParkingSpace(slot1 request, StreamObserver<APIResponse> responseObserver) {

		Integer slotNumber = request.getSlotNumber();
		String vehicleType = request.getVehicleType();
		long price = request.getPrice();

		try {
			Builder response = APIResponse.newBuilder();

			if (repo.getProvider(request.getProviderUserId()).next() == true) {

				if (price > 0) {
					if (vehicleType.toUpperCase().equals("CAR") == true
							|| vehicleType.toUpperCase().equals("BIKE") == true) {
						if (slotNumber != null && vehicleType != null) {
							this.result = repo.add(request.getProviderUserId(), slotNumber, vehicleType, price);
							if (this.result == true) {
								response.setResponseCode(0).setResponseMessage("ParkingSpace Added Successfully");

							} else if (this.result == false) {
								response.setResponseCode(2).setResponseMessage("check your database implementation");
							}
						} else if ((slotNumber == null || vehicleType == null)) {
							response.setResponseCode(1).setResponseMessage(" Information can not be null");
						}
					} else if (vehicleType.toUpperCase().equals("CAR") == false
							|| vehicleType.toUpperCase().equals("BIKE") == false) {
						response.setResponseCode(2).setResponseMessage("Enter a valid vehicle type");
					}
				} else {
					response.setResponseCode(5).setResponseMessage("price can't be lesser than zero");
				}
			} else {
				response.setResponseCode(5).setResponseMessage("provider not register yet");
			}
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		} catch (PSQLException e) {
			APIResponse.Builder response = APIResponse.newBuilder();
			response.setResponseMessage("slot number already registered").setResponseCode(4);
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			repo.closeConnection();
		}

	}

	boolean updateResult = false;

	@Override
	public void updateByID(updateSlot request, StreamObserver<APIResponse> responseObserver) {
		int num = request.getNum();
		Integer currentSlotNumber = request.getCurrentSlotNumber();
		String vehicleType = request.getVehicleType();
		Integer newSlotNumber = request.getNewSlotNumber();
		Long price = request.getPrice();
		Integer providerUserId = request.getProviderUserId();
		Builder response = APIResponse.newBuilder();
		try {

			if (repo.getProvider(request.getProviderUserId()).next() == true) {

				ResultSet byNum = repo.getByNum(providerUserId, currentSlotNumber);
				if (byNum.next() == true) {

					if ((price != null && currentSlotNumber != null && vehicleType != null)) {
						this.updateResult = repo.update(num, providerUserId, newSlotNumber, currentSlotNumber,
								vehicleType, price);
						response.setResponseCode(0).setResponseMessage("Parking Space updated Successfully");

					} else if ((price == null || currentSlotNumber == null || vehicleType == null)) {
						response.setResponseCode(1).setResponseMessage(" Information can not be null");

					}
				} else {
					response.setResponseCode(2).setResponseMessage("check your database implementation");

				}
			} else {
				response.setResponseCode(5).setResponseMessage("provider not register yet");
			}

			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			repo.closeConnection();

		}
	}

	@Override
	public void getBySlotNumber(SlotNumber request, StreamObserver<slot> responseObserver) {

		Integer slotNumber = request.getSlotNum();
		Integer providerUserId = request.getProviderUserId();
	
		com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.Builder response = slot.newBuilder();
		try {
			if(repo.getProvider(providerUserId).next()==false){
				response.setResponse(APIResponse.newBuilder().setResponseMessage("Provider not register yet")
						.setResponseCode(1));
				responseObserver.onNext(response.build());
			}else if((repo.getByNum(providerUserId, slotNumber)).next()==false) {
				response.setResponse(APIResponse.newBuilder().setResponseMessage("slot not register yet")
						.setResponseCode(1));
				responseObserver.onNext(response.build());
			}
			if (slotNumber != null && providerUserId != null) {
				
				
				ResultSet getresult = repo.getByNum(providerUserId, slotNumber);
					boolean next = getresult.next();
							while (next==true) {
								long price = getresult.getLong("price");
								int slot = getresult.getInt("slotNumber");
								String vehicleType = getresult.getString("VehicleType");
								response.setProviderUserId(providerUserId).setPrice(price)
										.setSlotNumber(slot).setVehicleType(vehicleType);
								response.setResponse(
										APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));
								responseObserver.onNext(response.build());
								break;

							}
							
						} 
				 else {
					response.setResponse(APIResponse.newBuilder().setResponseMessage("can not be null")
							.setResponseCode(1));
					responseObserver.onNext(response.build());

				}
			
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			responseObserver.onCompleted();
			repo.closeConnection();

		}

	}

	@Override
	public void deleteBySlotNumber(SlotNumber request, StreamObserver<APIResponse> responseObserver) {

		Integer slotNumber = request.getSlotNum();
		Integer providerUserId = request.getProviderUserId();
		try {
			APIResponse.Builder response = APIResponse.newBuilder();

			if (repo.getProvider(request.getProviderUserId()).next() == true) {
				boolean deleteResult = repo.delete(providerUserId, slotNumber);

				if (deleteResult == true) {
					response.setResponseCode(0).setResponseMessage("ParkingSpace deleted Successfully");
				} else if (deleteResult == false) {
					response.setResponseCode(2).setResponseMessage("slot number not present");
				}
			} else {
				response.setResponseCode(5).setResponseMessage("provider not register yet");
			}
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			repo.closeConnection();
		}

	}

	@Override
	public void getAllSlotListByProviderUserid(providerUserid request, StreamObserver<slot> responseObserver) {
		

			Integer providerUserId = request.getProviderUserId();
			com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.Builder response = slot.newBuilder();

		
				try {
					if (providerUserId != null) {
				if (repo.getAllByProviderId(request.getProviderUserId()).next() == true) {

					ResultSet getAllresult = repo.getAllByProviderId(providerUserId);
					while (getAllresult.next() == true) {
						long price = getAllresult.getLong("price");
						int slot = getAllresult.getInt("slotNumber");
						String vehicleType = getAllresult.getString("VehicleType");
						int pUserId = getAllresult.getInt("providerUserId");
						
						response.setProviderUserId(pUserId).setPrice(price).setSlotNumber(slot)
								.setVehicleType(vehicleType)
						.setResponse(APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));
						responseObserver.onNext(response.build());
					}
				} else if (repo.getAllByProviderId(request.getProviderUserId()).next() == false) {
					response.setResponse(APIResponse.newBuilder().setResponseMessage("provider not register yet")
							.setResponseCode(1));
					responseObserver.onNext(response.build());
				}
			} else{
				response.setResponse(APIResponse.newBuilder().setResponseMessage("provider cat not be null").setResponseCode(1));
				responseObserver.onNext(response.build());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			
			responseObserver.onCompleted();
			repo.closeConnection();
		}
	}
	//

//
	@Override
	public void updatePrice(setprice request, StreamObserver<APIResponse> responseObserver) {
		long price = request.getPrice();
		String choice = request.getChoice();
		Integer providerUserId = request.getProviderUserId();
		APIResponse.Builder response = APIResponse.newBuilder();
		if (choice.toUpperCase().equals("CAR")) {
			try {
				int result = repo.updatePrice(providerUserId, price, choice);
				if (result == 1)
					response.setResponseCode(0).setResponseMessage("Car price changed successfully");
				if (result == 0)
					response.setResponseCode(1).setResponseMessage("Failed");
				if (result == 2) {
					response.setResponseCode(1).setResponseMessage("choice invalid");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				responseObserver.onNext(response.build());
				responseObserver.onCompleted();
			}
		}
		if (choice.toUpperCase().equals("BIKE")) {
			try {
				int result = repo.updatePrice(providerUserId, price, choice);
				if (result == 1)
					response.setResponseCode(0).setResponseMessage("Bike price changed successfully");
				else if (result == 0)
					response.setResponseCode(1).setResponseMessage("Failed");
				if (result == 2) {
					response.setResponseCode(1).setResponseMessage("choice invalid");
				}
				responseObserver.onNext(response.build());
				responseObserver.onCompleted();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				repo.closeConnection();
				responseObserver.onNext(response.build());
				responseObserver.onCompleted();

			}
		} else {
			response.setResponseCode(1).setResponseMessage("check spell");
			responseObserver.onNext(response.build());
			responseObserver.onCompleted();
		}
	}

	@Override
	public void getAllSlotList(empty request, StreamObserver<slot> responseObserver) {

		com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.Builder response = slot.newBuilder();
		try {
			ResultSet getAllresult = repo.getAllDetails();
			if (getAllresult.next() == true) {
				while (getAllresult.next() == true) {
					long price = getAllresult.getLong("price");
					int slot = getAllresult.getInt("slotNumber");
					String vehicleType = getAllresult.getString("VehicleType");
					int providerUserId = getAllresult.getInt("providerUserId");

					com.ParkingSpace.grpc.ParkingSpaceOuterClass.slot.Builder allSlot = response
							.setProviderUserId(providerUserId).setPrice(price).setSlotNumber(slot)
							.setVehicleType(vehicleType);
					response.setResponse(APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));

					responseObserver.onNext(response.build());

				}

			} else {
				response.setResponse(
						APIResponse.newBuilder().setResponseMessage("register  a slot first").setResponseCode(1));
				responseObserver.onNext(response.build());
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			responseObserver.onCompleted();
			repo.closeConnection();
			
		}
	}

	@Override
	public void filterByVtype(VType request, StreamObserver<carAndBikeSlot> responseObserver) {
		String vehicleTypechoice = request.getVehicleTypechoice();
		Integer providerUserId = request.getProviderUserId();

		carAndBikeSlot.Builder response = carAndBikeSlot.newBuilder();
		try {
			if (repo.getProvider(request.getProviderUserId()).next() == true) {
				if (vehicleTypechoice.toUpperCase().equals("CAR") == true|| vehicleTypechoice.toUpperCase().equals("BIKE") == true) {
					ResultSet getAllresult = repo.getByVehicleType(providerUserId, vehicleTypechoice);
					while (getAllresult.next() == true) {
						long price = getAllresult.getLong("price");
						int slot = getAllresult.getInt("slotNumber");
						String vehicleType = getAllresult.getString("VehicleType");

						response.setPrice(price).setSlotNumber(slot)
								.setVehicleType(vehicleType).setProviderUserId(providerUserId);
						response.setResponse(APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));
						responseObserver.onNext(response.build());
					}
					response.setResponse(APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));
					responseObserver.onNext(response.build());
				} else {
					response.setResponse(APIResponse.newBuilder().setResponseMessage("enter a valid vehicle type")
							.setResponseCode(1));
					responseObserver.onNext(response.build());
				}
			} else if (repo.getProvider(request.getProviderUserId()).next() == false){
				response.setResponse(
						APIResponse.newBuilder().setResponseMessage("provider not register yet").setResponseCode(1));
				responseObserver.onNext(response.build());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			responseObserver.onCompleted();
			repo.closeConnection();
		}
	}

	@Override
	public void findByLocation(providerlocation request, StreamObserver<providerDetails> responseObserver) {
		String location = request.getLocation();
		System.out.println(location);
				try {
					com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails.Builder response = providerDetails.newBuilder();
					ResultSet findByLocation = repo.findByLocation(location);
					if (repo.findByLocation(location).next() == true) {
							while(findByLocation.next()==true) {
								 String name = findByLocation.getString("fullName");
					             String uName = findByLocation.getString("username");
					             String emailId = findByLocation.getString("email_id");
					             String address = findByLocation.getString("address");
					            com.ParkingSpace.grpc.ParkingSpaceOuterClass.providerDetails.Builder setResponse = response.setFullName(name).setUsername(uName).setEmailid(emailId).setAddress(address).setResponse(APIResponse.newBuilder().setResponseMessage("success").setResponseCode(0));
								
								responseObserver.onNext(setResponse.build());
							}
					}else if  (repo.findByLocation(location).next() == false){
						response.setResponse(
								APIResponse.newBuilder().setResponseMessage("service not available in your given location").setResponseCode(1));
						responseObserver.onNext(response.build());
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					responseObserver.onCompleted();
					
					
				}
			}
	}
