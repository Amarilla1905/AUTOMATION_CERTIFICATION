package co.com.bancolombia.certification.interactions;



import co.com.bancolombia.certification.userinterfaces.TestPlanPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectInTheList implements Interaction {

    private Target inputTarget;
    private String option;

    public SelectInTheList(Target inputTarget, String option) {
        this.inputTarget = inputTarget;
        this.option = option;
    }

    public static SelectInTheList theOption(Target inputTarget, String option) {
        return Tasks.instrumented(SelectInTheList.class, inputTarget, option);
    }

    @Step("{0} Select The List The Option '#option'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(inputTarget, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(inputTarget),
                WaitUntil.the(TestPlanPage.OPTION_LIST.of(option),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TestPlanPage.OPTION_LIST.of(option)));
    }
}