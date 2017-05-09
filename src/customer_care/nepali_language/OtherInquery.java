package customer_care.nepali_language;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/20/2016.
 */
public class OtherInquery  {
    Scanner sc=new Scanner(System.in);

    public void blockSimNumber(){
        System.out.println("कृपया आफ्नो हरायेको सिम को नुम्बर भन्नुहोस ।");
        long simNum=sc.nextLong();
        System.out.println("तपाइको हराएको सिम नम्बर "+simNum+" ब्लक हुने प्रकिया सफल भएको छ ।");
    }

    }

