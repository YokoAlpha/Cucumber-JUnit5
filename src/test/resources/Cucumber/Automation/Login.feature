Feature: Application login

  Scenario: Home page default login
    Given User is on landing page
    When User logs into application with username "Tom" and password "123"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User is on landing page
    When User logs into application with username "Jerry" and password "345"
    Then Home page is populated
    And Cards are not displayed
  