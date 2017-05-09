package constructor.constructorexample;

/**
 * Created by krishna KC on 11/16/2016.
 */
public class ConstructEx {
    ConstructEx(){
        System.out.println("Constructor Overloading Example");

    }
    ConstructEx(int x){
        System.out.println("Constructor int-"+x);
    }
    ConstructEx(float x){
        System.out.println("Constructor float-"+x);
    }
    ConstructEx(char x){
        System.out.println("Constructor char-"+x);
    }
}
class Main{
    public static void main(String[] args) {
        ConstructEx obj1= new ConstructEx();
        ConstructEx obj2= new ConstructEx(12);
        ConstructEx obj3= new ConstructEx((float) 10.5);
        ConstructEx obj4= new ConstructEx('A');
    }
}
