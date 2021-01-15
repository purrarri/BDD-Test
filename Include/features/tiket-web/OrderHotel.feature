Feature: Product Hotel - Perform transaction with non-instant payment for xx guest and xx room and
login using Facebook

# Background Assume already called LoginFacebook.feature
 
  Scenario Outline: Generate order for product hotel
    Given User navigate to product hotel
    When User select Hotel product
    Then Highlight the modal dialog hotel
    When User fill the tujuan field by <tujuan>
    And User select top recomendation list
    Then Return modal calender
    When User select check-in date
    And User select check-out date
    And User select tamu
    And User select kamar
    And User select selesai
    And User select CARI HOTEL
    Then Navigate to search result
    When User select top result
    Then Navigated to detail result
    When User select PILIH
    Then User navigated to form pemesanan
    When User select Lanjut ke pembayaran
    Then Navigated to Metode pembayaran
    When User select BCA Virtual Account	
    Then Navigated to detail BCA Virtual Account
    When User select Lanjutkan 
    Then Navigated to final BCA Virtual Account
    And Get the nomor virtual account value
    And Procced to logout
     
    
#
#Update these examples using valid credential for facebook
    Examples: 
      | Email                       | Password					|
      | andreassanggam@yahoo.com 		| D3adpoetsociety		|
