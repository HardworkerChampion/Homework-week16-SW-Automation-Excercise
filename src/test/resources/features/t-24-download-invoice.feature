Feature: Download Invoice

  1. Launch browser
@Test24
  Scenario: Verify that User can download Invoice
    Given I am on homepage
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
    When I can verify that navigate to  url "https://automationexercise.com/"
    And I Add products to cart
#  5. Click 'Cart' button
    And I Click View Cart button
    And I can see  that cart page is displayed
    And I  Click Proceed To Checkout
    And I Click RegisterLogin button
    And I Create account with username"akilo",emailAddress"akilo123@gmail.com",password"akila321",day"18",month"10",year"2000",firstName"akil",lastName"patel",company"akolaltd",addressone "19",addresstwo "paulhan road",country"India",state"gujarat",city"Ahmedabad",zipcode"382345",mobile"9935223311"
    And I can see that ACCOUNT CREATED! is visible
    And I Click Continue button
    And I can see  that Logged in as "akilo" is visible
    And I Click Cart button
    And I  Click Proceed To Checkout
#   Verify Address Details and Review Your Order
    And I Enter description in comment text area"hello" and click Place Order
    And I Enter payment details: Name on Card"Silva clone", Card Number"2222 4444 4444", CVC"153", Expiration date"12","2030"
  And I Click on Pay and Confirm Order button
  And I can see Verify success message "Congratulations! Your order has been confirmed!"
  And I Click Download Invoice button and verify invoice is downloaded successfully.
  And I Click Continue button
  And I Click Delete Account button
  Then I can see that ACCOUNT DELETED! is visible