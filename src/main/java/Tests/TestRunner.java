package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeSuite;
import static com.codeborne.selenide.Selenide.*;

/// https://rozetka.com.ua/ua/apple-iphone-15-pro-1tb-white-titanium/p395461029/
///
/// 1 Перейти на ссылку с телефоном.
/// 2 Взять данные ( названия, цена).
/// 3 Главная страница.
/// 4 Ввести Iphone 15.
/// 4 Начать поиск.
/// 5 Найти модель.
/// 6 Проверить цену и название.
///
/// Technology:
/// ✅ Page Tools,
/// ✅ Cucumber (BDD),
/// ✅ Pattern Pages,
/// ✅ Selenide,
/// ✅ Maven (command: mvn clean test),
/// ✅ TestNG,
/// Allure-report UI.

@CucumberOptions(
        features = "src/main/resources/features",
        glue = "Tests.Pages",
        plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests
{
    @BeforeSuite
    public void openBrowserBeforeTests() {
        open("https://www.google.com"); // Браузер открывается перед всеми тестами
    }
}
