@getaus
Feature: Check Get API for GetAus


  @smoke @regression
  Scenario: Check if user is able to submit GET API request for GetAus
    Given I want to execute the GetAus API
    And   I pass "998003452" mdmid in the request
    When  I submit the GET request in getaus api
    Then  I get the status code 200 as a response in getaus api



  @smoke @regression
  Scenario: Check if user is able to submit GET API request for GetAus for non aus mdmid
    Given I want to execute the GetAus API
    And   I pass "996264849" mdmid in the request
    When  I submit the GET request in getaus api
    Then  I get the status code 204 as a response in getaus api


  @regression
  Scenario: Check response when user submit GET API request with blank Authorisation header for GetAus
    Given I want to execute the GetAus API
    And   I pass "998003452" mdmid in the request
    And   I pass blank in Authorization header in getaus api
    When  I submit the GET request in getaus api
    Then  I get the status code 401 as a response in getaus api



  @regression
  Scenario Outline: Check response output when user submit GET API request for GetAus
    Given I want to execute the GetAus API
    And   I pass "998003452" mdmid in the request
    When  I submit the GET request in getaus api
    Then  I get the status code 200 as a response in getaus api
    And   I validate the "<key>" and "<value>"
    Examples:
    | key                     | value                   |
    | customerName            |Charu Sadana            |
    | gender                  |F                        |
    | email                   |charusadan@gmail.com     |
    | emailVerified           |NO                       |
    | contactability          |0.4                      |
    | currentCityState        |AHMEDABAD,GUJARAT        |


  @regression
  Scenario: Check response output for account number when user submit GET API request for GetAus
    Given I want to execute the GetAus API
    And   I pass "998003452" mdmid in the request
    When  I submit the GET request in getaus api
    Then  I get the status code 200 as a response in getaus api
    And   I validate the "accountNo" field with value "021563300011111"




