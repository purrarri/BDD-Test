Feature: Product Hotel - Perform transaction with non-instant payment for xx guest and xx room and
login using Facebook

# Background Assume already called LoginFacebook.feature
 
  Scenario Outline: Generate order for product hotel
    Given User navigate to product hotel
    When User select tamu <tamu>
    And User select kamar <kamar>
    

     
    
#
#Custom and modify for value "tamu" xx and "kamar" 
    Examples: 
      | tamu  | kamar		|
      | 2			| 2				|
