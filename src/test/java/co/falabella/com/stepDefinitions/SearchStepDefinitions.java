package co.falabella.com.stepDefinitions;


import co.falabella.com.interactions.GetCartItems;
import co.falabella.com.interactions.GetNameOfSelectProduct;
import co.falabella.com.questions.NameValidationQuestion;
import co.falabella.com.questions.ProductQuantityValidationQuestion;
import co.falabella.com.tasks.GoToCartTask;
import co.falabella.com.tasks.SearchTask;
import co.falabella.com.tasks.ProductsCollectionTask;
import co.falabella.com.tasks.QuantityChangeAndBuyTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class SearchStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that user open page Falabella and search any product")
    public void openUrl(){
        theActorCalled("Usuario").wasAbleTo(
                Open.url("https://www.falabella.com.co/")
        );


    }
    @When("user click  on  product tittle and user click on add to cart")
    public void selectProduct() {
        theActorInTheSpotlight().attemptsTo(
                SearchTask.fromHome(),
                ProductsCollectionTask.on(),
                GetNameOfSelectProduct.name(),
                QuantityChangeAndBuyTask.from(),
                GoToCartTask.on(),
                GetCartItems.items()
        );

    }
    @Then("user can read the product name from excel.")
    public void readNameProduct() {
        theActorInTheSpotlight().should(
                seeThat(NameValidationQuestion.from(), Matchers.equalTo(true)),
                seeThat(ProductQuantityValidationQuestion.from(), Matchers.equalTo(true))
        );

    }
}
