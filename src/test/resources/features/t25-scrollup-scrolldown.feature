Feature: ScrollUp and ScrollDown

  1. Launch browser

@Test25
  Scenario: Verify User can scroll up and down
    Given I am on homepage
    When I can verify that navigate to  url "https://automationexercise.com/"
  And I Scroll down to footer
    And Verify text SUBSCRIPTION
  And I Click on arrow at bottom right side to move upward
  And I can Verify that page is scrolled up and "Full-Fledged practice website for Automation Engineers" text is visible on screen