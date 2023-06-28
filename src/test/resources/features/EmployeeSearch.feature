Feature: US-231 Searching the employee
    @sprint2

    Scenario: Search employee by id
    Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on Pim option
    And user clicks on EmployeeList Option
    When user enter valid employee id
    And user clicks on search button
    Then user see employee information is displayed

  @sprint2
  Scenario: US-232 Search employee by name
    Given user is navigated to HRMS application
    When user enters valid username and valid password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on Pim option
    And user clicks on EmployeeList Option
    When user enters valid employee name
    And user clicks on search button
    Then user see employee information is displayed
