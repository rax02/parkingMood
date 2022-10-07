package com.dao;

import com.common.CommonService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoUtility {

    public static Connection getProviderConnection() {

        String jdbcUrl = CommonService.properties.getString("userAuthenticationService.db.jdbcUrl");
        String username = CommonService.properties.getString("db.username");
        String password = CommonService.properties.getString("db.password");
        Connection connection = null;

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

    public static Connection getCustomerConnection() {

        String jdbcUrl = CommonService.properties.getString("userAuthenticationService.db.jdbcUrl");
        String username = CommonService.properties.getString("db.username");
        String password = CommonService.properties.getString("db.password");
        Connection connection = null;

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

}
