package co.com.bancolombia.certification.tasks;
import co.com.bancolombia.certification.interactions.SelectInTheList;
import co.com.bancolombia.certification.interactions.SwitchToFrame;
import co.com.bancolombia.certification.models.DataCertification;
import static co.com.bancolombia.certification.userinterfaces.HomePage.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanPageEvidence.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanPagePerformance.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListPerformance.*;
import static co.com.bancolombia.certification.userinterfaces.TestPlanCheckListSecurity.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


public class HomePageTask implements Task {




    DataCertification dataCertification;


    public HomePageTask(DataCertification dataCertification) {
        this.dataCertification = dataCertification;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //Log in
                WaitUntil.the(TXT_EMAIL_LOGIN, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue("sarcas@bancolombia.com.co").into(TXT_EMAIL_LOGIN),
                Click.on(BTN_NEXT_LOGIN),
                Enter.theValue("CIELOYMILOMISAMORES2123.*").into(TXT_PASSWORD_LOGIN),
                Click.on(BTN_LOG_IN_LOGIN),
                Click.on(BTN_NEW_WORK_ITEM_ICON),
                Click.on(BTN_OPTION_TEST_PLAN),
                WaitUntil.the(TXT_TITTLE_TEST_PLAN,isVisible()).forNoMoreThan(15).seconds(),
                Click.on(TXT_TITTLE_TEST_PLAN),
                Enter.theValue(dataCertification.getTittleTestPlan()).into(TXT_TITTLE_TEST_PLAN),



                /* Click.on(TXT_ASSIGNED_TEST_PLAN),
                WaitUntil.the(TXT_ASSIGNED_TEST_PLAN,isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(dataCertification.getAssignedToEmail()).into(TXT_ASSIGNED_TEST_PLAN),
                WaitUntil.the(TXT_ASSIGNED_TEST_PLAN,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TXT_ASSIGNED_TEST_PLAN),
                Hit.the(Keys.ENTER).into(TXT_ASSIGNED_TEST_PLAN),
               // SelectInTheList.theOption(TXT_ASSIGNED_TEST_PLAN,OPTION_LIST,dataCertification.getAssignedToName())*/

                Click.on(TXT_DESCRIPTION_TEST_PLAN),
                Enter.theValue(dataCertification.getDescription()).into(TXT_DESCRIPTION_TEST_PLAN),
                Enter.theValue(dataCertification.getTypeTestPlan()).into(TXT_TYPE_TEST_PLAN),
                WaitUntil.the(LINK_ADD_RELATED_PARENT, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(LINK_ADD_RELATED_PARENT),
                Click.on(TXT_NUM_HU),
                Enter.theValue(dataCertification.getRelatedParent()).into(TXT_NUM_HU),
                WaitUntil.the(TXT_NUM_HU, isVisible()).forNoMoreThan(10).seconds(),
                Hit.the(Keys.ENTER).into(TXT_NUM_HU),
                Click.on(BTN_SAVE_ADD_RELATED_PARENT),

               Click.on(LINK_ADD_RELATED_HU),
                Click.on(BTN_EXISTING_ITEM),
                WaitUntil.the(TXT_PARENT_RELATED_HU,isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(TXT_PARENT_RELATED_HU),
                Enter.theValue("Related").into(TXT_PARENT_RELATED_HU_INPUT),
                Hit.the(Keys.ENTER).into(TXT_PARENT_RELATED_HU_INPUT),
                Click.on(TXT_NUM_HU),
                Enter.theValue(dataCertification.getRelatedHu()).into(TXT_NUM_HU),
                WaitUntil.the(TXT_NUM_HU, isVisible()).forNoMoreThan(10).seconds(),
                Hit.the(Keys.ENTER).into(TXT_NUM_HU),
                WaitUntil.the(BTN_SAVE_ADD_RELATED_PARENT,isVisible()).forNoMoreThan(30).seconds(),
                Click.on(BTN_SAVE_ADD_RELATED_PARENT),



                Click.on(TAB_PERFORMANCE_TEST_PLAN),
                Click.on(TXT_APPLICATION_CODE),
                Enter.theValue(dataCertification.getApplicationCode()).into(TXT_APPLICATION_CODE) ,
                Click.on(TXT_NAME_OF_APPLICATION_SOLUTION),
                Enter.theValue(dataCertification.getApplicationSolutionName()).into(TXT_NAME_OF_APPLICATION_SOLUTION),
                Click.on(TAB_CHECK_LIST_PERFORMANCE),
                Click.on(TXT_EVC_TEST_PLAN),
                Enter.theValue(dataCertification.getEvc()).into(TXT_EVC_TEST_PLAN),
                WaitUntil.the(BTN_SAVE,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SAVE),
                MoveMouse.to(TXT_SOLUTION_PERFORMANCE),
                WaitUntil.the(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MAXIMIZE_PERFORMANCE_TECHNICAL_INFORMATION),
                SwitchToFrame.switchToIframe(BrowseTheWeb.as(actor).getDriver(),0),
                Click.on(TXT_FIELDS_CHECKLIST_PERFORMANCE),
                Scroll.to(TXT_FIELDS_CHECKLIST_PERFORMANCE).andAlignToBottom(),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getModularTestingOrE2E()).into(TXT_FIELDS_CHECKLIST_PERFORMANCE),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getTransactionType()).into(TXT_FIELDS_CHECKLIST_PERFORMANCE),

                Click.on(ENTER_NEW_BATCH_PROCESS),
                Click.on(NAME_NEW_BATCH_PROCESS),
                Enter.theValue(dataCertification.getProcessBatchTitle()).into(NAME_NEW_BATCH_PROCESS),


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
                Click.on(BTN_EXIT_BATCH_PROCESS),
                WaitUntil.the(BTN_EVALUATE_CHECKLIST_PERFORMANCE, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_EVALUATE_CHECKLIST_PERFORMANCE),
                Switch.toDefaultContext(),


                WaitUntil.the(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(RESTORE_PERFORMANCE_TECHNICAL_INFORMATION),



                WaitUntil.the(TAB_CHECK_LIST_SECURITY,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(TAB_CHECK_LIST_SECURITY),
                Click.on(TXT_ENGINEER_OF_SECURITY),
                Enter.theValue(dataCertification.getAssignedCybersecurity()).into(TXT_ENGINEER_OF_SECURITY),
                WaitUntil.the(TXT_ENGINEER_OF_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_ENGINEER_OF_SECURITY),
                SelectInTheList.theOption(TXT_ENGINEER_OF_SECURITY,OPTION_LIST,dataCertification.getAssignedCybersecurity()),


                Click.on(BTN_DEVSECOPS_ASSIGNED),
                Click.on(TXT_ENGINNER_OF_DEVSECOPS),
                Enter.theValue(dataCertification.getAssignedDevSecOps()).into(TXT_ENGINNER_OF_DEVSECOPS),
                WaitUntil.the(TXT_ENGINNER_OF_DEVSECOPS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_ENGINNER_OF_DEVSECOPS),
                SelectInTheList.theOption(TXT_ENGINNER_OF_DEVSECOPS,OPTION_LIST,dataCertification.getAssignedDevSecOps()),


                Click.on(TXT_HU_CYBERSECURITY),
                Enter.theValue(dataCertification.getCybersecurityHu()).into(TXT_HU_CYBERSECURITY),
                WaitUntil.the(TXT_HU_CYBERSECURITY, isVisible()).forNoMoreThan(15).seconds(),
                Hit.the(Keys.ENTER).into(TXT_HU_CYBERSECURITY),
                WaitUntil.the(BTN_SAVE,isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_SAVE),


                SwitchToFrame.switchToIframe(BrowseTheWeb.as(actor).getDriver(),0),
                Click.on(TXT_FIELDS_CHECKLIST_SECURITY),
                Scroll.to(TXT_FIELDS_CHECKLIST_SECURITY).andAlignToBottom(),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getItRiskRating()).into(TXT_FIELDS_CHECKLIST_SECURITY),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getTypeInitiative()).into(TXT_FIELDS_CHECKLIST_SECURITY),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getCybersecurityPerson()).into(TXT_FIELDS_CHECKLIST_SECURITY),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(dataCertification.getContinuousSecurityTesting()).into(TXT_FIELDS_CHECKLIST_SECURITY),
                WaitUntil.the(TXT_FIELDS_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),

                WaitUntil.the(BTN_EVALUATE_CHECKLIST_SECURITY, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_EVALUATE_CHECKLIST_SECURITY),
                Click.on(BTN_ATTACHMENTS),
                Click.on(BTN_ADD_ATTACHMENTS),
                Upload.theFile(Paths.get("C:\\Users\\Scastaño\\BANCOLOMBIA\\DOCUMENTOS GENERALES\\Proceso pruebas performance E2E.msg")).to(BTN_ADD_ATTACHMENTS),
                WaitUntil.the(BTN_SAVE,isVisible()).forNoMoreThan(20).seconds()







        );



    }

    public static HomePageTask enterData(DataCertification dataCertification) {
        return Tasks.instrumented(HomePageTask.class, dataCertification);
    }



}
