package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.interactions.RefreshPage;
import co.com.bancolombia.certification.interactions.SelectInTheList;
import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.bancolombia.certification.userinterfaces.HomePage.BTN_SAVE;
import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListSecurity.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListSecurity.TXT_HU_CYBERSECURITY;
import static co.com.bancolombia.certification.userinterfaces.TestPlanPageEvidence.OPTION_LIST;
import static co.com.bancolombia.certification.userinterfaces.TestPlanPagePerformance.TXT_APPLICATION_CODE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TabCheckSecurityInformationTP implements Task {

    DataCertification dataCertification;

    public TabCheckSecurityInformationTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TAB_CHECK_LIST_SECURITY,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TAB_CHECK_LIST_SECURITY),

                Click.on(TXT_APPLICATION_CODE),
                Enter.theValue(dataCertification.getApplicationCode()).into(TXT_APPLICATION_CODE) ,

                Click.on(TXT_ENGINEER_OF_SECURITY),
                Enter.theValue(dataCertification.getAssignedCybersecurity()).into(TXT_ENGINEER_OF_SECURITY),
                WaitUntil.the(TXT_ENGINEER_OF_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_ENGINEER_OF_SECURITY),
                SelectInTheList.theOption(TXT_ENGINEER_OF_SECURITY,OPTION_LIST,dataCertification.getAssignedCybersecurity()),
                Click.on(BTN_SAVE),
                Pause.forSeconds(2),

                Click.on(BTN_DEVSECOPS_ASSIGNED),
                Click.on(TXT_ENGINNER_OF_DEVSECOPS),
                Enter.theValue(dataCertification.getAssignedDevSecOps()).into(TXT_ENGINNER_OF_DEVSECOPS),
                WaitUntil.the(TXT_ENGINNER_OF_DEVSECOPS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_ENGINNER_OF_DEVSECOPS),
                SelectInTheList.theOption(TXT_ENGINNER_OF_DEVSECOPS,OPTION_LIST,dataCertification.getAssignedDevSecOps()),
                Click.on(BTN_SAVE),
                Pause.forSeconds(2),

                Click.on(TXT_HU_CYBERSECURITY),
                Enter.theValue(dataCertification.getCybersecurityHu()).into(TXT_HU_CYBERSECURITY),
                Pause.forSeconds(5),
                Hit.the(Keys.ENTER).into(TXT_HU_CYBERSECURITY),
                WaitUntil.the(BTN_SAVE,isClickable()).forNoMoreThan(5).seconds(),
                Pause.forSeconds(6),
                Click.on(BTN_SAVE)


        );

    }

    public static TabCheckSecurityInformationTP tabCheckSecurityInformation(DataCertification dataCertification) {
        return Tasks.instrumented(TabCheckSecurityInformationTP.class,dataCertification);
    }
}
