Feature: login with correct username and password
@Test2
Scenario Outline: Login user with correct email and password
  Given I am on homepage
  When Click on SignupLogin button
  And I can see Login to your account is visible
  And I register with "<username>","<emailAddress>","<password>","<day>","<month>","<year>","<firstName>","<lastName>","<company>","<address1>","<address2>","<country>","<state>","<city>","<zipcode>","<mobile>"
#  2. Navigate to url 'http://automationexercise.com'
#  3. Verify that home page is visible successfully

  And I Click login button
  And I can see  that Logged in as "<username>" is visible
  And I Click Delete Account button
 Then I can see that ACCOUNT DELETED! is visible
  Examples:

    | username | emailAddress           | password  | day | month | year | firstName | lastName | company   | address1                | address2                | country       | state        | city     | zipcode | mobile       | email                  |
    | brick    | brickbat@sbcglobal.net | brick321  | 18  | 10    | 1992 | brick     | cloud    | brickltd  | 858 Bassel Street       | 858 Bassel Street       | United States | Louisiana    | Metairie | 70001   | 985-346-4282 | brickbat@sbcglobal.net |
#    | dieman   | dieman@icloud.com      | dieman456 | 20  | 10    | 1993 | dieman    | cloud    | diemanltd | 384 Hidden Meadow Drive | 384 Hidden Meadow Drive | United States | North Dakota |Fargo     |58102    |701-765-3380  | dieman@icloud.com      |