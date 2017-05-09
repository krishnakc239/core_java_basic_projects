package collection.array.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class College {
    Set<Info> infoc = new HashSet<Info>();
    Scanner sc= new Scanner(System.in);

    public void setCollegeInfo() {
        Info ic = new Info();
        System.out.println("Enter College  name :");
        ic.name = sc.next();
        System.out.println("Enter college  address:");
        ic.address = sc.next();
        infoc.add(ic);
    }
    public  void getCollegeInfo(){
        Info ic;
        ic = new Info();
        System.out.println("............College Information....\n Name     address");
        for(Info i:infoc){
            System.out.println(i.name+"   "+i.address);
        }
        //info.(ic);
    }
}