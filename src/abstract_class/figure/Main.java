package abstract_class.figure;

/**
 * Created by krishna KC on 11/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,5);
        Triangle t= new Triangle(5,15);
        Figure fig;
        fig=r;
        System.out.println("Area is "+fig.area());
        fig=t;
        System.out.println("Area is "+fig.area());
    }
}
