package config.db.postgres;

import common.CommonService;
import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

@Slf4j
public class DBUtil {

    public static Connection getDBConnection() {


        String jdbcUrl = CommonService.properties.getString("slotBookingService.db.jdbcUrl");
        String username = CommonService.properties.getString("db.username");
        String password = CommonService.properties.getString("db.password");
        Connection connection = null;

        try {
            Class.forName(CommonService.properties.getString("db.driver"));
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            log.info("Connected to : {}", jdbcUrl);

        } catch (SQLException e) {
            log.error("Connection failed at : {}", jdbcUrl);
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return connection;

    }
}
