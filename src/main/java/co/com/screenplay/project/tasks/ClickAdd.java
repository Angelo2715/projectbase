package co.com.screenplay.project.tasks;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.project.ui.FormCompleteUI.*;
import static co.com.screenplay.project.utils.Constants.TIME_SHORT;
import static co.com.screenplay.project.utils.Time.waiting;

@Slf4j
@AllArgsConstructor
public class ClickAdd implements Task {
    private static EnvironmentVariables environmentVariables;

    @Override
    @Step("{0} se abre el formulario de empleo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BUTTON_ADD)

        );
        waiting(TIME_SHORT);

    }

    public static ClickAdd clickadd() {
        return Tasks.instrumented(ClickAdd.class);
    }
}
