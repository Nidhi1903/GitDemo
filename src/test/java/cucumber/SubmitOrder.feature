
@tag
Feature: Purchase the order from Ecommerce website
  I want to use this template for my feature file

	Background: 
	Given I landed on Ecommerce Page

  @tag2
  Scenario Outline: Positive Test of Submitting the order
    Given Logged in with username <name> and password <password>
    When I add the product <productName> from Cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." message is displayed on ConfirmationPage

    Examples: 
      | name  										            | password    | productName    |
      | anshika@gmail.com											| Iamking@000 | ZARA COAT 3		 |
      | nidhipradeepsheeba@gmail.com					| Nidhi@19    | ADIDAS ORIGINAL|
