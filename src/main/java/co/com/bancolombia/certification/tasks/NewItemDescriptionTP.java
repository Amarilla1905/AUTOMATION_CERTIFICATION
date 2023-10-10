package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.userinterfaces.HomePage.BTN_NEW_WORK_ITEM_ICON;
import static co.com.bancolombia.certification.userinterfaces.HomePage.BTN_OPTION_TEST_PLAN;
import static co.com.bancolombia.certification.userinterfaces.TestPlanPageEvidence.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NewItemDescriptionTP implements Task {

    DataCertification dataCertification;

    public NewItemDescriptionTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }

    


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEW_WORK_ITEM_ICON),
                Click.on(BTN_OPTION_TEST_PLAN),
                WaitUntil.the(TXT_TITTLE_TEST_PLAN,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(TXT_TITTLE_TEST_PLAN),
                Enter.theValue(dataCertification.getTittleTestPlan()).into(TXT_TITTLE_TEST_PLAN),
                // Enter.theValue("TEST PLAN AUTOMATIZACION PRUEBA").into(TXT_TITTLE_TEST_PLAN),


                Click.on(TXT_DESCRIPTION_TEST_PLAN),
                Enter.theValue(dataCertification.getDescription()).into(TXT_DESCRIPTION_TEST_PLAN),
                Enter.theValue(dataCertification.getTypeTestPlan()).into(TXT_TYPE_TEST_PLAN)



        );
    }
    public static NewItemDescriptionTP newItemDescription(DataCertification dataCertification) {
        return Tasks.instrumented(NewItemDescriptionTP.class,dataCertification);
    }
}
