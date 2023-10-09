package co.falabella.com.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductUI {

    public static final Target LBL_PRECIO= Target.the( "Titulo producto" )
            .located( By.xpath("//div/ol/li/div/span") );

    public static Target PRODUCT_QTY = Target.the("Product quantity")
            .locatedBy("//input[@id='quantity-selector-increment-input']");

    public static Target BTN_ADD_CART = Target.the("Add to cart button")
            .locatedBy("//button[@id='add-to-cart-button']");

    public static Target LBL_PRODUCT = Target.the("Product label")
            .locatedBy("//div[contains(@class, 'jsx-1442607798')]");

}
