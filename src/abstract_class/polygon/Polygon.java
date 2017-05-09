package abstract_class.polygon;

/**
 * Created by krishna KC on 11/21/2016.
 */
public abstract class Polygon {
    float length;
    float breadth;
    float radius;

    public void setProperties(){
        length=3.142f;
        breadth=2.63f;
        radius=3.63f;
    }
    public abstract void area();// abstract method
    public abstract  void perimeter();//abstract method

}
