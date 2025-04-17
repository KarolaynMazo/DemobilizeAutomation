#Author: Karolayn.mazo@gmail.com
Feature: As QA Analyst
   I need to see the products of the category laptos

  Background:
    Given that 'customer' wants to navigate to the page Demoblaze

  Scenario: Customer wants to navegate to laptos category
    When customer makes the selection of "Laptops"
    Then should see a list of products

  @Segundo
  Scenario Outline: Customer wants to go to the Category and select a Product
    When select the Category and select a Product
      | Category   | Product   | Price   | Description   |
      | <Category> | <Product> | <Price> | <Description> |
    Then I verify the name of the
      | Product   | Price   | Description   |
      | <Product> | <Price> | <Description> |

    Examples:
      | Category | Product      | Price | Description                                                                                                                                                                                                                     |
      | Laptops  | MacBook air  |   700 |                                          1.6GHz dual-core Intel Core i5 (Turbo Boost up to 2.7GHz) with 3MB shared L3 cache Configurable to 2.2GHz dual-core Intel Core i7 (Turbo Boost up to 3.2GHz) with 4MB shared L3 cache. |
      | Laptops  | Sony vaio i5 |   790 | Sony is so confident that the VAIO S is a superior ultraportable laptop that the company proudly compares the notebook to Apple's 13-inch MacBook Pro. And in a lot of ways this notebook is better, thanks to a lighter weight |
