package co.com.bancolombia.certification.tasks;
import co.com.bancolombia.certification.models.DataCertification;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class HomePageTaskTestPlan implements Task {

    DataCertification dataCertification;
    public HomePageTaskTestPlan(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginTask.loginTask(),
                NewItemDescriptionTP.newItemDescription(dataCertification),
                //AddParentRelated.addParentRelated(dataCertification),
                TabPerformanceTP.tabPerfomanceTP(dataCertification),
                TabCheckPerformanceInformationTP.tabCheckPerformanceInformation(dataCertification),
                TabCheckPerformanceProcessBatchTP.tabCheckPerformanceProcessBatch(dataCertification),
                TabCheckSecurityInformationTP.tabCheckSecurityInformation(dataCertification),
                TabCheckSecurityProccessTP.tabCheckSecurityProccess(dataCertification)

        );
    }
    public static HomePageTaskTestPlan enterData(DataCertification dataCertification) {
        return Tasks.instrumented(HomePageTaskTestPlan.class, dataCertification);
    }
}
