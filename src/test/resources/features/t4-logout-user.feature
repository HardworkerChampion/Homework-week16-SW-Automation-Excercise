Feature: User should Logout

  @Test4
  Scenario Outline: Verify that User should logout successfully
    Given I am on homepage
    When Click on SignupLogin button
    And I can see Login to your account is visible
    And I Enter correct "<email>" and "<password>"
    And I register with "<username>","<emailAddress>","<password>","<day>","<month>","<year>","<firstName>","<lastName>","<company>","<address1>","<address2>","<country>","<state>","<city>","<zipcode>","<mobile>"
    And I Enter correct "<email>" and "<password>"
    And I Click login button
    And I can see  that Logged in as "<username>" is visible
    And I Click Logout button
    And I can see Login to your account is visible

    Examples:

      | username | emailAddress   | password | day | month | year | firstName | lastName | company   | address1          | address2          | country       | state     | city     | zipcode | mobile       | email          |
#      | amin     | amin@gmail.com | amin321  | 18  | 10    | 1992 | amin      | patni    | aminltd | 858 Bassel Street | 858 Bassel Street | United States | Louisiana | Metairie | 70001   | 985-346-4282 | amin@gmail.com |
      | allu     | allu@gmail.com | allu321  | 18  | 10    | 1992 | amin      | arjun    | pushpaltd | 858 Bassel Street | 858 Bassel Street | United States | Louisiana | Metairie | 70001   | 985-346-4282 | allu@gmail.com |
#      | anil     | ani123@gmail.com | anil321  | 18  | 10    | 1992 | amin      | kapoor   | kapoorltd | 858 Bassel Street | 858 Bassel Street | United States | Louisiana | Metairie | 70001   | 985-346-4282 | ani123@gmail.com |