package collection.array.studentinfo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class StudentService {
    ArrayList<Student> students=new ArrayList<Student>();
  // Student[] students=new Student[2];
    public void setInfo(){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<2;i++){
            Student student=new Student();
            System.out.println("Enter name");
            student.name=sc.nextLine();
            System.out.println("Enter address");
            student.address=sc.nextLine();
            students.add(student);
            //students.add(student);

        }
    }
   public void getInfo(){
       //System.out.println(students.toString());
        for(Student st:students){
            System.out.println(st.name+"     "+st.address);
        }
    }

}
