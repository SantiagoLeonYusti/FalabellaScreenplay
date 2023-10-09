package co.falabella.com.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.falabella.com.ui.CatalogueUI.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {

    private static String productName;

    public static void withProductName(String name) {
        productName = name;
    }

    public static String getProductName() {
        return productName;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElementFacade> listProducts = LBL_NAME_PRODUCT.resolveAllFor(actor);
        Random random= new Random();
        int indexRandom= random.nextInt(listProducts.size());
        //String productName = listProducts.get(indexRandom).getText();
        listProducts.get(indexRandom).click();
        ClickRandom.withProductName(productName);
    }

    public static Performable click(){
        return  instrumented(ClickRandom.class);
    }
}


