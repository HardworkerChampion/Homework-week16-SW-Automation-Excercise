Feature: Subscription Verification

#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
  @Test10
  Scenario: Verify that User can subscribe the page and see the success message
    Given I am on homepage
    When I Scroll down to footer
    And Verify text SUBSCRIPTION
    And I Enter email address"john@gmail.com" in input
    And I click arrow button

#  Then I can see  success message You have been successfully subscribed! is visible