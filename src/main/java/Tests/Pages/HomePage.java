package Tests.Pages;

import Tests.PageTools;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends PageTools {
    public final String URL = "https://rozetka.com.ua/ua/";
    public final String catalogURL = "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15";

    // Локатори
    private SelenideElement searchInput = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/div/div/input");
    private SelenideElement searchButton = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/button");

    @Given("користувач відкриває головну сторінку Rozetka")
    public void openHomePage() {
        open(URL);
    }

    @When("користувач вводить {string} у поле пошуку та натискає кнопку пошуку")
    public void searchForItem(String itemName) {
        searchInput.setValue(itemName);
        clickOn(searchButton, 2000);
    }

    @Then("сторінка каталогу {string} відкривається")
    public void verifyCatalogPage(String catalogURL) {
        Assert.assertTrue(isOnPage(catalogURL), "Перехід на сторінку каталогу не був успішним");
    }
}
