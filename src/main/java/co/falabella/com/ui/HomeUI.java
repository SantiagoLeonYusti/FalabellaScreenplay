package co.falabella.com.ui;


import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static Target SEARCH_BAR = Target.the("Search bar")
            .locatedBy("#testId-SearchBar-Input");

}
