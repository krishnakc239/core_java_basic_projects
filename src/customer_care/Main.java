package customer_care;


import customer_care.nepali_language.CheckBalance;
import customer_care.nepali_language.SelectService;

import java.util.Scanner;

/**
 * Created by krishna KC on 11/19/2016.
 */
public class Main {

    public static void main(String[] args) {
        LanguageNumber l = new LanguageNumber();
        SelectService sl = new SelectService();
        l.displayLanguage();

        do {

            l.displayService();
           // sl.returnToMainMenu();
        }while(true);


    }
}
