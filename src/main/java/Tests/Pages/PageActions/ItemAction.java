package Tests.Pages.PageActions;

import Tests.Pages.ItemPage;
import com.codeborne.selenide.Selenide;

public class ItemAction {

    private ItemPage itemPage = new ItemPage();

    // Виконати всі дії на сторінці
    public void performActions() {
        // Відкрити сторінку
        itemPage.openItemPage();

        // Скролимо вниз
        itemPage.scrollDown();

        // Затримка на 2 секунди
        Selenide.sleep(2000);

        // Скролимо вверх
        itemPage.scrollUp();

        // Затримка на 2 секунди
        Selenide.sleep(2000);
    }
}
