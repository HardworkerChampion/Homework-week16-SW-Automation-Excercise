Feature: Login with incorrect credentials
@Test3
  Scenario: Verify that User shouldNot Login with incorrect email and password
    Given I am on homepage
#1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
  #  4. Click on 'Signup / Login' button
    When Click on SignupLogin button
#  5. Verify 'Login to your account' is visible
    And I can see Login to your account is visible
    And I Enter incorrect email address"chetan@gmail.com"  and password"chetan123"
#  7. Click 'login' button
    And I Click login button
#  8. Verify error 'Your email or password is incorrect!' is visible
    Then I can see the errorMessage