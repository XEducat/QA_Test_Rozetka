package Pages;

import Tools.PageTools;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends PageTools {
    public static final String URL = "https://rozetka.com.ua/ua/";

    private final SelenideElement searchInput = $x("//input[@name='search']");
    private final SelenideElement searchButton = $x("//button[contains(@class,'search-form__submit')]");

    public void openHomePage() {
        open(URL);
    }

    public void searchForItem(String itemName) {
        searchInput.setValue(itemName);
        clickOn(searchButton, 2000);
    }
}
