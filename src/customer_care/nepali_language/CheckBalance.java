package customer_care.nepali_language;
import java.util.Scanner;
/**
 * Created by krishna KC on 11/20/2016.
 */
public class CheckBalance {
    Scanner sc = new Scanner(System.in);
    public void checkRechNumber() {
        long num = sc.nextLong();
        if (num == 12345) {
            System.out.println("बधाइ छ तपाइको रिचार्ज प्रकृया सफल भएको छ । /n अब तपाइको नया ब्यालेन्स् रु ९८।०३ रहेको छ ।");
        } else {
            System.out.println("माफ गर्नुहोल तपाइले दिनुभएको सुचना मिलेन । पुन प्रयास गर्नुहोला ।");
        }
    }

}
