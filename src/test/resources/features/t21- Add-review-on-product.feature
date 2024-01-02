Feature: Add review on Products

@Test21
  Scenario: Verify that user can add review on products
    When I am on homepage
    And I can verify that navigate to  url "https://automationexercise.com/"
    And Click on Products button
    And I Can see user is navigated to ALL PRODUCTS page successfully
    And I Click on View Product of first product on Product Page
    And Verify "WRITE YOUR REVIEW" is visible
    And I  Enter name"john", email"john123@gmail.com" and review"hello"
    And I Click On Submit button
    Then I can see the success message"Thank you for your review."

