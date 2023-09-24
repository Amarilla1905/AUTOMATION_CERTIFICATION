package co.com.bancolombia.certification.interactions;



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
    private Target userI;

    public SelectInTheList(Target inputTarget, Target userI,String option) {
        this.inputTarget = inputTarget;
        this.userI = userI;
        this.option = option;
    }

    public static SelectInTheList theOption(Target inputTarget, Target userI,String option) {
        return Tasks.instrumented(SelectInTheList.class, inputTarget,userI,option  );
    }

    @Step("{0} Select The List The Option '#option'")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(inputTarget, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(inputTarget),
                WaitUntil.the(userI.of(option),isVisible()).forNoMoreThan(10).seconds(),
                Click.on(userI.of(option)));
    }
}