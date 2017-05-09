package constructor.polymorphism;

/**
 * Created by krishna KC on 11/16/2016.
 */
public class Polygon {
    float length;
    float breadth;
    float radius;

    public Polygon(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public Polygon(float r) {
        radius = r;
    }
    public void area(String polygon){
        System.out.println("Area of Rect = "+(length*breadth));

    }
    public void area(){
        System.out.println("Area of circle is = "+(3.14*radius*radius));
    }
}

