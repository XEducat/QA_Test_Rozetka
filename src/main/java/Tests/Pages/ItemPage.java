package Tests.Pages;

import Tests.PageTools;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

// Якщо Page функція має більше ніж 4 дії (строки)
// То виносити в {Page}Action

public class ItemPage extends PageTools {
    public final String URL = "https://rozetka.com.ua/ua/apple-iphone-15-pro-1tb-white-titanium/p395461029/";
    public String nameText = "";
    public String priceText = "";

    // Локатори
    private SelenideElement nameElement = $x("/html/body/rz-app-root/div/div[1]/rz-product/div/rz-product-tab-main/div[1]/div[1]/div[2]/div/rz-title-block/div/div[1]/div/h1");
    private SelenideElement priceElement = $x("/html/body/rz-app-root/div/div[1]/rz-product/div/rz-product-tab-main/div[1]/div[1]/div[2]/div/rz-product-main-info/div/div[2]/div/div[1]/p[2]");

    public void CollectItemData(){
        open(URL);
        nameText = nameElement.getText().trim();
        priceText = priceElement.getText().trim();
    }
}
