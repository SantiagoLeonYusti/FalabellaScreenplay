package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogueUI {
    public static final Target LBL_NAME_PRODUCT= Target.the("products collection")
            .locatedBy("//img[contains(@class, 'jsx-1996933093')]");

}
