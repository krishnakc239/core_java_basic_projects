package jdbc.user;

/**
 * Created by krishna KC on 11/30/2016.
 */
public class UserMain {

    public static void main(String[] args) {
        UserService service = new UserService();
//        service.insert();
//        service.delete();
//        service.update();
        service.select();

    }
}
