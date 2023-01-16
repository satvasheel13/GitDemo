Feature: Cheakout product to cart
  I want to use this template for my feature file
  @Checkout
  Scenario Outline: Searching a product on Greenkart website
    Given User is on greencart landing page
    When User is serach product with short name <shortname> and extract the result
    And Added "3" product of the selected product in cart
    Then User is proceeds to the cheack validate the productname <name> in the checkout page
    And User is able to see promo code and place the order

    Examples: 
      | shortname | name   |
      | Tom       | Tomato |
      | Bea       | Bean  |
