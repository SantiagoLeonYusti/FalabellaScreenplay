package co.falabella.com.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToElement implements Interaction {

    private final Target target;

    public ScrollToElement(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(target)
        );
    }
    public static ScrollToElement withTarget(Target target) {
        return instrumented(ScrollToElement.class, target);
    }
}
