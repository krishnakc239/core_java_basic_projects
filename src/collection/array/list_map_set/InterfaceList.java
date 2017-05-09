package collection.array.list_map_set;

import collection.array.set.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class InterfaceList {
    ArrayList<Info> lst = new ArrayList<Info>();
    Info info = new Info();
    Scanner sc = new Scanner(System.in);

    public void setInfo() {
        Info in = new Info();
        in.addInfo();
        lst.add(in);
    }

    public void getInfo() {

        //System.out.println("Student info:" + lst.toString());
        System.out.println("Student info goes here...........\n Name     Address     Roll");
        for (Info inf : lst) {
            System.out.println(inf.name + "    " + inf.address + "    " + inf.roll);
        }

    }

    public void searchByName() {
        System.out.println("enter name to be searched");
        String name = sc.next();
        for (Info a : lst) {
            if (name.equals(a.name)) {
                System.out.println("Searche matched..\nAnd data is:");
                System.out.println(a.name+" "+a.address+" "+a.roll);
            }
        }
    }

    public void searchByRoll() {
        System.out.println("enter the roll no to be searched:");
        int in = sc.nextInt();
        for (Info b : lst) {
            if (in == b.roll) {
                System.out.println("Found data...\nAnd data is:");
                System.out.println(b.name+"  "+b.address+" "+b.roll);
            }
        }

    }
    public void searchByAddress(){
        System.out.println("enter address to be searched ...");
        String address=sc.next();
        for(Info c:lst){
            if(address.equals(c.address)){
                System.out.println("Found data..\nAnd data is:");
                System.out.println(c.address+" "+c.name+" "+c.roll);
            }
        }
    }
    public void displaySearchKey(){
        info.chooseMenu();
        int in=sc.nextInt();
        switch(in){
            case 1:
                searchByName();
                break;
            case 2:
                searchByAddress();
                break;
            case 3:
                searchByRoll();
                break;

        }
    }
}