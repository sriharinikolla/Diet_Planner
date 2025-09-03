package dietplanner.db;

import java.sql.Connection;
import java.sql.DriverManager;  //create connections
import java.sql.SQLException;

public class DatabaseConnection {
  private static final String URL = "jdbc:mysql://localhost:3306/diet_planner";
  private static final String USER = "root";
  private static final String PASSWORD = "Sqled@2611";

  private static Connection connection;   //shared across app so we dont need to create multiple connections

  public static Connection getConnection() throws SQLException {
    if (connection == null || connection.isClosed()) {
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
      } catch (ClassNotFoundException e) {
        throw new SQLException("MySQL JDBC Driver not found", e);
      }
    }
    return connection;
  }

  public static void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }                                           //free resources and avoid memory leaks
}