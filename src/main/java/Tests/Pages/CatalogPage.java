package Tests.Pages;

import Tests.PageTools;
import Tests.Pages.PageActions.CatalogAction;
import Tests.Models.ItemData;
import com.codeborne.selenide.*;
import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.*;

public class CatalogPage extends PageTools {
    public final String catalogURL = "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15";
    private CatalogAction catalogAction = new CatalogAction();

    private ItemData foundedItem;
    private ItemPage itemPage = new ItemPage();

    @Given("користувач збирає дані товару та відкриває каталог за запитом 'iPhone 15'")
    public void collectDataAndOpenCatalogPage() {
        itemPage.CollectItemData();
        open(catalogURL);
    }

    @When("користувач перевіряє наявність товару у каталозі та відкриває його")
    public void checkItemInCatalogAndOpen() {
        foundedItem = catalogAction.searchAndOpenItem(catalogURL, itemPage.nameText);
    }

    @Then("сторінка товару відкривається і всі параметри співпадають")
    public void verifyItemPage() {
        assertEquals(WebDriverRunner.url(), itemPage.URL, "URL не співпадає! Перехід на сторінку товару не відбувся.");
        assertNotNull(foundedItem.item, "Заголовок товару не знайдено!");
        assertEquals(foundedItem.titleText, itemPage.nameText, "Назва товару не співпадає!");
        assertEquals(foundedItem.priceText, itemPage.priceText, "Ціна товару не співпадає!");
    }
}