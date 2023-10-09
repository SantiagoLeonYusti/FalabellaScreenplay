package co.falabella.com.questions;

import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductQuantityValidationQuestion implements Question<Boolean> {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public Boolean answeredBy(Actor actor) {

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String Quantity = data.get(0).get("Quantity");
        String quantitySelect = GetCartItems.productQtyCart();

        return Quantity.equals(quantitySelect);
    }

    public static Question<Boolean> from(){
        return new ProductQuantityValidationQuestion();
    }
}
