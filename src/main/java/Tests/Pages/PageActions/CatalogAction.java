package Tests.Pages.PageActions;

import Tests.Models.ItemData;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CatalogAction {

    public ItemData searchAndOpenItem(String catalogURL, String itemName) {
        open(catalogURL);

        SelenideElement foundedItem = $$x("//app-goods-tile-default")
                .findBy(Condition.text(itemName))
                .$x(".//rz-button-product-page[2]/rz-indexed-link")
                .shouldBe(Condition.exist, Condition.visible);

        foundedItem.click();
        Selenide.sleep(2000);

        String itemNameText = getElementText("//rz-title-block//h1", "Не вдалося отримати назву товару!");
        String itemPriceText = getElementText("//rz-product-main-info//p[2]", "Не вдалося отримати ціну товару!");

        return new ItemData(foundedItem, itemNameText, itemPriceText);
    }

    private String getElementText(String xpath, String errorMessage) {
        try {
            return $x(xpath).shouldBe(Condition.visible).getText().trim();
        } catch (Exception e) {
            throw new RuntimeException(errorMessage, e);
        }
    }
}
