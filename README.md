# Test Site Features

This repository contains automated tests to verify key features of the website Rozetka.

## Features Tested:
1. **Product Search:** Verifies the product search functionality on the site.
2. **Product Display in Catalog:** Ensures the desired product appears correctly in the product catalog.

## Technology Stack:
- ✅ **Page Object Pattern** - For clean and maintainable test automation.
- ✅ **Cucumber (BDD)** - To write tests in Gherkin syntax (Behavior-Driven Development).
- ✅ **Pattern Pages** - Following the Page Object Model and the Page Factory pattern.
- ✅ **Selenide** - For browser automation, simplifying interactions with the web pages.
- ✅ **Maven** - For building and managing the project. Run tests with: `mvn clean test`.
- ✅ **TestNG** - For test execution and parallel testing.
- ✅ **Allure Report UI** - To generate interactive and visual reports for test results.

## How to Run the Tests:
1. Clone the repository:
   ```bash
   git clone https://github.com/XEducat/QA_Test_Rozetka.git

2. Navigate to the project directory:
   cd {your-project-directory}

3. Run the tests:
   mvn clean test

4. View Allure Report: After the tests are executed, generate the Allure report by running:
   mvn allure:serve
