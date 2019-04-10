@getaus
Feature: Check Get API for GetAus


  @smoke @regression
  Scenario: Check if user is able to submit GET API request for GetAus
    Given I want to execute the GetAus API
    And   I pass 998003452 mdmid in the request
    When  I submit the GET request
    Then  I get the status code 200 as a response



  @smoke @regression
  Scenario: Check if user is able to submit GET API request for GetAus for non aus mdmid
    Given I want to execute the GetAus API
    And   I pass "996264849" mdmid in the request
    When  I submit the GET request
    Then  I get the status code 200 as a response


  @regression
  Scenario: Check response when user submit GET API request with blank Authorisation header for GetAus
    Given I want to execute the GetAus API
    And   I pass 998003452 mdmid in the request
    And   I pass blank in Authorization header
    When  I submit the GET request
    Then  I get the status code 401 as a response



  @regression
  Scenario Outline: Check response output when user submit GET API request for GetAus
    Given I want to execute the GetAus API
    And   I pass 998003452 mdmid in the request
    When  I submit the GET request
    Then  I get the status code 200 as a response
    And   I validate the "<key>" and "<value>"
    Examples:
    | key                     | value                   |
    | custName                |Charu Sardana            |
    | gender                  |Female                   |
    | email                   |rahul_sadana@yahoo.co.in |
    | emailVerificationStatus |Verified                |
    | contactibility          |33%                      |
    | currentCity             |Saharanpur               |





