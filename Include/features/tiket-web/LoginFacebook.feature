Feature: Perform Login using facebook

# Background Assume the test using positive test case using valid exist credential
 
  Scenario Outline: Perform login using facebook
    Given User navigate to facebook
    When User insert credential as <Email> and <Password>
    And User select login button facebook
    Then Navigated to login user
    When User Masuk dengan facebook
    Then Return modal dialog indicate using Facebook account
    
#
#Update these examples using valid credential for facebook
    Examples: 
     | Email                      | Password					|
     | valid-email-here 					| valid-password		|
