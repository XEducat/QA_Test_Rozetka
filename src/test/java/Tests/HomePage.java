package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/features/Home_productSearch.feature",
        glue = "Tests.StepDefinitions",  // Provide the package containing the step definitions
        plugin = {
                "pretty",
                "html:target/cucumber-homepage-reports.html",
                "json:target/cucumber-homepage-reports.json"
        }
)

public class HomePage extends AbstractTestNGCucumberTests {
        // This class remains a Page Object, but does not contain steps
}
