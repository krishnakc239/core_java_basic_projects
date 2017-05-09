package min_number;

import java.util.Scanner;
/**
 * Created by krishna KC on 11/11/2016.
 */
public class MinNum {
    public static void main(String args[]){

        MinNum num= new MinNum();
        num.calculateMinNum();

    }
    public void calculateMinNum(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1, num2 and num3");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println("your supplied numbers are :"+ num1+", \t"+ num2+", \t and  "+ num3);

        if(num1<num2 && num1<num3){

            System.out.println("Min Num is :"+num1);

        }
        else if(num2<num3){
            System.out.println("Min Num is :"+num2);
        }
        else{
            System.out.println("Min Num is :"+num3);
        }

    }

}
