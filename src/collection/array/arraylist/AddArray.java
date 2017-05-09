package collection.array.arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 11/25/2016.
 */
public class AddArray {
    ArrayList<String> stringList = new ArrayList<String>();

    public void addString() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("enter index value :");
            int index = sc.nextInt();
            System.out.println("enter name :");
            String name = sc.next();
            stringList.add(index, name);
        }
    }

    public void displayString() {
        System.out.println("the name list goes like this... \n" + stringList.toString());
    }

    public void removeString() {
        stringList.remove(2);
        //System.out.println(stringList.toString());
        for (String name : stringList) {
            System.out.println(name);

        }

    }
}
