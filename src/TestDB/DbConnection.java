package TestDB;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

    /*
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private static final String DATABASE = "jdbc:mysql://localhost/coursejdbc";
    */

    private static Connection conn = null;

    public static Properties loadProperties() {
        Properties props = new Properties();
        try (FileInputStream fs = new FileInputStream("db.properties")) {
            props.load(fs);
            return props;
        } catch (Exception e) {
            throw new ExceptionTest(e.getMessage());
        }
    }

    public static Connection getConnection() {
        Properties props = loadProperties();
        String url = props.getProperty("dburl");
        try {
            conn = DriverManager.getConnection(url, props);
            return conn;
        } catch (SQLException e) {
            throw new ExceptionTest(e.getMessage());
        }
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Connection close!");
            } catch (SQLException e) {
                throw new ExceptionTest(e.getMessage());
            }
        }
    }
}
