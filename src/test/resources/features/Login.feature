
Feature: Login functionality
  @sprint1 @regression
  Scenario: Valid admin login
   Given user is navigated to HRMS application
  When user enters valid username and valid password
  And user clicks on login button
  Then user is successfully logged in



@regression @tc1102
  Scenario: Valid ess login
    Given user is navigated to HRMS application
    When user enters valid  ess username and valid  ess password
    And user clicks on login button
    Then user is successfully logged in


  @tc1103
  Scenario: Invalid admin login
    Given user is navigated to HRMS application
    When user enters invalid username and  password
    And user clicks on login button
    Then error message displayed







#  User story -Search an employee
#
#    Search by id
#  Given user navigates to hrms application
#    When user enter valid user name and password
#    And user click on login button
#    Then user navigate to dashboard page
#    When user clicks on PIM option
#    And user click on employee information button
#    When user enters on employee id
#    And user click on search button
#    Then user see employee information is displayed
#
#    Search by name
#    Given user navigates to hrms application
#    When user enter valid user name and password
#    And user click on login button
#    Then user navigate to dashboard page
#    When user clicks on PIM option
#    And user click on employee information button
#    When user enters on employee name
#    And user click on search button
#    Then user see employee information is displayed
