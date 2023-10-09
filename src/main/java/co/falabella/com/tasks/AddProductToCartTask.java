package co.falabella.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

import static co.falabella.com.ui.ProductUI.BTN_ADD_CART;
import static co.falabella.com.ui.ProductUI.LBL_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADD_CART)
        );
    }

    public static AddProductToCartTask button() {
        return instrumented(AddProductToCartTask.class);
    }
}
