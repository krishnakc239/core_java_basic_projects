package access_modifier.public1.public1b;

import access_modifier.public1.public1a.FromPublic;

/**
 * Created by krishna KC on 11/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        FromPublic ob=new FromPublic();
        ob.displayFromPublic();
        Public1b ob1b=new Public1b();
        ob1b.displayFromPublic1b();
    }
}
