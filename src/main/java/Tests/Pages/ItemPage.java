package Tests.Pages;
import Tests.PageTools;
import Tests.Pages.PageActions.ItemAction;
import static com.codeborne.selenide.Selenide.*;

// Якщо Page функція має більше ніж 4 дії (строки)
// То виносити в {Page}Action

public class ItemPage extends PageTools {
    // TODO: Доддати поля з даними про ціну та назву (Елементи сторінки)
    public String itemUrl = "https://rozetka.com.ua/ua/apple-iphone-15-pro-1tb-white-titanium/p395461029/";

    // Метод для відкриття сторінки
    public void openItemPage() {
        open(itemUrl);
    }

    @Override
    public void StartTesting() {
        new ItemAction().performActions(); // Викликаємо глобальні дії на сторінці
    }
}
