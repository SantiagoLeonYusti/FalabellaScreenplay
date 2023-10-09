package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.falabella.com.ui.ProductCartUI.NAME_PRODUCT_CART;
import static co.falabella.com.ui.ProductCartUI.QTY_PRODUCT_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GetCartItems implements Interaction {

    private static String productQtyCart;
    private static String productNameCart;

    @Override
    public <T extends Actor> void performAs(T actor) {

        productQtyCart = QTY_PRODUCT_CART.resolveFor(actor).getValue();
        productNameCart = NAME_PRODUCT_CART.resolveFor(actor).getText();
    }

    public static Performable items(){
        return instrumented(GetCartItems.class);
    }

    public static String produtName(){
        return productNameCart;
    }

    public static String productQtyCart(){
        return productQtyCart;
    }
}
