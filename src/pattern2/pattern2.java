package pattern2;

/**
 * Created by krishna KC on 11/12/2016.
 */
public class pattern2 {
    public static void main(String args[]){
        int i;
        int j;
        int k ;
        for (i=5; i>=1;i--){
            for (k=1;k<i;k++) {
                System.out.print(" ");
            }
            for (j=5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
