package collection.array.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class Student {
    Set<Info> infos = new HashSet<Info>();
    Scanner sc= new Scanner(System.in);

    public void setStudentInfo() {
        Info is = new Info();
        System.out.println("Enter Student  name :");
        is.name = sc.next();
        System.out.println("Enter Student  address:");
        is.address = sc.next();
        System.out.println("Enter Student  roll:");
        is.roll = sc.nextInt();
        infos.add(is);
    }
    public  void getStudentInfo(){
        Info is;
        is = new Info();
        System.out.println("............College Information....\n Name     address     roll");
        for(Info i:infos){
            System.out.println(i.name+"   "+i.address+"    "+i.roll);
        }
        //info.(ic);
    }
}