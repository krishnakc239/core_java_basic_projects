package jdbc.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by krishna KC on 11/30/2016.
 */
public class DatabaseConnection {
    final String username = "root";
    final String password = "";
    final String url = "jdbc:mysql://localhost:3306/demo";

    Connection connection = null;

    public DatabaseConnection(){
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public final PreparedStatement getPreparedStatement(String query) {
        PreparedStatement pstm = null;
        try {
            pstm = connection.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pstm;
    }

}
