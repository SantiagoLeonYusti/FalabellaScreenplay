package co.falabella.com.tasks;

import co.falabella.com.ui.HomeUI;
import co.falabella.com.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchTask implements Task {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data.xlsx", "Search");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                
                Enter.theValue(data.get(0).get("Product")).into(HomeUI.SEARCH_BAR).thenHit(Keys.ENTER)
        );

    }

    public static Performable fromHome(){
        return instrumented(SearchTask.class);
    }
}
