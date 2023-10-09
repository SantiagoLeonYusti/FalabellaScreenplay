package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductCartUI {
    public static Target QTY_PRODUCT_CART = Target.the("Quantiyy of the product in the car")
            .locatedBy("//input[@class='chakra-input css-1hzo6s2']");

    public static final Target PRODUCT_NAME = Target.the("Product name")
            .locatedBy("//div[@class='jsx-1442607798 product-name fa--product-name false']");

    public static Target SEARCH_DESC = Target.the("Search bar")
            .locatedBy("//div/div/div/section/div/div/div/div/div/div/div/div/div/div");

    public static Target NAME_PRODUCT_CART = Target.the("Product name on cart")
            .locatedBy("//p[@data-testid='name']");
}
