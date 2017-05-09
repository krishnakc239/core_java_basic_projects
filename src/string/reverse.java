package string;

import java.util.Scanner;

/**
 * Created by krishna KC on 12/5/2016.
 */
public class reverse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter string");
        String firstString=sc.nextLine();
       // char[] secondString=new char[firstString.length()];
        for(int count=firstString.length()-1;count>=0;count--){
            System.out.print(firstString.charAt(count));
        }
       /* System.out.println("\n");
        firstString.getChars(0,firstString.length(),secondString,0);
        for(char charArray:secondString){
            System.out.print(charArray);*/

    }
}
