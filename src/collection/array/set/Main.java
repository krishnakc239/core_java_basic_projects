package collection.array.set;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/28/2016.
 */
public class Main {
    College cg = new College();
    Student st= new Student();
    Teacher th= new Teacher();

    public static void main(String[] args) {
        Main m= new Main();
        do {
            m.displayMenu();
            m.insertInfo();
        }while(true);

    }
    public  void insertInfo(){
        Scanner sc= new Scanner(System.in);
        //SetInformation cg= new SetInformation();
        System.out.println("Press 1, 2 ,3 or 4 to enter into menu :");
        int input=sc.nextInt();
        switch(input){
            case 1:
                cg.setCollegeInfo();
                System.out.println("Press 1 for display Information and 2 for exit:");
                int in=sc.nextInt();
                switch(in){
                    case 1:
                        cg.getCollegeInfo();
                        break;
                    case 2:
                        exitOn();
                }
                break;
            case 2:
                th.setTeacherInfo();
                System.out.println("Press 1 for display Information and 2 for exit:");
                int inp=sc.nextInt();
                switch(inp) {
                    case 1:
                        th.getTeacherInfo();
                        break;
                    case 2:
                        exitOn();
                }
                break;
            case 3:
                st.setStudentInfo();
                System.out.println("Press 1 for display Information and 2 for exit:");
                int ins=sc.nextInt();
                switch(ins) {
                    case 1:
                        st.getStudentInfo();
                        break;
                    case 2:
                        exitOn();
                }
                break;
            case 4:
                exitOn();
                break;

        }
    }
    public  void  displayMenu() {
        System.out.println("MENU :\n 1. College Information \n 2.Teacher Information \n 3.Student Information");
    }
    public void choose(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 1 for display Information and 2 for exit:");
        int in=sc.nextInt();
    }
    public  void  exitOn() {
        System.exit(0);
    }
}
