package Week6.Assignment3.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {

    private static Connection conn = null;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(
                        "jdbc:mariadb://localhost:3306/currency_converter?user=appuser&password=password");
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static void terminate() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}