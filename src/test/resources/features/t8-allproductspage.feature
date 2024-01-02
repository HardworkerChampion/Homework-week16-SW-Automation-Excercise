Feature: All Products Page

  @Test8
  Scenario: Verify that  All Products and product detail page
    Given I am on homepage
    When Click on Products button
    And I Can see user is navigated to ALL PRODUCTS page successfully
    And The products list is visible
    And I Click on View Product of first product
    And  I is landed to product detail page
    Then Verify that detail detail is visible: product name, category, price, availability, condition, brand