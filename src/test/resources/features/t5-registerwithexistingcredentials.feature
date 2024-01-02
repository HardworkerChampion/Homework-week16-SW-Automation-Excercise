Feature: Register with existing credentials
@Test5
  Scenario: Verify that User Register  with existing email
    When Click on SignupLogin button
   And I can see the New User Signup! is visible
And I Enter name"John" and already registered email address"john123@gmail.com"
  And I Click Signup button
  Then I ca see error Email Address already exist! is visible