Feature: Пошук товару на сайті Rozetka

  Scenario: Користувач шукає iPhone 15
    Given користувач відкриває головну сторінку Rozetka
    When користувач вводить "iPhone 15" у поле пошуку та натискає кнопку пошуку
    Then сторінка каталогу "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15" відкривається
