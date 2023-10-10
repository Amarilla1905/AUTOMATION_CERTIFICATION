package co.com.bancolombia.certification.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;




@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/home_bancolombia.feature",
                 glue= "co.com.bancolombia.certification.stepsdefinitions",
                 tags = "@TestPlan",
                 snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class HomeRunner {
}
