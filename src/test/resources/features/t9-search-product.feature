Feature: Search Product

#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
  @Test9
  Scenario: Verify that User should navigate to search page
    Given I am on homepage
 When Click on Products button
    And I Can see user is navigated to ALL PRODUCTS page successfully
  And I Enter product name"Tops" in search input and click search button
  And I can see SEARCHED PRODUCTS is visible
  Then I Can  all the products related to search are visible