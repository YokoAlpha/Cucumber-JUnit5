Feature: Application login

  Scenario: Home page default login
    Given User is on landing page
    When User logs into application with username "Tom" and password "123"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on landing page
    When User logs into application with username "Jerry" and password "345"
    Then Home page is populated
    And Cards displayed are "false"
    
  Scenario: Home page default login
    Given User is on landing page
    When User sign up with following details
    |Jenny |123|jenny@gmail.com|London|zy1 9kl|
    Then Home page is populated
    And Cards displayed are "false"