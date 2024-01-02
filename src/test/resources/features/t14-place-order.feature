Feature: Place order

  @Test14
  Scenario: Verify that user can add product in cart
    Given I am on homepage
    When I Add products to cart
    And I Click Cart button
    And I can see  that cart page is displayed
    And I  Click Proceed To Checkout
   And  I Click RegisterLogin button
    And I Create account with username"akilo",emailAddress"akilo123@gmail.com",password"akila321",day"18",month"10",year"2000",firstName"akil",lastName"patel",company"akolaltd",addressone "19",addresstwo "paulhan road",country"India",state"gujarat",city"Ahmedabad",zipcode"382345",mobile"9935223311"
  And I can see that ACCOUNT CREATED! is visible
  And I Click Continue button
And I can see  that Logged in as "akilo" is visible
And I Click Cart button
And I  Click Proceed To Checkout
#  14. Verify Address Details and Review Your Order
#  15. Enter description in comment text area and click 'Place Order'
#  16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
#  17. Click 'Pay and Confirm Order' button
#  18. Verify success message 'Your order has been placed successfully!'
#  19. Click 'Delete Account' button
#  20. Verify 'ACCOUNT DELETED!' and click 'Continue' button