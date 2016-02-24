package exmpl_1.localeImplementation;

import exmpl_1.factory.Locale;

/**
 * Created by Mezentsev.Y on 2/19/2016.
 */
public class USLocaleImpl implements Locale {
    @Override
    public String getLocaleCountry() {
        return "Japan Locale";
    }
}
