package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.tasks.DoD.InformationDoD;
import co.com.bancolombia.certification.tasks.DoD.NewItemDoD;
import co.com.bancolombia.certification.tasks.General.AddParentRelated;
import co.com.bancolombia.certification.tasks.General.LoginTask;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class HomePageTaskDoD implements Task {


    DataCertification dataCertification;

    public HomePageTaskDoD(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                LoginTask.loginTask(),
                NewItemDoD.newItemDoD(dataCertification),
                AddParentRelated.addParentRelated(dataCertification),
                InformationDoD.informationDOD(dataCertification)

        );
    }
    public static HomePageTaskDoD enterDataDoD(DataCertification dataCertification) {
        return Tasks.instrumented(HomePageTaskDoD.class, dataCertification);
    }
}




