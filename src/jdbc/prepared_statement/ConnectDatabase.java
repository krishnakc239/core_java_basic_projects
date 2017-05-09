package jdbc.prepared_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by krishna KC on 12/1/2016.
 */
public class ConnectDatabase {
    final String url="jdbc:mysql://localhost:3306/developer";
    final String username="root";
    final String password="";

    Connection conn= null;
    public ConnectDatabase(){
        try {
            conn= DriverManager.getConnection(url,username,password);
            System.out.println("Dataabse connected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public final PreparedStatement getPreparedStatement(String query){
        PreparedStatement pstmt=null;
        try {
            pstmt=conn.prepareStatement(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pstmt;

    }
}
