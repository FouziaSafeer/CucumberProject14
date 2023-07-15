Feature: Add Employee
  Background:
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on Pim option
    And user clicks on Add Employee button

  @sprint3 @regression
  Scenario: Adding one employee
    #Given user is navigated to HRMS application
  #  When user enters valid username and valid password
   # And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on Pim option
    #And user clicks on Add Employee button
    And user enter firstname and lastname
    And user click on save button
    Then employee added successfully
@test1
  Scenario: Adding one employee using feature file

    And user enter "Fiza" and "safff"
    And user click on save button
    Then employee added successfully
# we can use starts  *   instead of given when then
@outline
Scenario Outline: Adding multiple employee using feature file
  And user enter  "<firstName>" and "<lastName>"
  And user click on save button
  Then employee added successfully
  Examples:
    | firstName | lastName |
    |gulnaz     |madar     |
    |gulnaz1     |madar2   |
    |muni        |chuni     |
     |steave      |jobs      |
     |azami       | asli|

  @datatable
  Scenario: addming multiple employee using data table
When user adds multiple employee and verify they are added successfuly
    |firstName|middleName|lastName|
    |Fouzia1.   |MS         |Safeer  |
   |Faiza1..    |MS         |SAfeer  |
    |humid1..    |MS         |Ozgin   |

@excel
Scenario: Adding multiple employee using excel file
  When  user adds multiple employee from excel using "EmployeeData" and verify it
  #using sheet name in above EmployeeData