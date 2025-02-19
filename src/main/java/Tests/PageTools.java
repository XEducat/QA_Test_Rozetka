package Tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.sleep;

public abstract class PageTools {

    public boolean scrollDown() {
        try {
            Selenide.executeJavaScript("window.scrollBy(0,500)");
            return true;
        } catch (Exception e) {
            System.out.println("Помилка при скролі вниз: " + e.getMessage());
            return false;
        }
    }

    public boolean scrollUp() {
        try {
            Selenide.executeJavaScript("window.scrollBy(0,-500)");
            return true;
        } catch (Exception e) {
            System.out.println("Помилка при скролі вверх: " + e.getMessage());
            return false;
        }
    }

    protected boolean isOnPage(String expectedUrl) {
        try {
            return WebDriverRunner.url().contains(expectedUrl);
        } catch (Exception e) {
            System.out.println("Помилка при перевірці URL: " + e.getMessage());
            return false;
        }
    }

    public void clickOn(SelenideElement button, int waitTimeAfter) {
        if (button.is(Condition.visible) && button.is(Condition.enabled)) {
            button.click();
            sleep(waitTimeAfter);
        } else {
            throw new IllegalStateException("Кнопка не клікабельна: " + button);
        }
    }
}