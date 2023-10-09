package co.falabella.com.tasks;

import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.falabella.com.ui.ProductUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actions.Clear.field;
import static net.serenitybdd.screenplay.actions.Enter.theValue;

public class QuantityChangeAndBuyTask implements Task {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Scroll.to(LBL_PRECIO),
                field(PRODUCT_QTY).then(theValue("").into(PRODUCT_QTY)),
                theValue(String.valueOf(data.get(0).get("Quantity"))).into(PRODUCT_QTY),
                Click.on(BTN_ADD_CART)
        );
    }

    public static QuantityChangeAndBuyTask from() {
        return instrumented(QuantityChangeAndBuyTask.class);
    }
}
