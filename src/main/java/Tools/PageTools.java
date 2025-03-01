package Tools;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public abstract class PageTools {
    public boolean isOnPage(String expectedUrl) {
        try {
            return WebDriverRunner.url().contains(expectedUrl);
        } catch (Exception e) {
            System.out.println("Помилка при перевірці URL: " + e.getMessage());
            return false;
        }
    }

    protected void clickOn(SelenideElement button, int waitTimeAfter) {
        if (button.is(Condition.visible) && button.is(Condition.enabled)) {
            button.click();
            sleep(waitTimeAfter);
        } else {
            throw new IllegalStateException("Кнопка не клікабельна: " + button);
        }
    }

    public String getElementText(SelenideElement element) {
        try {
            return element.exists() && element.isDisplayed() ? element.getText().trim() : "";
        } catch (Exception e) {
            throw new RuntimeException("Не вдалося витягти елемент", e);
        }
    }

    public String getElementText(String xpath) {
        return getElementText($x(xpath));
    }

    public SelenideElement getElementByXPath(String xPath) {
        try {
            SelenideElement element = $x(xPath);
            return (element.exists() && element.isDisplayed()) ? element : null;
        } catch (Exception e) {
            throw new RuntimeException("Не вдалося знайти або отримати елемент за шляхом: " + xPath, e);
        }
    }
}