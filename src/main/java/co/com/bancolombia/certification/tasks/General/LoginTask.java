package co.com.bancolombia.certification.tasks.General;

import co.com.bancolombia.certification.interactions.Pause;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static co.com.bancolombia.certification.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
                    actor.attemptsTo(
                            //Log in
                            WaitUntil.the(TXT_EMAIL_LOGIN, isVisible()).forNoMoreThan(20).seconds(),
                            Enter.theValue("sarcas@bancolombia.com.co").into(TXT_EMAIL_LOGIN),
                            Click.on(BTN_NEXT_LOGIN),
                            Enter.theValue("").into(TXT_PASSWORD_LOGIN),
                            Click.on(BTN_LOG_IN_LOGIN),
                            Pause.forSeconds(1)

                    );

    }
    public static LoginTask loginTask() {
        return Tasks.instrumented(LoginTask.class);
    }
}
