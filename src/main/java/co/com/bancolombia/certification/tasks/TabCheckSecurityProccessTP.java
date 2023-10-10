package co.com.bancolombia.certification.tasks;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.interactions.SwitchToFrame;
import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import javax.xml.crypto.Data;

import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListSecurity.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListSecurity.RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TabCheckSecurityProccessTP implements Task {

    DataCertification dataCertification;

    public TabCheckSecurityProccessTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
        //RefreshPage.refresh(),
        MoveMouse.to(TXT_SOLUTION_SECURITY),
                WaitUntil.the(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY),

                SwitchToFrame.switchToIframe(BrowseTheWeb.as(actor).getDriver(),0),
                WaitUntil.the(BTN_EVALUATE_CHECKLIST_SECURITY, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(BTN_EVALUATE_CHECKLIST_SECURITY),
                Click.on(BTN_OK_SAVE_INFORMATION),
                Click.on(BTN_OK_SAVE_INFORMATION),
                Pause.forSeconds(3),
                Switch.toDefaultContext(),
                WaitUntil.the(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY,isClickable()).forNoMoreThan(20).seconds(),
                Click.on(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_SECURITY),
                Pause.forSeconds(5)
                );

    }
    public static TabCheckSecurityProccessTP tabCheckSecurityProccess(DataCertification dataCertification) {
        return Tasks.instrumented(TabCheckSecurityProccessTP.class,dataCertification);
    }

}
