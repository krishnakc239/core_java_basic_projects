package Inheritence.polygon;

/**
 * Created by krishna KC on 11/18/2016.
 */
public class Rectangle extends Polygon {
    public void area(){
        System.out.println("Area= "+(length*breadth));
    }
    public void perimeter(){
        System.out.println("Perimetr = "+(2*(length+breadth)));
    }
}
