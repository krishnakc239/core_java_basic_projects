package customer_care;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/19/2016.
 */
public class ChooseLanguage {
    int langNum;

    public void chooseLanguage() {
        System.out.println("कृपया भाषा छनोट गर्नुहोस। \n Please select your preferred language.");
        Scanner in = new Scanner(System.in);
        System.out.println("नेपालि भाषाका लागि १ थिचनुहोस ।");
        System.out.println("Please press number 2 for English language :");
        langNum = in.nextInt();
    }
    public void setLanguage() {
        switch (langNum) {
            case 1:
                System.out.println("तपाइले नेपालि भाषा छनोट गर्नुभयको छ ।");
                break;
            case 2:
                System.out.println("You have chosen English language.");
                break;
            default:
                System.exit(1);
               // System.out.println("please enter only 1 or 2");

        }

    }
}

