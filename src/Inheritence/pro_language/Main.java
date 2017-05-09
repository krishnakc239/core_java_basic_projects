package Inheritence.pro_language;

/**
 * Created by krishna KC on 11/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Cplus cp=new Cplus();
        cp.setProperties();
        cp.Intro();
        cp.Bug();
        cp.newFeature();
        System.out.println();

        Java jp= new Java();
        jp.setProperties();
        jp.Intro();
        jp.Bug();
        jp.newFeature();


    }
}
