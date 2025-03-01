package Pages.PageActions;

import Pages.CatalogPage;
import Pages.Models.ItemData;
import Tools.PageTools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class CatalogAction extends PageTools {
    public ItemData searchAndOpenItem(String catalogURL, String itemName) {
        open(catalogURL);

        SelenideElement foundedItem = $$x("//app-goods-tile-default")
                .findBy(Condition.text(itemName))
                .shouldBe(Condition.exist, Condition.visible);

        foundedItem.click();
        Selenide.sleep(2000);

        String itemNameText = getElementText("//rz-title-block//h1");
        String itemPriceText = getElementText("//rz-product-main-info//p[2]");

        return new ItemData(foundedItem, itemNameText, itemPriceText);
    }
}
