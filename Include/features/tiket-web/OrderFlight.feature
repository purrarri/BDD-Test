Feature: Product Hotel - Perform transaction with non-instant payment for xx guest and xx room and
login using Facebook

# Background Assume already called LoginEmail.feature
 
  Scenario Outline: Generate order for product flight
    Given User navigate to product pesawat
    When User select pesawat product
    Then Highlight the modal dialog pesawat
    When User check thickbox Pulang-Pergi
    Then The selected radio button checked
    When User fill dari <dari>
    And Select the top list result dari
    And User fill ke <ke>
    And Select the top list result ke
    And User select date berangkat
    And User select date pulang
    And Select Selesai
    And Select Cari Penerbangan
    Then Navigated to result search
    When User select the custom filter for transit pergi <transit1>
    Then The transit filter selected 
    When User select pilih top of search penerbangan pergi
    And  User select the custom filter for transit pulang <transit2>
    And User select pilih top of search penerbangan pulang
    Then Navigate to detail pemesanan flight
    And Check sama dengan pemesan
    And User select kewarganegaraan
    And Select lanjutkan ke pembayaran flight
    And Select Ya, Lanjutkan
    Then Navigated to payment page
    When User selecet BCA Virtual Account flight
    Then Navigated to detail BCA Virtual Account flight
    And User get nomor virtual account flight
    And Procced to logout
     
    
    Then 
    