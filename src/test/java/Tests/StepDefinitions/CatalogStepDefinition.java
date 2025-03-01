package Tests.StepDefinitions;

import Pages.CatalogPage;
import Pages.ItemPage;
import Pages.Models.ItemData;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.*;

import static org.testng.Assert.*;

public class CatalogStepDefinition {
    private CatalogPage catalogPage = new CatalogPage();
    private ItemData expectedItem;
    private ItemData foundedItem;

    @Given("the user collects product data and opens the catalog for the query 'iPhone 15'")
    public void collectDataAndOpenCatalogPage() {
        expectedItem = catalogPage.collectDataCatalogPage();
    }

    @When("the user checks for the product in the catalog and opens it")
    public void checkItemInCatalogAndOpen() {
        foundedItem = catalogPage.checkItemInCatalogAndOpen(expectedItem);
    }

    @Then("the product page opens and all parameters match")
    public void verifyItemPage() {
        assertEquals(WebDriverRunner.url(), ItemPage.URL, "URL не співпадає! Перехід на сторінку товару не відбувся.");
        assertEquals(foundedItem.titleText, expectedItem.titleText, "Назва товару не співпадає!");
        assertEquals(foundedItem.priceText, expectedItem.priceText, "Ціна товару не співпадає!");
    }
}
