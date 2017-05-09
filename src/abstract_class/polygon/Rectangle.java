package abstract_class.polygon;

/**
 * Created by krishna KC on 11/21/2016.
 */
public class Rectangle extends Polygon {
    @Override
    public void setProperties() {
        super.setProperties();
            }

    public void area(){

        System.out.println("Area of Rectangle is :"+(length*breadth));

    }
    public void perimeter(){

        System.out.println("perimeter of Rectangle is :"+(2*(this.length+this.breadth)));
    }



}
