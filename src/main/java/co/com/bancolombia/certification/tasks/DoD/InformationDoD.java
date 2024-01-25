package co.com.bancolombia.certification.tasks.DoD;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.models.DataCertification;

import co.com.bancolombia.certification.questions.GetNumberTPQuestion;
import co.com.bancolombia.certification.userinterfaces.TP.TestPlanPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import static co.com.bancolombia.certification.userinterfaces.DOD.InformationDoD.*;
import static co.com.bancolombia.certification.userinterfaces.HomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InformationDoD implements Task {

    DataCertification dataCertification;


    public InformationDoD(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }

    @Override
        public <T extends Actor> void performAs(T actor) {



        actor.attemptsTo(
                  WaitUntil.the(TXT_DIRECT_DATA_CHANGES,isVisible()).forNoMoreThan(15).seconds(),
                    Click.on(TXT_DIRECT_DATA_CHANGES),
                    Enter.theValue(dataCertification.getDirectDataChanges()).into(TXT_DIRECT_DATA_CHANGES),
                    Click.on(TXT_SOLUTION_DOCUMENTATION),
                    Enter.theValue(dataCertification.getSolutionDocumentation()).into(TXT_SOLUTION_DOCUMENTATION),
                    Click.on(BTN_SAVE),
                    Pause.forSeconds(1),

                    Click.on(TXT_LINK_SOLUTION_DOCUMENTATION),
                    Enter.theValue(dataCertification.getDocumentation()).into(TXT_LINK_SOLUTION_DOCUMENTATION),
                    Click.on(BTN_SAVE),
                    Pause.forSeconds(1),

                    Click.on(TXT_DEPLOYMENT_TOOL),
                    Enter.theValue("Automático DevOps").into(TXT_DEPLOYMENT_TOOL),
                    WaitUntil.the(TXT_DEPLOYMENT_TOOL, isVisible()).forNoMoreThan(10).seconds(),
                    Hit.the(Keys.ENTER).into(TXT_DEPLOYMENT_TOOL),
                    Click.on(BTN_SAVE),
                    Pause.forSeconds(1),

                    Click.on(TXT_PIPELINE),
                    Enter.theValue(dataCertification.getPipeline()).into(TXT_PIPELINE),
                    Hit.the(Keys.ENTER).into(TXT_PIPELINE),
                    Click.on(BTN_SAVE),
                    Pause.forSeconds(1),

                    Click.on(TXT_ARTIFACT),
                    Enter.theValue(dataCertification.getArtifact()).into(TXT_ARTIFACT),
                    Hit.the(Keys.ENTER).into(TXT_PIPELINE),
                    Click.on(BTN_SAVE),

                    Click.on(TXT_SPECIALIZED_TESTS),
                    Enter.theValue(dataCertification.getSpecializedTest()).into(TXT_SPECIALIZED_TESTS),
                    Click.on(BTN_SAVE),


                    Click.on(TXT_EVIDENCE_VSTS),
                    Enter.theValue("Evidencia VSTS: ").into(TXT_EVIDENCE_VSTS),
                    Click.on(BTN_SAVE)





                    );
              //   System.out.println(Evidencias);
        }
    public static InformationDoD informationDOD(DataCertification dataCertification) {
        return Tasks.instrumented(InformationDoD.class,dataCertification);
    }


    }


