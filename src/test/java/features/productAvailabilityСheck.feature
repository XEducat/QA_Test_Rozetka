Feature: Tests for a product catalog page

  Scenario: Checking the availability of a product in the catalog
    Given the user collects product data and opens the catalog for the query 'iPhone 15'
    When the user checks for the product in the catalog and opens it
    Then the product page opens and all parameters match

