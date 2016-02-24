package exmpl_1;

import exmpl_1.factoriesImpl.JapaneseUIFactory;
import exmpl_1.factoriesImpl.USUIFactory;
import exmpl_1.factory.Help;
import exmpl_1.factory.Images;
import exmpl_1.factory.Locale;
import exmpl_1.factory.UIAbstractFactory;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class TestClient {
    public void run(String countryId){//???????? ?????????? ??????
        UIAbstractFactory uiFactory = null; //?????????????? ???????
        if(countryId.equals("JP"))
            uiFactory = new JapaneseUIFactory(); // ??????? ??????? UI ??? ??????
        if(countryId.equals("US"))
            uiFactory = new USUIFactory(); // ??????? ??????? ??? ???

        if(uiFactory != null){
            Help help = uiFactory.getHelp(); //???????
            log("help created for: " + help.getHelpCountry());

            Images images = uiFactory.getImages(); // ???????
            log("UI images created for: " + images.getImagesCountry());

            Locale locale = uiFactory.getLocale(); // ???????????
            log("UI locale created for: " + locale.getLocaleCountry());
        }else{
            log("Wrong country id");
        }
    }

    private void log(String msg){
        System.out.println(msg);
    }
}
