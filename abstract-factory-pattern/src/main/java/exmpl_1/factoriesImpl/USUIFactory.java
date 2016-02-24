package exmpl_1.factoriesImpl;

import exmpl_1.factory.Help;
import exmpl_1.factory.Images;
import exmpl_1.factory.Locale;
import exmpl_1.factory.UIAbstractFactory;
import exmpl_1.helpImplementation.USHelpImpl;
import exmpl_1.imageImplimentation.USImagesImpl;
import exmpl_1.localeImplementation.USLocaleImpl;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class USUIFactory implements UIAbstractFactory {
    @Override
    public Help getHelp() {
        return new USHelpImpl();
    }

    @Override
    public Images getImages() {
        return new USImagesImpl();
    }

    @Override
    public Locale getLocale() {
       return new USLocaleImpl();
    }

}
