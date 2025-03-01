package Pages.Models;

import com.codeborne.selenide.SelenideElement;

public class ItemData {
    public SelenideElement item;
    public String titleText;
    public String priceText;

    public ItemData(SelenideElement foundedItem, String itemNameText, String itemPriceText) {
        this.item = foundedItem;
        this.titleText = itemNameText;
        this.priceText = itemPriceText;
    }

    public ItemData(String itemNameText, String itemPriceText) {
        this.titleText = itemNameText;
        this.priceText = itemPriceText;
    }
}
