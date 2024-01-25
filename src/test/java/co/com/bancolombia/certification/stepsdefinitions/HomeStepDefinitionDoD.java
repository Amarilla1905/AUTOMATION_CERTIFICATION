package co.com.bancolombia.certification.stepsdefinitions;

import co.com.bancolombia.certification.models.DataCertification;
import co.com.bancolombia.certification.models.builders.DataBuilder;
import co.com.bancolombia.certification.tasks.HomePageTaskDoD;
import co.com.bancolombia.certification.utils.Url;
import co.com.bancolombia.certification.utils.reader.PropsCsv;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class HomeStepDefinitionDoD {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User_Certi");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }

    @Given("^that the user is successfully logged in page of DoD$")
    public void thatTheUserIsSuccessfullyLoggedInPageOfDoD() {

        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Url.URL));

    }

    @When("^we fill in the DoD fields$")
    public void weFillInTheDoDFields(List<Map<String,String>> columnId) throws IOException {
        DataCertification dataCertification;
        dataCertification = DataBuilder.dataTestPlan(PropsCsv.getDataCsv("DataTestPlan",
                columnId.get(0).get("id"))).build();

        OnStage.theActorInTheSpotlight().attemptsTo(HomePageTaskDoD.enterDataDoD(dataCertification));

    }

    @Then("^we can create the DoD successfully$")
    public void weCanCreateTheDoDSuccessfully() {

    }


}
