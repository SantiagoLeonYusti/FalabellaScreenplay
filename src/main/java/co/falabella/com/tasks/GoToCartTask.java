package co.falabella.com.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.falabella.com.ui.GoToCartUI.BTN_GO_TO_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_GO_TO_CART)
        );
    }
    public static GoToCartTask on() {
        return instrumented(GoToCartTask.class);
    }
}
