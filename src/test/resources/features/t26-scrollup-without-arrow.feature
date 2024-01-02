Feature: Scroll Up without arrow button

  1. Launch browser
  2. Navigate to url 'http://automationexercise.com'
  3. Verify that home page is visible successfully
  4. Scroll down page to bottom
  5. Verify 'SUBSCRIPTION' is visible
  6. Scroll up page to top
  7. Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

 @Test26
 Scenario: Verify User can scroll up and down
    Given I am on homepage
    When I can verify that navigate to  url "https://automationexercise.com/"
    And I Scroll down to footer
    And Verify text SUBSCRIPTION
   And I Scroll up page to top
   And I can Verify that page is scrolled up and "Full-Fledged practice website for Automation Engineers" text is visible on screen