package constructor;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/15/2016.
 */
class Rectangle {
    float length;
    float breadth;

    public Rectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght :");
        this.length=sc.nextFloat();             // this representa calss variable not local variable of constructor.
        System.out.println("Enter breadth :");  // as length is global variable of class.
        this.breadth = sc.nextFloat();          // if local variable of class and class variavble(instant variable)
    }                                           // name are same then (this) works fine
    public void area(){
    System.out.println("Area="+(length*breadth));
    }
}
class main{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();    // inside Rectangle() construcor call parameter is passed only to
        rect.area();                         // recognise exact constructor /method call.
    }
}
