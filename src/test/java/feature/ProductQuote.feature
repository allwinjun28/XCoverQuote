Feature: I want to get the full product quote

@E2EQuote
  Scenario: Validate the quote of full product
    Given I launch the website
    When Click on Get A Quote
     And I select the insurance type 
    And I select the address from suggestions
    And I enter the product details
    And I enter the product description
    And I enter the product value
    And I select a date from calendar
    And I select the product condition
    Then Validate the quote page
    
   
    
  
