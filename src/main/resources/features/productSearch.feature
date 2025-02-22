Feature: Home Page Tests

  Scenario: Product Search via Search Box
    Given user opens Rozetka home page
    When user enters "iPhone 15" in search box and clicks search button
    Then catalog page "https://rozetka.com.ua/ua/mobile-phones/c80003/producer=apple;series=iphone-15,iphone-15-plus,iphone-15-pro,iphone-15-pro-max/#search_text=iphone+15" opens