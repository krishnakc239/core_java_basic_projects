package abstract_class.figure;

/**
 * Created by krishna KC on 11/21/2016.
 */
public class Triangle extends Figure {
    Triangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Inside area of Triangle");
        return (dim2*dim1/2);
    }

}
