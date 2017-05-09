package customer_care.nepali_language;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/20/2016.
 */
public class LanuagePin {
    Scanner sc=new Scanner(System.in);

    public void chooseService(){
        System.out.println("कृपया भषा परिबर्तन का लागि १ र पिन नम्बर परिवर्तन क लागि अङ्क २ थिच्नुहोस ।");
        int in=sc.nextInt();
        switch(in){
            case 1:
                System.out.println("धन्यवाद तपाइको सिस्टम को भाषा परिवर्तन भएको छ ।");
                break;
            case 2:
                oldPin();
                newPin();
                break;
        }
    }
    public void oldPin() {
        System.out.println("कृपया आफ्नो पुरानो पिन नम्बर थिच्नुहोस ।");
        int opin = sc.nextInt();
        System.out.println("तपाइको पुरानो पिन नम्बर " + opin + "रहेको छ");
    }
    public void newPin(){
        System.out.println("कृपया आफ्नो नया पिन नम्बर थिच्नुहोस ।");
        int npin=sc.nextInt();
        System.out.println("तपाइको पिन परिबर्तन भएको छ र नया पिन्:"+npin+" रहेको छ ।");
    }

}
