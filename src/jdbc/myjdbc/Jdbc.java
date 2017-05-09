package jdbc.myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by krishna KC on 11/30/2016.
 */
public class Jdbc {
    final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/College";

    static final String user = "root";
    static final String pass = "";

    public static void main(String[] args)  {


        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, user, pass);
            System.out.println("Database connected.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            System.out.println("Statement created.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String query="insert into student values(4,'shyam',5)";
        try {
           int count= stmt.executeUpdate(query);
            System.out.println("Data inserted.");
            System.out.println(" Number of rows effected by this query :"+count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}