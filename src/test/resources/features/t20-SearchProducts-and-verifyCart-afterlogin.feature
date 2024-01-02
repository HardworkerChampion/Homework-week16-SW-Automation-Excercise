Feature: Search Products and Verify cart after login

  1. Launch browser
  2. Navigate to url 'http://automationexercise.com'
  3. Click on 'Products' button
  4. Verify user is navigated to ALL PRODUCTS page successfully
  5. Enter product name in search input and click search button
  6. Verify 'SEARCHED PRODUCTS' is visible
  7. Verify all the products related to search are visible
  8. Add those products to cart
  9. Click 'Cart' button and verify that products are visible in cart
  10. Click 'Signup / Login' button and submit login details
  11. Again, go to Cart page
  12. Verify that those products are visible in cart after login as well
  @Test20
  Scenario: Verify that user can search products and verify cart after login
    When I am on homepage
    And I can verify that navigate to  url "https://automationexercise.com/"
    And Click on Products button
    And I Can see user is navigated to ALL PRODUCTS page successfully
    And I Enter product name"Tops" in search input and click search button
    And I can see SEARCHED PRODUCTS is visible
    And I  Click on Add to cart button
    And I  Click on View Cart button
   And I register with "upali","upali123@gmail.com","upali123","18","10","1982","upali","srilali","upaliltd","10 shri","krishna","India","gujarat","Ahmedabad","382345","9867342321"
    When Click on SignupLogin button
    And I Enter name and email address
    And I Click login button
    And I Click on cart button

