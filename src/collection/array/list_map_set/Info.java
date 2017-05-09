package collection.array.list_map_set;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class Info {
    String name;
    String address;
    int roll,index;
    public void addInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter students's name :");
        name = sc.next();
        System.out.println("Enter  students's address:");
        address = sc.next();
        System.out.println("Enter  students's roll:");
        roll = sc.nextInt();

    }
    public void chooseMenu(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please choose the searchKey vlaue from from followig meu...." +
                "\n1.By name\n2.By address\n3.By roll");
    }
}
