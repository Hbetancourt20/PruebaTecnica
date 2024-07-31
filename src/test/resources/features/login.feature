Feature: Login and add a new candidate

  Scenario: Login and add a new candidate
    Given the user is on the login page
    When the user logs in with valid credentials
    Then the user navigates to Recruitment page
    And the user adds a new candidate
    Then  the user should see the candidate is hired