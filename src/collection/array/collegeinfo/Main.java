package collection.array.collegeinfo;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/24/2016.
 */
public class Main {
    public static void main(String[] args) {

        DisplayInfo dis=new DisplayInfo();
        Detail dt=new Detail();
        dis.setInf0();
        Scanner sc=new Scanner(System.in);
        String astrisk="*";
        for(int i=0;i<3;i++) {
            System.out.println("Press * to enter into Menu");
            String in=sc.nextLine();
            if(in.compareTo(astrisk)==0) {
                dt.displayMenu();
                dis.dispInfo();
            }else{
                System.out.println("Press * to enter into Menu");
            }
        }
    }
}
