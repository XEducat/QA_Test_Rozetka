package Tests;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Condition;
import static com.codeborne.selenide.Selenide.*;

public abstract class PageTools {
    public boolean clickTo(String selector) {
        try {
            $(selector).shouldBe(Condition.visible).click();
            return true;
        } catch (Exception e) {
            System.out.println("Помилка при кліку: " + e.getMessage());
            return false;
        }
    }

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

    public abstract void StartTesting();
}