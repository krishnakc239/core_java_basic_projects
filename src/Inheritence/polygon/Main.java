package Inheritence.polygon;

/**
 * Created by krishna KC on 11/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setProperties();
        rect.area();
        rect.perimeter();

        Square sq= new Square();
        sq.setProperties();
        sq.area();
        sq.perimeter();

    }
}
