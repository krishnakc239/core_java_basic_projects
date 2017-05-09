package factorial;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/11/2016.
 */
public class Factorial {

    public static void main(String args[]){
        Factorial f= new Factorial();
        f.calculateFactorial();



    }
     public void calculateFactorial(){
        System.out.println("enter a number ");
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("the supplied number is : "+n);
        int i;
        int Fact=1;
        for (i=n; i>1;i--){
            Fact = (Fact * i);
        }
        System.out.println("Factorial of  "+n+"\t"+"is"+"\t"+Fact);

    }
}
