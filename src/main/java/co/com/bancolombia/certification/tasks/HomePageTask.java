package co.com.bancolombia.certification.tasks;


import co.com.bancolombia.certification.interactions.SelectInTheList;
import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.userinterfaces.HomePage;
import co.com.bancolombia.certification.userinterfaces.TestPlanPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import net.serenitybdd.screenplay.waits.WaitUntil;
import org.junit.Test;
import org.openqa.selenium.Keys;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomePageTask implements Task {

   DataCertification dataCertification;

   public HomePageTask(DataCertification dataCertification) {
     this.dataCertification = dataCertification;
    }



@Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //Log in
               //WaitUntil.the(HomePage.TXT_EMAIL_LOGIN, isVisible()).forNoMoreThan(20).seconds(),
               Enter.theValue("sarcas@bancolombia.com.co").into(HomePage.TXT_EMAIL_LOGIN),
               Click.on(HomePage.BTN_NEXT_LOGIN),
               Enter.theValue("GatosCIELOYMILO19*").into(HomePage.TXT_PASSWORD_LOGIN),
               Click.on(HomePage.BTN_LOG_IN_LOGIN),
                //Create of new work item
               Click.on(HomePage.BTN_NEW_WORK_ITEM_ICON),
               Click.on(HomePage.BTN_OPTION_TEST_PLAN),
               //Test plan and evidences
               WaitUntil.the(TestPlanPage.TXT_TITTLE_TEST_PLAN,isClickable()).forNoMoreThan(20).seconds(),
               Click.on(TestPlanPage.TXT_TITTLE_TEST_PLAN),
               Enter.theValue(dataCertification.getTittleTestPlan()).into(TestPlanPage.TXT_TITTLE_TEST_PLAN),
              /* Click.on(TestPlanPage.TXT_ASSIGNED_TEST_PLAN),
               Enter.theValue(dataCertification.getAssignedTo()).into(TestPlanPage.TXT_ASSIGNED_TEST_PLAN),
               Click.on(TestPlanPage.TXT_ASSIGNED_TEST_PLAN),
               SelectInTheList.theOption(TestPlanPage.TXT_ASSIGNED_TEST_PLAN, dataCertification.getAssignedTo()),*/

               Click.on(TestPlanPage.TXT_DESCRIPTION_TEST_PLAN),
               Enter.theValue(dataCertification.getDescription()).into(TestPlanPage.TXT_DESCRIPTION_TEST_PLAN),
               Enter.theValue(dataCertification.getTypeTestPlan()).into(TestPlanPage.TXT_TYPE_TEST_PLAN), WaitUntil.the(TestPlanPage.LINK_ADD_RELATED_PARENT, isVisible()).forNoMoreThan(20).seconds(),

               WaitUntil.the(TestPlanPage.LINK_ADD_RELATED_PARENT, isVisible()).forNoMoreThan(20).seconds(),
               Click.on(TestPlanPage.LINK_ADD_RELATED_PARENT),
               Click.on(TestPlanPage.TXT_NUM_HU),
               Enter.theValue(dataCertification.getRelatedParent()).into(TestPlanPage.TXT_NUM_HU),
               WaitUntil.the(TestPlanPage.TXT_NUM_HU, isVisible()).forNoMoreThan(14).seconds(),
               Hit.the(Keys.ENTER).into(TestPlanPage.TXT_NUM_HU),
               Click.on(TestPlanPage.BTN_SAVE_ADD_RELATED_PARENT),


           /* Falta relacionar la HU
           Click.on(TestPlanPage.LINK_ADD_RELATED_HU),
           Click.on(TestPlanPage.BTN_EXISTING_ITEM),
           Click.on(TestPlanPage.BTN_ARROW_RELATED_HU),
           SelectInTheList.theOption(TestPlanPage.TXT_PARENT_RELATED_HU, "Work"),
           Scroll.to(TestPlanPage.TXT_PARENT_RELATED_HU.of("Work")).andAlignToBottom(),
           SelectInTheList.theOption(TestPlanPage.TXT_PARENT_RELATED_HU,dataCertification.getFieldRelated()),
           Enter.theValue(dataCertification.getRelatedHu()).into(TestPlanPage.TXT_NUM_HU),
           WaitUntil.the(TestPlanPage.TXT_NUM_HU, isVisible()).forNoMoreThan(5).seconds(),
           Hit.the(Keys.ENTER).into(TestPlanPage.TXT_NUM_HU),
           Click.on(TestPlanPage.BTN_SAVE_ADD_RELATED_PARENT)*/


           Click.on(TestPlanPage.TAB_PERFORMANCE_TEST_PLAN),
           Click.on(TestPlanPage.TXT_APPLICATION_CODE),
           Enter.theValue("AW1003001").into(TestPlanPage.TXT_APPLICATION_CODE) ,
           Click.on(TestPlanPage.TXT_NAME_OF_APPLICATION_SOLUTION),
           Enter.theValue("CDH").into(TestPlanPage.TXT_NAME_OF_APPLICATION_SOLUTION),

           Click.on(TestPlanPage.TAB_CHECK_LIST_PERFORMANCE),
           Click.on(HomePage.BTN_SAVE),
           WaitUntil.the(TestPlanPage.TXT_INFO_E2E,isClickable()).forNoMoreThan(20).seconds(),
           Click.on(TestPlanPage.TXT_INFO_E2E),
           Enter.theValue("Modulares ").into(TestPlanPage.TXT_INFO_E2E)




















                );


    }

    public static HomePageTask enterData(DataCertification dataCertification) {
        return Tasks.instrumented(HomePageTask.class, dataCertification);
    }



}
