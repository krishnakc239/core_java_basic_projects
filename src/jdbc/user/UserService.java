package jdbc.user;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by krishna KC on 12/1/2016.
 */
public class UserService {
    DatabaseConnection db = new DatabaseConnection();

    public User getInformation() {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        System.out.println("Enter Name?");
        user.name = sc.nextLine();
        System.out.println("Enter Password?");
        user.password = sc.nextLine();
        return user;
    }

    public void insert() {

        User user = getInformation();
        String query = "insert into user (name, password) values(?,?)";

        try {
            PreparedStatement pstm = db.getPreparedStatement(query);
            pstm.setString(1, user.name);
            pstm.setString(2, user.password);
            pstm.execute();
            System.out.println("Data inserted!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {

        User user = getInformation();
        String query = "delete from user where name=? and password=?";

        try {
            PreparedStatement pstm = db.getPreparedStatement(query);
            pstm.setString(1, user.name);
            pstm.setString(2, user.password);
            pstm.execute();
            System.out.println("Data Deleted!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update() {

        User user = getInformation();
        String query = "update user set name=?, password=? where name=? and password=?";

        try {
            PreparedStatement pstm = db.getPreparedStatement(query);
            pstm.setString(1, "Pokhara");
            pstm.setString(2, "Pokhara");
            pstm.setString(3, user.name);
            pstm.setString(4, user.password);
            pstm.execute();
            System.out.println("Data Deleted!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void select() {
        String query = "select * from user";

        try {
            PreparedStatement pstm = db.getPreparedStatement(query);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                System.out.println("ID-->" + rs.getInt("id"));
                System.out.println("Name-->" + rs.getString("name"));
                System.out.println("Password-->" + rs.getString("password"));
                System.out.println("=====================================");
            }

            System.out.println("Data Deleted!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}