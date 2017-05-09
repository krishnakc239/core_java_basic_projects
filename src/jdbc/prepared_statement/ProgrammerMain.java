package jdbc.prepared_statement;

import java.util.Scanner;

/**
 * Created by krishna KC on 12/1/2016.
 */
public class ProgrammerMain {
    ProgrammerDetail pd= new ProgrammerDetail();

    public static void main(String[] args) {
        ProgrammerMain pm= new ProgrammerMain();
        do {
            pm.chooseMenu();
        }while(true);
    }
    public void chooseMenu(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Choose the operation to be performed==>\n");
        System.out.println("1.Insert\n2.Delete\n3.Update.\n4.Select\n5.Exit");
        System.out.println("Press 1,2,3,4 or 5...");
        int in=sc.nextInt();
        switch (in){
            case 1:
                pd.insert();
                break;
            case 2:
                pd.delete();
                break;
            case 3:
                pd.update();
                break;
            case 4:
                pd.select();
                break;
            case 5:
                System.exit(0);
        }
    }
}
