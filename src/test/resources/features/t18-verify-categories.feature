Feature: View category Products

  @Test18
  Scenario: Verify that user can click and see  categories
    Given I am on homepage
    When I Can see that categories are visible on left side bar
    And I Click on Women category
  And I Click on any category link under Women category, for example: Dress
  And I Can see  that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
  And  On left side bar, click on any sub-category link of Men category
  Then I Can see  that user is navigated to that category page