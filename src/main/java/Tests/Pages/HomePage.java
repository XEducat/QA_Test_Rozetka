package Tests.Pages;


import Tests.PageTools;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends PageTools {
    public final String URL = "https://rozetka.com.ua/ua/";
    public final String catalogURL = "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15";

    // Локатори
    private SelenideElement searchInput = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/div/div/input");
    private SelenideElement searchButton = $x("/html/body/rz-app-root/div/div[1]/rz-main-header/header/div/div/div/rz-search-suggest/form/div[1]/button");

    // Пошук товарів за запитом: "Iphone 15"
    /**
     * Cucumber-стиль коментарів:
     * Given я відкриваю головну сторінку
     * When я вводжу "Iphone 15" в поле пошуку
     * And я натискаю кнопку пошуку
     * Then я переходжу на сторінку каталогу iPhone 15
     */
    @Test
    public void testSearchItems() {
        open(URL);
        searchInput.setValue("Iphone 15");
        clickOn(searchButton, 3000);

        // Використовуємо assertTrue, щоб перевірити, чи сторінка відкрита
        Assert.assertTrue(isOnPage(catalogURL), "Перехід на сторінку каталогу не був успішним");
    }
}
