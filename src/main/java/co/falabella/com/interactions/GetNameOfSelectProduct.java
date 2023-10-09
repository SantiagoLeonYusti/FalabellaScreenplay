package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static co.falabella.com.ui.ProductUI.LBL_PRODUCT;

public class GetNameOfSelectProduct implements Interaction {

    private static String productNameSelect;

    @Override
    public <T extends Actor> void performAs(T actor) {
        productNameSelect = LBL_PRODUCT.resolveFor(actor).getText();
        actor.remember("productNameSelect", productNameSelect);
    }

    public static GetNameOfSelectProduct name() {
        return new GetNameOfSelectProduct();
    }

    public static String getProductNsmeSelect(Actor actor) {
        return actor.recall("productNameSelect");
    }
}