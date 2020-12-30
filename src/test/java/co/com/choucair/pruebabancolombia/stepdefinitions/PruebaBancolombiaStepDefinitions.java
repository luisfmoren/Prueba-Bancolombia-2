package co.com.choucair.pruebabancolombia.stepdefinitions;

import co.com.choucair.pruebabancolombia.model.UtestData;
import co.com.choucair.pruebabancolombia.questions.Answer;
import co.com.choucair.pruebabancolombia.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class PruebaBancolombiaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than luis wants create a new user$")
    public void thanLuisWantsCreateANewUser() throws Exception{
        OnStage.theActorCalled("luis").wasAbleTo(OpenUp.thePage());

    }


    @When("^he register in the page utest$")
    public void heRegisterInThePageUtest(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(PersonalInformation.the(utestData.get(0).getStrFirstName(),
                utestData.get(0).getStrLastName(),utestData.get(0).getStrEmail(),utestData.get(0).getStrMonth(),
                utestData.get(0).getStrDay(),utestData.get(0).getStrYear()), Location.the(utestData.get(0).getStrCity(),
                utestData.get(0).getStrCodePostal()), Device.the(), LastStep.the(utestData.get(0).getStrPassword()));

    }

    @Then("^he will have a new user in the page$")
    public void heWillHaveANewUserInThePage(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrText())));

    }
}
