@createnewrole
Feature: Check POST API for Create new role


  @smoke @regression
  Scenario: Check if user is able to submit POST API request for Create new role
    Given I want to execute the Create new role API
    When  I submit the POST request
    Then  I get the status code 200 as a response


  @regression
  Scenario: Check response when user submit POST API request with blank Authorisation header for Create new role
    Given I want to execute the Create new role API
    And   I pass blank in Authorization header
    When  I submit the POST request
    Then  I get the status code 401 as a response



  @regression
  Scenario: Check Widget config response output when user submit POST API request for Create new role
    Given I want to execute the Create new role API
    When  I submit the POST request
    Then  I get the status code 200 as a response


