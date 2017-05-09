package collection.array.list_map_set;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class Main {
    InterfaceList lst= new InterfaceList();
    InterfaceMap mp= new InterfaceMap();
    InterfaceSet st= new InterfaceSet();
    Info info= new Info();
    Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        Main m= new Main();
        do {
            m.mainMenu();
        }while(true);
    }
    public void mainMenu(){
        System.out.println("1.List \n2.Map \n3.Set \n4.exit");
        System.out.println("Press 1, 2, 3 or 4");
        int input=sc.nextInt();
        switch(input){
            case 1:
                System.out.println("You are transformed to List interface method :");
                lst.setInfo();
                displayContent();
                int in= sc.nextInt();
                switch(in) {
                    case 1:
                    lst.getInfo();
                        break;
                    case 2:
                        lst.displaySearchKey();
                        break;
                    case 3:
                        System.exit(0);
                        default:
                            System.out.println("Please enter either 1 , 2 or 3 number:");
                }
                break;
            case 2:
                System.out.println("You are transformed to Map interface method :");
                mp.setInfo();
                displayContent();
                int inp= sc.nextInt();
                switch(inp) {
                    case 1:
                        mp.getInfo();
                        break;
                    case 2:
                        mp.displaySearchKey();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please enter either 1 , 2 or 3 number:");
                }
                break;
            case 3:
                System.out.println("You are transformed to Set interface method :");
                st.setInfo();
                displayContent();
                int inpt= sc.nextInt();
                switch(inpt) {
                    case 1:
                        st.getInfo();
                        break;
                    case 2:
                        st.displaySearchKey();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please enter either 1 or 2 number:");
                }
                break;
            case 4:
                System.out.println("System is exiting now ...Good bye .");
                System.exit(0);
                break;

        }
    }
    public void displayContent(){
        System.out.println("Press 1 to display the Information or 2 to search and 3 to  exit :");

    }
}
