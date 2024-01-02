Feature: View cart and brand products

  @Test19
Scenario: Verify that user can navigate to brand page
  Given I am on homepage
  When Click on Products button
    And I Can see that Brands are visible on left side bar
  And I Click on any brand name
  And I Can see  that user is navigated to brand page and brand products are displayed
  And I Click On left side bar, click on any other brand link
  Then I Can see that user is navigated to that brand page and can see products