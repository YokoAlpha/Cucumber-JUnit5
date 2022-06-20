Feature: Application login
    
  Scenario: Home page default login
    Given User is on landing page
    When User sign up with following details
    |Jenny |123|jenny@gmail.com|London|zy1 9kl|
    Then Home page is populated
    And Cards displayed are "false"
    
  Scenario Outline: Home page default login
    Given User is on landing page
    When User is login with <username> and <password>
    Then Home page is populated
    And Cards displayed as <valid>
    
   Examples:
   |username	|password	|valid		|
   |Tom				|123			|true			|
   |Jerry			|345			|false		|
   |Ada				|292			|true			|
   |Bella			|298			|true			|
   