Feature: Contact us Form

  @Test6
  Scenario: User can contact
    When I Click on Contact Us button
    And I can see GET IN TOUCH is visible
    And I Enter name"john", email"john@gmail.com", subject"hello" and message"I m just testing"
    And I Upload file"C:\\Users\\POOJA\\Desktop\\hp.txt"
    And Click Submit button
    And I Click OK button
    And I can see  success message Success! Your details have been submitted successfully. is visible
    Then I Click Home button and verify that landed to home page successfully