package Tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/productAvailabilityСheck.feature",
        glue = "Tests.StepDefinitions",
        plugin = {
                "pretty",
                "html:target/cucumber-catalogpage-reports.html",
                "json:target/cucumber-catalogpage-reports.json"
        }
)
public class CatalogPage extends AbstractTestNGCucumberTests {
        // This class remains a Page Object, CatalogStepDefinitions contain steps
}