package collection.array.collegeinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class Teacher {
    ArrayList<Detail> dtArray=new ArrayList<Detail>();
    public void setTeacherInfo(){
        Scanner sc=new Scanner(System.in);
        for(int j=0;j<2;j++) {
            Detail ds = new Detail();
            System.out.println("Enter name of teacher :" + (j + 1));
            ds.name = sc.next();
            System.out.println("Enter address of teacher " + (j + 1));
            ds.address = sc.next();
            dtArray.add(ds);
        }
    }
    public void getTeacherInfo(){
        System.out.println("..........Teacher Information.......");
        System.out.println("Name     Address ");
        for(Detail d:dtArray){
            System.out.println(d.name+"     "+d.address);

        }
    }

}
