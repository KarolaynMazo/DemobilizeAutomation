package co.com.demoblaze.stepdefinitions;

import co.com.demoblaze.questions.ValiteList;
import co.com.demoblaze.questions.ValidateProduct;
import co.com.demoblaze.task.SelectProduct;
import co.com.demoblaze.task.SelectCategory;
import co.com.demoblaze.utils.Constants;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.demoblaze.utils.Constants.PRODUCT;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoblazeStepDefinitions {

    @Before
    public void initialConfig() {
        setTheStage(new OnlineCast());
    }

    @Given("that {string} wants to navigate to the page Demoblaze")
    public void thatWantsToNavigateToThePageDemoblaze(String customer) {
        theActor(customer).wasAbleTo(Open.url(Constants.URL));
    }

    @When("customer makes the selection of {string}")
    public void customerMakesTheSelectionOf(String category) {
        theActorInTheSpotlight().attemptsTo(SelectCategory.category(category));
    }

    @Then("should see a list of products")
    public void shouldSeeAListOfProducts() {
        theActorInTheSpotlight().should(seeThat(ValiteList.con(PRODUCT), Matchers.is(PRODUCT)));
    }

    @When("select the Category and select a Product")
    public void selectTheCategoryAndSelectAProduct(List<Map<String, String>> data) {
        theActorInTheSpotlight().attemptsTo(SelectProduct.el(data.get(0)));

    }

    @Then("I verify the name of the")
    public void iVerifyTheNameOfThe(List<Map<String, String>> data) {
        theActorInTheSpotlight().should(String.valueOf(seeThat(ValidateProduct.con(data.get(0))).equals(data.get(0))));
    }

}
