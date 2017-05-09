package abstract_class.figure;

/**
 * Created by krishna KC on 11/21/2016.
 */
public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
    abstract double area();
}
