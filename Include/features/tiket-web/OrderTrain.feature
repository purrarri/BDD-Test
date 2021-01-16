Feature: Product Train - Perform transaction with non instant payment

# Background Assume already called LoginEmail.feature
 
  Scenario Outline: Generate order for product train
    Given User navigate to product train
    When User select adult <adult>
    And User select infant <infant>
    

#Custom and modify for value "adult" xx and "infant". Value adult <= infant. 
    Examples: 
      | adult		| infant	|
      | 2				| 1			|
