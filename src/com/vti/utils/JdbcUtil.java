package TestingSystem.Assignment11.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
    private static Connection connection;

    /**
     * this method is for Get a Connection to Database
     *
     * @param dtbName
     * @return
     * @throws SQLException
     */
    public static Connection getConnection(String dtbName) throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mySQL://localhost:3306/" + dtbName;
            connection = DriverManager.getConnection(url, "root", "root");
        }
        return connection;
    }

    /**
     * this method is for Close a Connection from Database
     *
     * @param connection
     * @return
     * @throws SQLException
     */
    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
