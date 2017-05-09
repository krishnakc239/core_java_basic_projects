package collection.array.list_map_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class InterfaceSet {
    Set<Info> infoc = new HashSet<Info>();
    Info inn= new Info();
    Scanner sc= new Scanner(System.in);

    public void setInfo() {
        Info ic = new Info();
        System.out.println("Enter students  name :");
        ic.name = sc.next();
        System.out.println("Enter students  address:");
        ic.address = sc.next();
        System.out.println("enter student roll :");
        ic.roll=sc.nextInt();
        infoc.add(ic);
    }
    public  void getInfo(){
        Info ic;
        ic = new Info();
        System.out.println("............Students Information....\n Name     address    roll");
        for(Info i:infoc){
            System.out.println(i.name+"   "+i.address+"    "+i.roll);
        }
    }
    public void searchByName() {
        System.out.println("enter name to be searched");
        String name = sc.next();
        for (Info a :infoc) {
            if (name.equals(a.name)) {
                System.out.println("Searche matched..\nAnd data is:");
                System.out.println(a.name+" "+a.address+" "+a.roll);
            }
        }
    }

    public void searchByRoll() {
        System.out.println("enter the roll no to be searched:");
        int in = sc.nextInt();
        for (Info b :infoc) {
            if (in == b.roll) {
                System.out.println("Found data...\nAnd data is:");
                System.out.println(b.name+"  "+b.address+" "+b.roll);
            }
        }

    }
    public void searchByAddress(){
        System.out.println("enter address to be searched ...");
        String address=sc.next();
        for(Info c:infoc){
            if(address.equals(c.address)){
                System.out.println("Found data..\nAnd data is:");
                System.out.println(c.address+" "+c.name+" "+c.roll);
            }
        }
    }
    public void displaySearchKey(){
        inn.chooseMenu();
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