package co.com.screenplay.project.stepdefinition;

import co.com.screenplay.project.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.util.EnvironmentVariables;
import org.hamcrest.Matchers;

import static co.com.screenplay.project.utils.Constants.*;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticationStep {

    private static EnvironmentVariables environmentVariables;
    private String user;
    private String pwd;


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("ingresa las credenciales")
    public void enterTheCredentials() {

        user = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(USER_NAME);
        pwd = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(PWD);
        theActorCalled(ACTOR).attemptsTo(
                Login.authentication(user, pwd)
        );
//        theActorCalled(ACTOR).attemptsTo(
//                ChooseCategory.dynamic(),
//                ChooseProducts.dynamic()
//        );
    }

    @Then("visualizara el home y espera una validacion")
    public void itWillDisplayTheHomeAndWaitForAValidation() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }

    @And("hace clic en agregar")
    public void clickAdd(){
        theActorCalled(ACTOR).attemptsTo(
                ClickAdd.clickadd()
        );
    }

    @When("completa el formulario")
    public void completeTheFormWithTheFollowingInformation(){
        theActorCalled(ACTOR).attemptsTo(
                FormComplete.formComplete(FIRST_NAME, MIDDLENAME, LASTNAME,EMAIL, CONTACTNUMBER , KEYWORDS)
        );
    }
}