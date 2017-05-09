package abstract_class.figure;

/**
 * Created by krishna KC on 11/21/2016.
 */
public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area of Rectangle");
        return dim1*dim2;
    }
}
