package pattern;

/**
 * Created by krishna KC on 11/12/2016.
 */
public class pattern4 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <(2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (i = 4; i >= 1; i--) {
            for (j = i; j <= 4; j++) {
                System.out.print(" ");
            }
            for (k = (2 * i); k > 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}