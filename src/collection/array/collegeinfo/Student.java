package collection.array.collegeinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class Student {
    //Detail[] dsArray=new Detail[2];
    ArrayList<Detail> dsArray=new ArrayList<Detail>();
    public void setStudentInfo(){
        Scanner sc=new Scanner(System.in);
    for(int j=0;j<2;j++) {
        Detail ds = new Detail();
        System.out.println("Enter name of Student :" + (j + 1));
        ds.name = sc.next();
        System.out.println("Enter roll of student " + (j + 1));
        ds.roll = sc.nextInt();
        System.out.println("Enter address of student " + (j + 1));
        ds.address = sc.next();
        dsArray.add(ds);
    }
    }
    public void getStudentInfo(){
        System.out.println("..........Student Information.......");
        System.out.println("Name     Roll     Address");
        for(Detail d:dsArray){
            System.out.println(d.name+"     "+d.roll+"       "+d.address);
        }
    }

}
