Feature: Add to cart from Recommended items

  1. Launch browser
  2. Navigate to url 'http://automationexercise.com'
  3. Scroll to bottom of page
  4. Verify 'RECOMMENDED ITEMS' are visible
  5. Click on 'Add To Cart' on Recommended product
  6. Click on 'View Cart' button
  7. Verify that product is displayed in cart page

  @Test22
  Scenario: Verify that user can add items from recommended product
    Given I am on homepage
    When I can verify that navigate to  url "https://automationexercise.com/"
    And I Scroll down to Recommended Items
    And I can see "RECOMMENDED ITEMS" are visible
    And I Click on Add To Cart on Recommended product"Blue"
    And I Click View Cart button
    Then I can see "Blue" is displayed in cart page
