package constructor.parent_class;

/**
 * Created by krishna KC on 11/16/2016.
 */
public class ParentClass {
    int a;

    ParentClass(int a){

        this.a=a;
    }
}
class ChildClass extends ParentClass {
    int b;

    ChildClass(int a, int b) {
        super(a);
        this.b = b;

    }

    void show() {

    System.out.println("ParentClass'a ="+a);
    System.out.println("ChildClass'b ="+b);
}

}
class GrandChildClass{
        public static void main(String args[]){
        ChildClass object= new ChildClass(8,9);
        object.show();
        }

        }

