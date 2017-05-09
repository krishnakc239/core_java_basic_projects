package starpattern;

/**
 * Created by krishna KC on 11/12/2016.
 */
public class pattern3 {
    public static void main(String[] args) {
        int i,j,k;
        for (i=5;i>=1;i--){            //j=5; because pattern is in decreasing order
            for (j=5;j>i;j--){
                System.out.print(" ");
            }
            for (k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        {

        }
    }
}

