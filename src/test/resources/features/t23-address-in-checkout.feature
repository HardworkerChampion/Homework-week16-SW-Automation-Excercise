Feature: Address details in Checkout

  Scenario: Verify that user can create account and delete
  1. Launch browser
    Given I am on homepage
    When I can verify that navigate to  url "https://automationexercise.com/"
    And Click on SignupLogin button
    And I Create account with username"akilo",emailAddress"akilo123@gmail.com",password"akila321",day"18",month"10",year"2000",firstName"akil",lastName"patel",company"akolaltd",addressone "19",addresstwo "paulhan road",country"India",state"gujarat",city"Ahmedabad",zipcode"382345",mobile"9935223311"
    And I can see that ACCOUNT CREATED! is visible
    And I can see  that Logged in as "akilo" is visible
    And I Add products to cart
    And I Click on cart button
    And I can see  that cart page is displayed
    And I  Click Proceed To Checkout
#  12. Verify that the delivery address is same address filled at the time registration of account
#  13. Verify that the billing address is same address filled at the time registration of account
    And I Click Delete Account button
    Then I can see that ACCOUNT DELETED! is visible