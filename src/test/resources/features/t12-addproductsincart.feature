Feature: Add products in card

  1. Launch browser
  2. Navigate to url 'http://automationexercise.com'
  3. Verify that home page is visible successfully

  @Test12
  Scenario: Verify that user should add products on cart
    Given I am on homepage
    When Click on Products button
    And I Hover over first product and click Add to cart
    And I Click Continue Shopping button
    And I  Hover over second product and click Add to cart
    And I Click View Cart button
    And I Can see both products are added to Cart
Then I Can see  their prices, quantity and total price