package co.com.bancolombia.certification.tasks.TP;

import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.userinterfaces.HomePage.BTN_SAVE;
import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanCheckListPerformance.TAB_CHECK_LIST_PERFORMANCE;
import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanCheckListPerformance.TXT_EVC_TEST_PLAN;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class TabCheckPerformanceInformationTP implements Task {

    DataCertification dataCertification;

    public TabCheckPerformanceInformationTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TAB_CHECK_LIST_PERFORMANCE),
                Click.on(TXT_EVC_TEST_PLAN),
                Enter.theValue(dataCertification.getEvc()).into(TXT_EVC_TEST_PLAN),
                WaitUntil.the(BTN_SAVE,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SAVE)

                );

    }

    public static TabCheckPerformanceInformationTP tabCheckPerformanceInformation(DataCertification dataCertification) {
        return Tasks.instrumented(TabCheckPerformanceInformationTP.class,dataCertification);
    }
}


