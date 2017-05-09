package constructor;

/**
 * Created by krishna KC on 11/15/2016.
 */
public class ConstructorExample {
    public static void main(String args[]){
        ConstructorExample ex = new ConstructorExample();//passing "abc" string parameter to constructor ConstructorExample
        ex.printInfo();
    }
    public void printInfo(){
        System.out.println("This   is method");
    }
    /*public ConstructorExample(String value){            // concept of function overriding
        System.out.println("This is constructor");
    }*/
    public ConstructorExample(){                        // concept of function overloading

    }


}
