package collection.array.collegeinfo;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class College {
    //Detail[] dcArray= new Detail[2];
    ArrayList<Detail> dcArray= new ArrayList<Detail>();

    public void setCollegeInfo() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            Detail ds= new Detail();
            System.out.println("Enter name of college :"+(i+1));
            ds.name=sc.next();
            System.out.println("Enter adress of college :"+(i+1));
            ds.address=sc.next();
            dcArray.add(ds);
        }
    }
    public  void getCollegeInfo(){
        System.out.println("..........College Information.......");
        System.out.println("Name      Address ");
        for(Detail d:dcArray){
           // Detail dg=dcArray();
            System.out.println(d.name+"      "+d.address);

        }
    }
}
