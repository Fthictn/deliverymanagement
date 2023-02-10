package bdd.scenarios;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    @Given("^we have a regular passenger$")
    public void weHaveARegularPassenger() {

    }


    @When("^the regular passenger <pass(\\d+)> travels <pass(\\d+)>$")
    public void theRegularPassengerPassTravelsPass(int arg0, int arg1) {

    }


    @Then("^the bonus points of the regular passenger should <points>$")
    public void theBonusPointsOfTheRegularPassengerShouldPoints() {

    }
}
