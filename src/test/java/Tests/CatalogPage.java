package Tests;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/features/productAvailabilityСheck.feature",
        glue = "Tests.StepDefinitions",  // Указываем правильный пакет с шагами!
        plugin = {
                "pretty",
                "html:target/cucumber-catalogpage-reports.html",
                "json:target/cucumber-catalogpage-reports.json"
        }
)
public class CatalogPage extends AbstractTestNGCucumberTests {
    // Этот класс остается Page Object, но не содержит шагов
}