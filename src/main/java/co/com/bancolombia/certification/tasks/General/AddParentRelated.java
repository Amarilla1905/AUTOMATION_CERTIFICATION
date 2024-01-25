package co.com.bancolombia.certification.tasks.General;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.interactions.SlowType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanPageEvidence.*;
import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanPageEvidence.BTN_SAVE_ADD_RELATED_PARENT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddParentRelated implements Task {

    DataCertification dataCertification;




    public AddParentRelated(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LINK_ADD_RELATED_PARENT, isVisible()).forNoMoreThan(20).seconds(),

                Click.on(LINK_ADD_RELATED_PARENT),
                Click.on(TXT_NUM_HU),
                WaitUntil.the(TXT_NUM_HU, isVisible()).forNoMoreThan(10).seconds(),
                //SlowType.slowType(dataCertification.getRelatedParent(), TXT_NUM_HU),
                Enter.theValue(dataCertification.getRelatedParent()).into(TXT_NUM_HU),
                Pause.forSeconds(1),
                Hit.the(Keys.ENTER).into(TXT_NUM_HU),
                Click.on(BTN_SAVE_ADD_RELATED_PARENT),

                Click.on(LINK_ADD_RELATED_HU),
                Click.on(BTN_EXISTING_ITEM),
                WaitUntil.the(TXT_PARENT_RELATED_HU,isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(TXT_PARENT_RELATED_HU),
                Enter.theValue("Related").into(TXT_PARENT_RELATED_HU_INPUT),
                Hit.the(Keys.ENTER).into(TXT_PARENT_RELATED_HU_INPUT),
                Click.on(TXT_NUM_HU),
                Enter.theValue(dataCertification.getRelatedHu()).into(TXT_NUM_HU),
                WaitUntil.the(TXT_NUM_HU, isVisible()).forNoMoreThan(10).seconds(),
                Pause.forSeconds(1),
                Hit.the(Keys.ENTER).into(TXT_NUM_HU),
                WaitUntil.the(BTN_SAVE_ADD_RELATED_PARENT,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_SAVE_ADD_RELATED_PARENT)

        );
    }


    public static AddParentRelated addParentRelated(DataCertification dataCertification) {
        return Tasks.instrumented(AddParentRelated.class,dataCertification);
    }


}
