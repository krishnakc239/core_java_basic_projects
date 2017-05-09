package collection.array.normalarray;

import javax.jws.soap.SOAPBinding;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/23/2016.
 */
public class StudentInfo {
    Scanner sc=new Scanner(System.in);
    int i;
    String[] name=new String[5];
    int roll[]=new int[5];
    String[] email=new String[5];
    int age[]=new int[5];



    public void setName(){

        for(i=0;i<name.length;i++){
            System.out.println("Enter the  name of student :"+(i+1));
            name[i]=sc.next();
            System.out.println("Enter the  roll of student :"+(i+1));
            roll[i]=sc.nextInt();
            System.out.println("Enter the  email of student :"+(i+1));
            email[i]=sc.next();
            System.out.println("Enter the  age of student :"+(i+1));
            age[i]=sc.nextInt();

        }
    }
    public void displayInfo(){
        System.out.println("Name     Roll     age     email");
        for(i=0;i<name.length;i++){
            System.out.println(name[i]+"      "+roll[i]+"        "+age[i]+"       "+email[i]);

        }
    }
}
