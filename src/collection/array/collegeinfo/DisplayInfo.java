package collection.array.collegeinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class DisplayInfo {
   // ArrayList<College> c= new ArrayList<College>();
    Scanner sc = new Scanner(System.in);
    College cg = new College();
    Student st = new Student();
    Teacher th = new Teacher();
    Detail d=new Detail();

    public void setInf0() {
        cg.setCollegeInfo();
        st.setStudentInfo();
        th.setTeacherInfo();
    }

    public void dispInfo(){
    int input=sc.nextInt();
        switch(input) {
            case 1:
                cg.getCollegeInfo();
                break;
            case 2:
                th.getTeacherInfo();
                break;
            case 3:
                st.getStudentInfo();
                break;
            case 4:
                search();
                break;
            default:
                System.out.println("please enter valid menu number.");
        }
    }
    public void search(){
        System.out.println("Enter name to be searched");
        String name=sc.next();
      if (name.compareTo(d.name)==0){
          System.out.println(d.name);
      }else{
          System.out.println("no record found.");
      }
    }
}
