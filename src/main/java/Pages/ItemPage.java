package Pages;

import Pages.Models.ItemData;
import Tools.PageTools;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ItemPage extends PageTools {
    public static final String URL = "https://rozetka.com.ua/ua/apple-iphone-15-256gb-black/p395460642/";

    private final SelenideElement nameElement = $x("//rz-title-block//h1");
    private final SelenideElement priceElement = $x("//rz-product-main-info//p[2]");

    public ItemData collectItemData() {
        open(URL);
        return new ItemData(
                getElementText(nameElement),
                getElementText(priceElement)
        );
    }
}
