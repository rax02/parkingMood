package com.parkingSpace.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.postgresql.util.PSQLException;

import com.mysql.cj.protocol.Resultset;

import common.CommonService;
import io.grpc.StatusRuntimeException;

public class SpaceProviderRepository {

	private static Connection connection;

	static Connection connection() throws SQLException {
		try {
			String jdbcUrl = CommonService.properties.getString("spaceProviderService.db.jdbcUrl");
	        String username = CommonService.properties.getString("db.username");
	        String password = CommonService.properties.getString("db.password");
			connection = DriverManager.getConnection(jdbcUrl, username, password);
			return connection;
		} catch (PSQLException e) {

		}
		return connection;

	}

	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean add(Integer providerUserId, Integer slotNumber, String vehicleType, long price)
			throws SQLException {
		Statement createStatement = connection().createStatement();
		try {
			int executeUpdate = createStatement.executeUpdate(
					"insert into spaceProvider(providerUserId,slotNumber,VehicleType,price) values('" + providerUserId
							+ "','" + slotNumber + "','" + vehicleType.toUpperCase() + "','" + price + "')");
			if (executeUpdate == 1)
				return true;
			else
				return false;
		} catch (PSQLException e) {
			throw new PSQLException("duplicate key", null);
		}

	}

	public boolean delete(Integer providerUserId, Integer slotNumber) throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		int executeUpdate = createStatement.executeUpdate("delete from spaceProvider where slotNumber='" + slotNumber
				+ "' and providerUserId= '"+providerUserId+"'");
		if (executeUpdate == 1)
			return true;
		else
			return false;
	}

	public boolean update(int num, Integer spaceProviderUId, Integer newSlotNumber, Integer oldslotNumber,
			String vehicleType, long price) throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		int executeUpdate = 0;

		switch (num) {

		case 2:
			executeUpdate = createStatement.executeUpdate("update spaceProvider SET slotNumber= '" + newSlotNumber
					+ "' where slotNumber= '" + oldslotNumber + "' and providerUserId= '" + spaceProviderUId + "'");
			break;
		case 3:
			executeUpdate = createStatement.executeUpdate(
					"update spaceProvider SET vehicletype= '" + vehicleType.toUpperCase() + "' where slotNumber='"
							+ oldslotNumber + "' and providerUserId= '" + spaceProviderUId + "'");
			break;
		case 4:
			executeUpdate = createStatement.executeUpdate(
					"update spaceProvider SET price= '" +price+ "' where slotNumber='"
							+ oldslotNumber + "' and providerUserId= '" + spaceProviderUId + "'");
			break;
		
		default:
			System.out.println("enter a valid choice");
		}

		if (executeUpdate == 1)
			return true;
		else
			return false;

	}

	public ResultSet getByNum(Integer spaceProviderUId, Integer slotNumber)
			throws SQLException, PSQLException, StatusRuntimeException {
		Statement createStatement = connection().createStatement();

		ResultSet executeQuery = createStatement.executeQuery("select * from spaceProvider where slotNumber='"
				+ slotNumber + "' and providerUserId= '" + spaceProviderUId + "'");

		return executeQuery;
	}

	public ResultSet getAllByProviderId(Integer spaceProviderUId) throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		ResultSet executeQuery = createStatement
				.executeQuery("select * from spaceProvider where providerUserId= '" + spaceProviderUId + "'");

		return executeQuery;
	}
	public ResultSet getAllDetails() throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		ResultSet executeQuery = createStatement
				.executeQuery("select * from spaceProvider ");

		return executeQuery;
	}

	public static int updatePrice(Integer spaceProviderUId, long price, String choices)
			throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		String upperCase = choices.toUpperCase();
		System.out.println(upperCase);
		if (price > 0) {

			if (upperCase.equals("BIKE") == true) {
				createStatement.executeUpdate("update spaceprovider SET price= '" + price + "' where providerUserId= '"
						+ spaceProviderUId + "' and vehicletype='" + upperCase + "'");
				return 1;
			}
			else if (upperCase.equals("CAR") == true) {
				createStatement.executeUpdate("update spaceprovider SET price= '" + price + "' where providerUserId= '"
						+ spaceProviderUId + "' and vehicletype='" + upperCase + "'");
				return 1;
			} else {
				return 2;
			}
		}
		return 0;

	}

	public static ResultSet getByVehicleType(Integer spaceProviderUId, String choice)
			throws SQLException, PSQLException {
		Statement createStatement = connection().createStatement();
		ResultSet executeQuery = null;
		String upperCase = choice.toUpperCase();
		if (upperCase.equals("CAR") == true) {
			executeQuery = createStatement.executeQuery("select * from spaceProvider where vehicleType='" + upperCase
					+ "' and providerUserId= '"+spaceProviderUId+"'");
			return executeQuery;
		}
		if (upperCase.equals("BIKE") == true) {
			executeQuery = createStatement.executeQuery("select * from spaceProvider where vehicleType='" + upperCase
					+ "' and providerUserId= '"+spaceProviderUId+"'");

			return executeQuery;
		}
		return null;

	}

	private static Connection getProviderConnection() {

		String jdbcUrl = CommonService.properties.getString("userAuthenticationService.db.jdbcUrl");
        String username = CommonService.properties.getString("db.username");
        String password = CommonService.properties.getString("db.password");
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(jdbcUrl, username, password);
			System.out.println("Connected to database.");

		} catch (SQLException e) {
			System.out.println("Cannot connect to database in PostgreSQL");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		return connection;

	}

	public static ResultSet getProvider(int userID) {
		Statement createStatement;
		try {
			createStatement = getProviderConnection().createStatement();

			ResultSet executeQuery = createStatement// ProviderDetails
					.executeQuery("SELECT * FROM \"ProviderDetails\"" + " where \"ProviderDetails\".\"userId\"='"
							+ userID + "'");
			return executeQuery;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
	
	public static  ResultSet findByLocation(String location) throws SQLException {
		
		Statement createStatement = getProviderConnection().createStatement();

			ResultSet executeQuery = createStatement
					.executeQuery("SELECT * FROM \"ProviderDetails\"" + " where \"ProviderDetails\".\"address\"='"
							+ location + "'");
			return executeQuery;
		
	}

	public static void main(String[] args) throws SQLException {

		ResultSet provider = getProvider(104);
		int updatePrice = updatePrice(104, 10, "car");
		System.out.println(updatePrice);
		ResultSet findByLocation;
		try {
			findByLocation = findByLocation("addressA");
		
		while(findByLocation.next()) {
			 String name = findByLocation.getString("fullName");
             String uName = findByLocation.getString("username");
             int id = findByLocation.getInt("userId");
             String emailId = findByLocation.getString("email_id");
             String password = findByLocation.getString("password");
             String address = findByLocation.getString("address");
             System.out.println(name+" "+uName+" "+id+" "+emailId+" "+password+" "+address);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
