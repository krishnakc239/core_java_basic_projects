package prime_number;

import java.util.Scanner;
/**
 * Created by krishna KC on 11/11/2016.
 */
public class PrimeNumber {
    public static void main(String args[]){
        PrimeNumber num = new PrimeNumber();
        num.calculatePrime();



    }
    public void calculatePrime(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number ");
        int num= input.nextInt();
        int i,j;
        int temp;
        boolean isPrime=true;

        for(j=1;j<num;j++){
            for(i=2;i<=j/2;i++){
                temp=j%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime)
            System.out.println(j+ " is prime");
        else
            System.out.println(j + " is not prime");



    }


}
