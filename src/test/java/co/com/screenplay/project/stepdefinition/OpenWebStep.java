package co.com.screenplay.project.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class OpenWebStep {
    @Before
    public void setTheStage(){OnStage.setTheStage(new OnlineCast());}

    @When("ingresa al navegador chrome")
    public void enterChromeBrowser(){

    }

    @Then("visualizar el titulo de la pagina {string}")
    public void willDisplayThePageTitle(String texValidation){

    }
}
