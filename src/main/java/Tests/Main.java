package Tests;

// Якщо Page функція має більше ніж 4 дії (строки)
// То виносити в {Page}Action.

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
/// Page Tools,
/// Cucumber (BDD),
/// Pattern Pages,
/// Selenide,
/// Maven (command: mvn clean test),
/// TestNG.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}