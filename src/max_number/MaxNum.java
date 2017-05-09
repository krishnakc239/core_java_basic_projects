package max_number;

import java.util.Scanner;
class MaxNum{

    public static void main(String args[]){

        MaxNum num= new MaxNum();
        num.calculateMaxNum();

    }
    public void calculateMaxNum(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter num1, num2 and num3");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        System.out.println("your supplied numbers are :"+ num1+", \t"+ num2+", \t and  "+ num3);

        if(num1>num2 && num1>num3){

            System.out.println("Max Num is :"+num1);

        }
        else if(num2>num3){
            System.out.println("Max Num is :"+num2);
        }
        else{
            System.out.println("Max Num is :"+num3);
        }

    }




}
