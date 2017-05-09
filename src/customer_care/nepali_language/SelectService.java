package customer_care.nepali_language;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/20/2016.
 */
public class SelectService {
    CheckBalance cb=new CheckBalance();
    Scanner sc = new Scanner(System.in);
    OtherInquery oi = new OtherInquery();
    LanuagePin lp=new LanuagePin();
    public void displayMenu() {
        System.out.println("कृपया ब्यालेन्स् बुजनका लागि: १\n" +
                           "रिचार्ज् गर्नका लागि :२ \n" +
                           " सिकायतका लागि :३\n" +
                           " अन्य सेवा जस्तै सिम हरायको बारे :४\n " +
                           "सोधपुछ का लागि :५\n " +
                           "भाषा का लागि :६ \n" +
                           "अन्य सहयोग का लागि :० \n" +
                           "कुनै पनि बेला मुख्य मेनु मा फर्खन :*" +
                           " अन्क थिचनुहोस्।");
    }

    public void checkKey() {

        char keyPressed = (char)sc.next().getBytes()[0];

        switch (keyPressed) {
            case '1':
                System.out.println("तपाइको ब्यालेन्स् रु तिन रुपैया आठ पैसा रहेको छ ।");
                break;
            case '2':
                System.out.println("कृपया रीचार्ज कार्ड् मा भएको सोह्र अङ्क को पिन थिचनुहोस्।");
                cb.checkRechNumber();
                break;
            case '3':
                System.out.println("तपाइको कल सिकायत कक्छ्य मा ट्रान्स्फर हुदै छ.........\n");
                System.out.println("कृपया आफ्नो सिकायत राख्नुहोस ।");
                System.out.println("सहयोग का लगि धन्यबाद ।");
                break;
            case '4':
                oi.blockSimNumber();
                break;
            case '6':
                lp.chooseService();
                break;
            case '8':
                System.out.println("तपाइको बाकि डाटा भोलुम १०.६७ MB रहेको छ ।");
                break;
            case '*':
                returnToMainMenu();
                break;
            default:
                System.exit(1);
        }

    }

    public void returnToMainMenu(){
         System.out.println("तपाइ मुख्य मेनु मा फर्कदै हुनुहुन्छ........");
         //displayMenu();


    }
}


