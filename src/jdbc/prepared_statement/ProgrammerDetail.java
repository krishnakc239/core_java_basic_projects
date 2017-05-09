package jdbc.prepared_statement;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by krishna KC on 12/1/2016.
 */
public class ProgrammerDetail {
    ConnectDatabase db= new ConnectDatabase();

    public Programmer getInformation(){
        Scanner sc= new Scanner(System.in);
        Programmer programmer= new Programmer();
        System.out.println("Enter name of Programmer:");
        programmer.name=sc.nextLine();
        System.out.println("Enter prefered programming language :");
        programmer.language=sc.nextLine();
        return programmer;
    }
    public void insert(){
        Programmer programmer=getInformation();
        String query="insert into programmer (name,language) values(?,?)";
        try {
            PreparedStatement pstmt = db.getPreparedStatement(query);
            pstmt.setString(1, programmer.name);
            pstmt.setString(2, programmer.language);
            pstmt.execute();
            System.out.println("Data inserted...");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void delete(){
        Programmer programmer=getInformation();
        String query="delete from programmer where name=? and language=?";
        try {
            PreparedStatement pstmt = db.getPreparedStatement(query);
            pstmt.setString(1, programmer.name);
            pstmt.setString(2, programmer.language);
            pstmt.execute();
            System.out.println("user deleted.");
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
    public void update(){
        Programmer programmer=getInformation();
        String query="update programmer set name=?,language=? where name=? and language=?";
        try{
        PreparedStatement pstmt=db.getPreparedStatement(query);
        pstmt.setString(1,"keshav");
        pstmt.setString(2,"java");
        pstmt.setString(3,programmer.name);
        pstmt.setString(4,programmer.language);
            pstmt.execute();
            System.out.println("database table updated.\n");
    }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void select(){
        String query="select * from programmer";
        try{
            PreparedStatement pstmt=db.getPreparedStatement(query);
            ResultSet rs=pstmt.executeQuery();
            System.out.println("-------------------------------------");
            System.out.println("ID       Name       Language");
            System.out.println("-------------------------------------");
            while(rs.next()){
                System.out.println(rs.getInt("id")+"     "+rs.getString("name")+"     "+rs.getString("language"));
                System.out.println("--------------------------------------");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}
