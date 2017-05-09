package collection.array.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class Teacher {
    Set<Info> infot = new HashSet<Info>();
    Scanner sc= new Scanner(System.in);

    public void setTeacherInfo() {
        Info it = new Info();
        System.out.println("Enter Teacher  name :");
        it.name = sc.next();
        System.out.println("Enter Teacher  address:");
        it.address = sc.next();
        infot.add(it);
    }
    public  void getTeacherInfo(){
        Info it;
        it = new Info();
        System.out.println("............College Information....\n Name     address");
        for(Info i:infot){
            System.out.println(i.name+"   "+i.address+"    ");
        }
        //info.(ic);
    }
}