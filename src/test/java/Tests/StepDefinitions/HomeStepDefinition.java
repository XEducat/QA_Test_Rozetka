package Tests.StepDefinitions;

import Pages.HomePage;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class HomeStepDefinition {
    private HomePage homePage = new HomePage();

    @Given("user opens Rozetka home page")
    public void openHomePage() {
        homePage.openHomePage();
    }

    @When("user enters {string} in search box and clicks search button")
    public void searchForItem(String itemName) {
        homePage.searchForItem(itemName);
    }

    @Then("catalog page {string} opens")
    public void verifyCatalogPage(String pageURL) {
        Assert.assertEquals(WebDriverRunner.url(), pageURL, "Incorrect transition to directory page");
    }
}