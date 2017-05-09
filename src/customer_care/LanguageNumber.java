package customer_care;


import customer_care.nepali_language.SelectService;

/**
 * Created by krishna KC on 11/20/2016.
 */
public class LanguageNumber {
    public void displayLanguage(){
        ChooseLanguage cs=new ChooseLanguage();
        cs.chooseLanguage();
        cs.setLanguage();
    }
    public void displayService(){
        SelectService sl= new SelectService();
        sl.displayMenu();
        sl.checkKey();
    }
}
