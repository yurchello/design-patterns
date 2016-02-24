package exmpl_1.factoriesImpl;

import exmpl_1.factory.Help;
import exmpl_1.factory.Images;
import exmpl_1.factory.Locale;
import exmpl_1.factory.UIAbstractFactory;
import exmpl_1.helpImplementation.JapaneseHelpImpl;
import exmpl_1.imageImplimentation.JapaneseImagesImpl;
import exmpl_1.localeImplementation.JapaneseLocaleImpl;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class JapaneseUIFactory implements UIAbstractFactory {
    @Override
    public Help getHelp() {
        return new JapaneseHelpImpl();
    }

    @Override
    public Images getImages() {
        return new JapaneseImagesImpl();
    }

    @Override
    public Locale getLocale() {
        return new JapaneseLocaleImpl();
    }
}
