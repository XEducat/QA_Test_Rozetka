package Pages;

import Pages.Models.ItemData;
import Pages.PageActions.CatalogAction;
import Tools.PageTools;

public class CatalogPage extends PageTools {
    public static final String CATALOG_URL = "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15";
    private final CatalogAction catalogAction = new CatalogAction();

    public ItemData collectDataCatalogPage() {
        return new ItemPage().collectItemData();
    }

    public ItemData checkItemInCatalogAndOpen(ItemData item) {
        return catalogAction.searchAndOpenItem(CATALOG_URL, item.titleText);
    }
}
