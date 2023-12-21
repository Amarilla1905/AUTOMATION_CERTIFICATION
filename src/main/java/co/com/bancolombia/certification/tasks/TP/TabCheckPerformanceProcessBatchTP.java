package co.com.bancolombia.certification.tasks.TP;

import co.com.bancolombia.certification.interactions.Pause;
import co.com.bancolombia.certification.interactions.SwitchToFrame;
import co.com.bancolombia.certification.models.DataCertification;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.bancolombia.certification.userinterfaces.TP.TestPlanCheckListPerformance.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TabCheckPerformanceProcessBatchTP implements Task {

    DataCertification dataCertification;

    public TabCheckPerformanceProcessBatchTP(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                MoveMouse.to(TXT_SOLUTION_PERFORMANCE),
                WaitUntil.the(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE),
                SwitchToFrame.switchToIframe(BrowseTheWeb.as(actor).getDriver(),0),
                Click.on(TXT_FIELDS_CHECKLIST_PERFORMANCE),
                Scroll.to(TXT_FIELDS_CHECKLIST_PERFORMANCE).andAlignToBottom(),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getModularTestingOrE2()).into(TXT_FIELDS_CHECKLIST_PERFORMANCE),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getTransactionType()).into(TXT_FIELDS_CHECKLIST_PERFORMANCE),
                Pause.forSeconds(2),
                Click.on(ENTER_NEW_BATCH_PROCESS),
                Click.on(NAME_NEW_BATCH_PROCESS),
                Enter.theValue(dataCertification.getProcessBatchTitle()).into(NAME_NEW_BATCH_PROCESS),
                //Enter.theValue("Pr_prueba_test_plan_funcional_001").into(NAME_NEW_BATCH_PROCESS),



                Click.on(MAXIMUM_NUMBER_BATCH_PROCESS),
                Enter.theValue(dataCertification.getMaximumNumberRecords()).into(MAXIMUM_NUMBER_BATCH_PROCESS),
                Click.on(SELECT_MAXIMUM_NUMBER_BATCH_PROCESS.of(dataCertification.getSelectTypeRecords())),


                Click.on(MAXIMUM_SIZE_FILES_BATCH_PROCESS),
                Enter.theValue(dataCertification.getMaximumFileSize()).into(MAXIMUM_SIZE_FILES_BATCH_PROCESS),
                Click.on(SELECT_MAXIMUM_SIZE_FILES_BATCH_PROCESS.of(dataCertification.getSelectTypeSize())),

                Click.on(MAXIMUM_EXPECTED_TIME_BATCH_PROCESS),
                Enter.theValue(dataCertification.getMaximumExecutionTime()).into(MAXIMUM_EXPECTED_TIME_BATCH_PROCESS),
                Click.on(SELECT_MAXIMUM_EXPECTED_TIME_BATCH_PROCESS.of(dataCertification.getSelectTypeTime())),
                Click.on(ERROR_PERCENTAGE),
                Enter.theValue(dataCertification.getErrorRate()).into(ERROR_PERCENTAGE),
                Click.on(PERCENTAGE_OF_GROWTH),
                Enter.theValue(dataCertification.getGrowthRate()).into(PERCENTAGE_OF_GROWTH),
                Click.on(SELECT_PROCESS_RUN_IN_MESH.of(dataCertification.getRunsOnMesh())),
                Click.on(CHECKBOX_SQOOP_PROCESS),
                Click.on(BTN_OK_BATCH_PROCESS),
                Pause.forSeconds(1),
                Click.on(BTN_EXIT_BATCH_PROCESS),
                Pause.forSeconds(1),
                WaitUntil.the(BTN_EVALUATE_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_EVALUATE_CHECKLIST_PERFORMANCE),
                Pause.forSeconds(2),
                Click.on(BTN_OK_SAVE_INFORMATION),
                Pause.forSeconds(1),

                Switch.toDefaultContext(),


                WaitUntil.the(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION_PERFORMANCE)
        );
    }
    public static TabCheckPerformanceProcessBatchTP tabCheckPerformanceProcessBatch(DataCertification dataCertification) {
        return Tasks.instrumented(TabCheckPerformanceProcessBatchTP.class,dataCertification);
    }
}
