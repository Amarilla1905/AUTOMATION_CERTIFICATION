package co.com.bancolombia.certification.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/home_bancolombia_tp.feature",
                snippets = SnippetType.CAMELCASE,
              //  tags = {"@TestPlan"},
                glue= "co.com.bancolombia.certification.stepsdefinitions"


)
public class HomeRunnerTP {
}
