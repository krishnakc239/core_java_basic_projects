package string_compare;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by krishna KC on 12/12/2016.
 */
public class CommonChar {
    public static void main(String[] args) {
        Set<Character> set1= new HashSet<Character>();
        Set<Character> set2= new HashSet<Character>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first String :");
        String firstString=sc.nextLine();
        System.out.println("Enter Second String:");
        String secondString=sc.nextLine();

        for(char c:firstString.toCharArray()){
            set1.add(c);
        }

        for(char c:secondString.toCharArray()){
            set2.add(c);
        }
        set1.retainAll(set2);

        for(char c:set1){
            System.out.print(" "+c);;
        }
        System.out.println("\n Total number of common "+ set1.size());
    }

}
