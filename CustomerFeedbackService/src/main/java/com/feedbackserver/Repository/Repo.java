package com.feedbackserver.Repository;

import com.feedbackserver.common.CommonService;

import java.sql.*;

public class Repo {

        public static Connection RepoConnection()  {
            try {
//                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/parkingmode", "postgres", "root");
                String jdbcUrl = CommonService.properties.getString("feedbackService.db.jdbcUrl");
                String username = CommonService.properties.getString("db.username");
                String password = CommonService.properties.getString("db.password");
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                return connection;
            }catch (Exception exp){
                exp.printStackTrace();
            }
            return null;
        }




        public static boolean add(Integer feedbackid, String name , Integer customerId , Integer bookingid, Integer rating, String writeReview){
            Connection connection = RepoConnection();
            try {

                String query = "Insert into feedbacks(feedbackid, name , customerId ,bookingid,rating,writeReview) values(?,?,?,?,?,?)";

                PreparedStatement statement = connection.prepareStatement(query);

                statement.setInt(1, feedbackid);
                statement.setString(2, name);
                statement.setInt(3, customerId);
                statement.setString(4, bookingid.toString());
                statement.setInt(5, rating);
                statement.setString(6, writeReview);

                statement.executeUpdate();
                return true;
            }catch (Exception e){
                e.printStackTrace();
            }
            return false;
        }


        public static ResultSet get(Integer bookingid) throws SQLException {
            Connection connection = RepoConnection();
            Statement createStatement = connection.createStatement();
            ResultSet executeQuery = createStatement.executeQuery("select * from feedbacks where bookingid ='" + bookingid + "'");
            return executeQuery;


        }


        public static boolean update(Integer bookingid, Integer rating ,String writeReview) throws SQLException {
            Connection connection = RepoConnection();
            Statement createStatement = connection.createStatement();
            createStatement.executeUpdate("update feedbacks set rating = '"+rating+"', writeReview = '"+writeReview+"' where bookingid ='"+bookingid+"'");
            return true;
        }

        public static boolean Delete(Integer bookingid) throws SQLException {
            Connection connection = RepoConnection();
            Statement createStatement = connection.createStatement();
            int executeUpdate = createStatement.executeUpdate("Delete from feedbacks where bookingid ='"+bookingid+"'");
            if(executeUpdate ==1){
                return true;
            }else{
                return false;
            }
        }

        public static ResultSet getAllFeedback() throws SQLException {
            Connection connection = RepoConnection();
            Statement createStatement = connection.createStatement();
            ResultSet execute = createStatement.executeQuery("select * from feedbacks");
            return execute;


        }


    private static Connection getProviderConnection() {

//        String jdbcUrl = "jdbc:postgresql://localhost:5432/parkingmode";
//        String username = "postgres";
//        String password = "root";
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
    public static ResultSet getCustomer(int CustomerId ) {
        Statement createStatement;
        try {
            createStatement = getProviderConnection().createStatement();

            ResultSet executeQuery = createStatement
                    .executeQuery("SELECT * FROM public.\"CustomerDetails\" where User_id='" + CustomerId + "'");
            return executeQuery;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }


}




