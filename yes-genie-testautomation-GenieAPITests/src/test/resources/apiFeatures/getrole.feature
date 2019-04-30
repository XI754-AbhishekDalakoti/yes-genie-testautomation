@getrole
Feature: Check Get API for GetRole


  @smoke @regression
  Scenario: Check if user is able to submit GET API request for GetRole
    Given I want to execute the GetRole API
    When  I submit the GET request
    Then  I get the status code 200 as a response


  @regression
  Scenario: Check response when user submit GET API request with blank Authorisation header for GetRole
    Given I want to execute the GetRole API
    And   I pass blank in Authorization header
    When  I submit the GET request
    Then  I get the status code 401 as a response



  @regression
  Scenario: Check Widget config response output when user submit GET API request for GetRole
    Given I want to execute the GetRole API
    When  I submit the GET request
    Then  I get the status code 200 as a response
    And   I get "searchConfig" value


  @regression
  Scenario: Check Search config response output when user submit GET API request for GetRole
    Given I want to execute the GetRole API
    When  I submit the GET request
    Then  I get the status code 200 as a response
    And   I get "widgetConfig" value


  @regression
  Scenario: Check transaction response output when user submit GET API request for GetRole
    Given I want to execute the GetRole API
    When  I submit the GET request
    Then  I get the status code 200 as a response
    And   I get "transaction" value

