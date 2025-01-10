package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.ui.FormCompleteUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;

@Slf4j
@AllArgsConstructor
public class FormComplete implements Task {

    private static EnvironmentVariables environmentVariables;
    private String firstname;
    private String middlename;
    private String lastname;
    private String email;
    private String contactnumber;
    private String keywords;

    @Override
    @Step("{0} se completa el formulario de empleado")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(INPUT_FIRST_NAME),
                Enter.theValue(middlename).into(INPUT_MIDDLENAME),
                Enter.theValue(lastname).into(INPUT_LASTNAME),
               Enter.theValue(email).into(INPUT_EMAIL),
                Enter.theValue(contactnumber).into(INPUT_CONTACTNUMBER),
                Enter.theValue(keywords).into(INPUT_KEYWORDS),
                Click.on(BUTTON_CONSENT),
                Click.on(BUTTON_SAVE)
        );
        waiting(TIME_SHORT);
        actor.should(
                seeThat("el nombre del empleado está presente",
                        Text.of(EMPLOYEE_NAME),
                        containsString("Angelo Gonzalez Ortega"))
        );
        waiting(TIME_SHORT);
    }

    public static FormComplete formComplete(String firstname, String middlename, String lastname,
                                              String email, String contactnumber, String keywords) {
        return Tasks.instrumented(FormComplete.class, firstname, middlename, lastname, email, contactnumber, keywords);
    }
}
