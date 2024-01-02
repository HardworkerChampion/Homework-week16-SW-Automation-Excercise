Feature: Remove product from cart

  @Test17
  Scenario: Verify that user can remove product from cart
    Given I am on homepage
    And  I Add products to cart
    And I Click Cart button
    And I can see  that cart page is displayed
  And  I  Click on X button corresponding to particular product
  Then I can see  that product is removed from the cart