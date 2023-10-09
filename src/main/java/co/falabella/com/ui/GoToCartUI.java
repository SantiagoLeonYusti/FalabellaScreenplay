package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class GoToCartUI {
    public static Target BTN_GO_TO_CART = Target.the("go to cart Button")
            .locatedBy("//a[@id='linkButton']");
}
