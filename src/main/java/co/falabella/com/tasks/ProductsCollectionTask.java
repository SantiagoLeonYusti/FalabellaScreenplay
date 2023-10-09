package co.falabella.com.tasks;


import co.falabella.com.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;




import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductsCollectionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandom.click()
        );
    }

    public static Performable on(){
        return instrumented(ProductsCollectionTask.class);
    }
}
