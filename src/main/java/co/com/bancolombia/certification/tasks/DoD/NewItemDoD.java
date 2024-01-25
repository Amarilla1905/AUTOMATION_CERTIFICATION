package co.com.bancolombia.certification.tasks.DoD;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.models.DataCertification;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.userinterfaces.HomePage.*;
import static co.com.bancolombia.certification.userinterfaces.DOD.InformationDoD.*;
import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanPageEvidence.TXT_TITTLE_TEST_PLAN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NewItemDoD implements Task {

    DataCertification dataCertification;

    public NewItemDoD(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_NEW_WORK_ITEM_ICON,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_NEW_WORK_ITEM_ICON),
                Click.on(BTN_OPTION_DOD),
                WaitUntil.the(TXT_TITTLE_DOD,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(TXT_TITTLE_DOD),
               // Enter.theValue("AUTOMATIZACION DOD PRUEBA").into(TXT_TITTLE_DOD),
                Enter.theValue(dataCertification.getTittleDOD()).into(TXT_TITTLE_DOD),
                Click.on(BTN_SAVE),
                Pause.forSeconds(1)




        );
    }
    public static NewItemDoD newItemDoD(DataCertification dataCertification) {
        return Tasks.instrumented(NewItemDoD.class,dataCertification);
    }
}

