Feature: Product Flight - Perform transaction with non-instant payment for xx guest and xx room and
login using Facebook

# Background Assume already called LoginEmail.feature
 
  Scenario Outline: Generate order for product flight
  Given Navigate to product flight
  When User select transit time <transit>
  
  
  #Modify the xx transit time here, by integer value,
  # 0 for langsung
  # 1 for 1 transit
  # 2 for 2++ transit
  
  |	transit			|
  |	1						|
  
 
  

    