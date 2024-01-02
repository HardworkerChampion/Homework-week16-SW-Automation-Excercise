Feature: CartPage subscription

  @Test11
  Scenario: Verify User can subscribe on Cart Page
    Given I am on homepage
    When I Click on cart button
    And I Scroll down to footer
    And Verify text SUBSCRIPTION
    And Enter email address"john@gmail.com" in input and click arrow button
  Then I Verify success message You have been successfully subscribed! is visible