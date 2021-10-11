Feature: Real Estate

Scenario Outline: To verify whether application allows the user to get registered upon entering valid credentials
Given Navigate to the Real Estate Application
And I click on Register/LOGIN button
And I click on Register button
When I enter "<emailID>" "<firstName>" and "<lastName>" on Register page
And I click on Register button
Then I validate confirmation message
Then I close the browser

 Examples: 
      | emailID           | firstName | lastName |
      | manzoor@gmail.com | manzoor   | mehadi   |


Scenario Outline: To Verify whether application allows registered user to login into application
Given Navigate to the Real Estate Application
And I click on Register/LOGIN button
When I enter "<userName>" and "<password>" on Register page
And I click on Sign In button
Then I valdidate displayed Profile Page 
Then I close the browser

 Examples: 
      | userName | password  |
      | admin    | admin@123 |
 
      
Scenario Outline: To verify whether application allows the user to recover the password
Given Navigate to the Real Estate Application
And I click on Register/LOGIN button
When I click on Lost Your Password link
Then I enter "<emailID>" on Register page
And I click on Reset Password button
Then I valdidate confirmation message
Then I close the browser

 Examples: 
      | emailID           | 
      | manzoor@gmail.com |     



 
