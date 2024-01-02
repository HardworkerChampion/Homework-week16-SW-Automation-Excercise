Feature: Registration

@Test1
  Scenario Outline: Verify that user should login successfully
    Given I am on homepage
#  1. Launch browser
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully
When Click on SignupLogin button
And I Verify New User Signup! is visible
And I Enter name and email address
And I Click Signup button
And I Can see ENTER ACCOUNT INFORMATION is visible
  And I Fill details: Title, "<password>", "<date>","<month>","<year>"
And I Select checkbox Sign up for our newsletter!
And I Select checkbox Receive special offers from our partners!
And I Fill details: "<firstname>", "<lastname>", "<company>", "<address>", "<address2>", "<country>", "<state>", "<city>", "<zipcode>", "<mobile number>"
And I Click Create Account button
And I can see that ACCOUNT CREATED! is visible
And I Click Continue button
And I can see  that Logged in as "<username>" is visible
And I Click Delete Account button
  Then I can see that ACCOUNT DELETED! is visible
  And click Continue button
  Examples:
    | password | date | month | year | firstname | lastname | company        | address            | address2     | country | state   | city      | zipcode | mobile number | username |
    | John123  | 8    | 8     | 1992 | john      | smith    | network energy | a 48 janki heights | krishnanagar | India   | gujarat | Ahmedabad | 382345  | 9924113255    |John      |
