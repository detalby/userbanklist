package userbanklist.db;



import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static final String URL = "jdbc:mysql://localhost:3306/userlist";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection;


    public static Connection getConnection() {
        try {
            while (connection == null) {
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        return connection;
    }
}
