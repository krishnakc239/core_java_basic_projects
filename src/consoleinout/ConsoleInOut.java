package consoleinout;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/11/2016.
 */
public class ConsoleInOut {
    public void printInfo(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Name :");
        String name = sc.nextLine();
        System.out.println(name);

    }
}
