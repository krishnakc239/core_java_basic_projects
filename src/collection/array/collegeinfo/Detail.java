package collection.array.collegeinfo;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class Detail {
    String name,address;
    int roll;
    public  void displayMenu(){
        System.out.println("Menu \n 1.College \n 2.Teacher \n 3.Student \n 4.Search");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose menu pressing 1 , 2 or 3 or 4");
    }
}
