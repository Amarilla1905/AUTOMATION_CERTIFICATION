package co.com.bancolombia.certification.stepsdefinitions;

import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.models.builders.DataBuilder;
import co.com.bancolombia.certification.tasks.HomePageTaskTestPlan;
import co.com.bancolombia.certification.utils.Url;
import co.com.bancolombia.certification.utils.reader.PropsCsv;
import co.com.bancolombia.certification.utils.webdriver.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomeStepDefinition{


    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User_Certi");

    }



    @Given("that the user is successfully logged in")
    public void thatTheUserIsSuccessfullyLoggedIn() {

        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(WebDriver.inLZ().testPlan()));

    }

    @When("we fill in the test plan fields")
    public void weFillInTheTestPlanFields(List<Map<String,String>> columnId) throws IOException {
            DataCertification dataCertification;
            dataCertification = DataBuilder.dataTestPlan(PropsCsv.getDataCsv("DataTestPlan",
                    columnId.get(0).get("id"))).build();

        OnStage.theActorInTheSpotlight().attemptsTo(HomePageTaskTestPlan.enterData(dataCertification));

    }

    @Then("we can create the test plan successfully")
    public void weCanCreateTheTestPlanSuccessfully() {

    }



}



