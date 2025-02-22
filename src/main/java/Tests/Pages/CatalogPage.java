package Tests.Pages;

import Tests.Pages.PageActions.CatalogAction;
import Tests.Models.ItemData;
import com.codeborne.selenide.*;
import io.cucumber.java.en.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

@CucumberOptions(
        features = "src/main/resources/features/productAvailabilityСheck.feature",
        glue = "Tests.Pages",
        plugin = {
                "pretty",
                "html:target/cucumber-catalogpage-reports.html",
                "json:target/cucumber-catalogpage-reports.json"
        }
)
public class CatalogPage extends AbstractTestNGCucumberTests {
    public final String catalogURL = "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15";
    private CatalogAction catalogAction = new CatalogAction();

    private ItemData foundedItem;
    private ItemPage itemPage = new ItemPage();

    @BeforeSuite
    public void openBrowserBeforeTests() {
        open("https://www.google.com"); // Браузер відкривається перед усіма тестами
    }

    @Given("the user collects product data and opens the catalog for the query 'iPhone 15'")
    public void collectDataAndOpenCatalogPage() {
        itemPage.CollectItemData();
        open(catalogURL);
    }

    @When("the user checks for the product in the catalog and opens it")
    public void checkItemInCatalogAndOpen() {
        foundedItem = catalogAction.searchAndOpenItem(catalogURL, itemPage.nameText);
    }

    @Then("the product page opens and all parameters match")
    public void verifyItemPage() {
        assertEquals(WebDriverRunner.url(), itemPage.URL, "URL не співпадає! Перехід на сторінку товару не відбувся.");
        assertNotNull(foundedItem.item, "Заголовок товару не знайдено!");
        assertEquals(foundedItem.titleText, itemPage.nameText, "Назва товару не співпадає!");
        assertEquals(foundedItem.priceText, itemPage.priceText, "Ціна товару не співпадає!");
    }
}