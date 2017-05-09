package fabbinocee;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/13/2016.
 */
public class Fabbinocee {
    public static void main(String args[]){
        Fabbinocee f= new Fabbinocee();
        f.fabDisplay();

        }
        public void fabDisplay(){
            int n1=0, n2=1, n3, i, count;
            Scanner in= new Scanner(System.in);
            System.out.println("Entr value upto where fabonacee series is to be calculated");
            count=in.nextInt();
            System.out.print(n1+" "+n2);
            for(i=2;i<count;i++){
                n3=n1+n2;
                System.out.print(" "+n3);
                n1=n2;
                n2=n3;


    }

    }
}
