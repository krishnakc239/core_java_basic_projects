package about_interface;

/**
 * Created by krishna KC on 11/23/2016.
 */
public class Students implements Information {

    @Override
    public void setInformation() {
        System.out.println("from set information");
    }

    public void getInformation(){
        System.out.println("from get information");
    }
   // public void abc(){
        //String name="Krishna";
        //System.out.println(name);
    //}
}
