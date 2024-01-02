Feature: Place order before checkout

  @Test16
  Scenario Outline: Verify that User can place order before checkout
    Given I am on homepage
    When Click on SignupLogin button
    And I register with "<username>","<emailAddress>","<password>","<day>","<month>","<year>","<firstName>","<lastName>","<company>","<address1>","<address2>","<country>","<state>","<city>","<zipcode>","<mobile>"
    And I Enter correct "<email>" and "<password>"
    And I Click login button
    And I can see  that Logged in as "<username>" is visible
     And  I Add products to cart
  And I Click Cart button
    And I can see  that cart page is displayed
    And I  Click Proceed To Checkout
  #  11. Verify Address Details and Review Your Order
And I Enter description in comment text area"hello" and click Place Order
  And I Enter payment details: Name on Card"Silva clone", Card Number"2222 4444 4444", CVC"153", Expiration date"12","2030"
  And I Click on Pay and Confirm Order button
#  15. Verify success message 'Your order has been placed successfully!'
And I Click Delete Account button
    And I can see that ACCOUNT DELETED! is visible
    And I Click Continue button


    Examples:
      | username | emailAddress         | password   | day | month | year | firstName | lastName | company | address1    | address2      | country | state   | city      | zipcode | mobile     | email                |  |
      | ambush   | ambush123@gmail.com  | ambush123  | 17  | 10    | 1992 | ambush    | khel     | amb ltd | 17 cucumber | cucumber gali | India   | Gujarat | Ahmedabad | 382350  | 9843862358 | ambush123@gmail.com  |  |
#      | ambasha  | ambasha123@gmail.com | ambasha123 | 17  | 10    | 1992 | ambasha   | khol     | amb ltd | 17 cucumber | cucumber gali | India   | Gujarat | Ahmedabad | 382350  | 9843862358 | ambasha123@gmail.com |  |
