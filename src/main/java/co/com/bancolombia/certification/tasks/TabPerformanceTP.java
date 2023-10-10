package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.certification.userinterfaces.TestPlanPagePerformance.*;

public class TabPerformanceTP implements Task {

    DataCertification dataCertification;

    public TabPerformanceTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TAB_PERFORMANCE_TEST_PLAN),
                Click.on(TXT_APPLICATION_CODE),
                Enter.theValue(dataCertification.getApplicationCode()).into(TXT_APPLICATION_CODE) ,
                Click.on(TXT_NAME_OF_APPLICATION_SOLUTION),
                Enter.theValue(dataCertification.getApplicationSolutionName()).into(TXT_NAME_OF_APPLICATION_SOLUTION)
                );

    }
    public static TabPerformanceTP tabPerfomanceTP(DataCertification dataCertification) {
        return Tasks.instrumented(TabPerformanceTP.class,dataCertification);
    }


}
