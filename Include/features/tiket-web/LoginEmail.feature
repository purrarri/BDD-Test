Feature: Perform Login using email

# Background Assume the test using positive test case using valid exist credential
 
  Scenario Outline: Perform login using an valid email
    Given User navigate to login web application
    When User insert credential such as <Email> 
    And User Select Lanjutkan button
    Then User navigated to sub login-register page
    When User insert credential pass as <Password>
    And User Select LOG IN button
    Then Navigated to dashboard user
    


    Examples: 
      | Email                       | Password			|
      | testtiket@mailinator.com 		| Testtiket123	|
