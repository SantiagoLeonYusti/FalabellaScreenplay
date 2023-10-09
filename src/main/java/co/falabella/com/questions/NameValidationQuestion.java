package co.falabella.com.questions;

import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.interactions.GetNameOfSelectProduct;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NameValidationQuestion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        String productSelName = GetNameOfSelectProduct.getProductNsmeSelect(actor);
        String productNameCart = GetCartItems.produtName();

        return productSelName.contains(productNameCart);
    }

    public static Question<Boolean> from(){
        return new NameValidationQuestion();
    }
}
