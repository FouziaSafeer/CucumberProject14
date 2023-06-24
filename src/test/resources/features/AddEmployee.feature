Feature: Add Employee

  @sprint3 @regression
  Scenario: Adding one employee
    Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on Pim option
    And user clicks on Add Employee button
    And user enter firstname and lastname
    And user click on save button
    Then employee added successfully




    # we can use starts  *   instead of given when then