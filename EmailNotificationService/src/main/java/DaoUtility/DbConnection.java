package DaoUtility;

import common.CommonService;

import java.sql.*;

public class DbConnection {
    private static Connection getCustomerConnection() {

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
    public static ResultSet getAllCustomerEmailId() {
        Statement createStatement;
        try {
            createStatement = getCustomerConnection().createStatement();

            ResultSet executeQuery = createStatement
                    .executeQuery("SELECT email_id FROM public.\"CustomerDetails\" ");
            return executeQuery;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {

        try{
        ResultSet customerList= getAllCustomerEmailId();
            while(customerList.next()){
                String emailId = customerList.getString("email_id");
                System.out.println(emailId);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
