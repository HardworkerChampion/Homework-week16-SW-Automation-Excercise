Feature: Verify quantity in cart
@Test13
  Scenario: Verify that user can add qty
    Given I am on homepage
  When Click View Product for any product on home page
  And I Can see product detail is opened
 And I Increase quantity to "4"
 And I  Click on Add to cart button
 And I  Click on View Cart button
  Then I Can see  that product is displayed in cart page with exact quantity