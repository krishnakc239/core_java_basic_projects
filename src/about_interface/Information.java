package about_interface;

/**
 * Created by krishna KC on 11/23/2016.
 */
public interface Information {
    public  void setInformation();
    public void getInformation();
    public default void abc(){//can be overriden tooo so that interface sems like abstract class
        System.out.println("hdfasdfkasd");
    }

}
