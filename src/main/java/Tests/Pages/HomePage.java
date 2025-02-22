package Tests.Pages;

import Tests.PageTools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.Assert;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.*;

@CucumberOptions(
        features = "src/main/resources/features/productSearch.feature",
        glue = "Tests.Pages",
        plugin = {
                "pretty",
                "html:target/cucumber-homepage-reports.html",
                "json:target/cucumber-homepage-reports.json"
        }
)
public class HomePage extends AbstractTestNGCucumberTests {
    private PageTools pageTools = new PageTools();;
    public final String URL = "https://rozetka.com.ua/ua/";

    // Locators
    private SelenideElement searchInput = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/div/div/input");
    private SelenideElement searchButton = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/button");

    @BeforeSuite
    public void openBrowserBeforeTests() {
        open("https://www.google.com");
    }

    @Given("user opens Rozetka home page")
    public void openHomePage() {
        open(URL);
    }

    @When("user enters {string} in search box and clicks search button")
    public void searchForItem(String itemName) {
        searchInput.setValue(itemName);
        pageTools.clickOn(searchButton, 2000);
    }

    @Then("catalog page {string} opens")
    public void verifyCatalogPage(String catalogURL) {
        Assert.assertTrue(pageTools.isOnPage(catalogURL), "Перехід на сторінку каталогу не був успішним");
    }
}
