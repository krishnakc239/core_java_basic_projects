package pallindrome;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/13/2016.
 */
public class Palindrome {
    public static void main(String args[]) {
        Palindrome p = new Palindrome();
        p.checkPallindrome();

    }
    public void checkPallindrome() {
        int num, revNum = 0, rem = 0, tempNum ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer :");
        num = in.nextInt();
        tempNum = num;
        while (tempNum != 0)

        {
            rem = tempNum % 10;
            revNum = revNum * 10 + rem;
            tempNum /= 10;
        }
        if (revNum == num)

        {
            System.out.println(num + " number is pallindrome");

        } else

        {
            System.out.println(num + " number is not allindrome");

        }
    }

}

