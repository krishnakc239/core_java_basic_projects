package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by krishna KC on 11/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers :");
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception error.");
        } catch (InputMismatchException ex) {
            System.out.println("Input mismatch error.");
        }catch(Exception ex){
            System.out.println("Exception occured.");
        }
    }
}
