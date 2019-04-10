@rolemapping
Feature: Check Get API for Role Mapping


  @smoke @regression
  Scenario: Check if user is able to submit GET API request for Role Mapping
    Given I want to execute the Role Mapping API
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 200 as a response


  @smoke @regression
  Scenario: Check if user is able to submit GET API request for Role Mapping with blank status field
    Given I want to execute the Role Mapping API
    When  I pass status as "" and submit the Get request
    Then  I get the status code 500 as a response


  @regression
  Scenario: Check response when user submit GET API request with blank Authorisation header for Role Mapping
    Given I want to execute the Role Mapping API
    And   I pass blank in Authorization header
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 401 as a response



  @regression
  Scenario Outline: Check response output when user submit GET API request for Role Mapping
    Given I want to execute the Role Mapping API
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 200 as a response
    And   I validate the "<key>" and "<value>"
    Examples:
      | key                   | value         |
      | referenceTicketNo     |123            |
      | role                  |RM             |
      | modifiedBy            |Abhishek       |


  @regression
  Scenario Outline: Check transactions response output when user submit GET API request for Role Mapping
    Given I want to execute the Role Mapping API
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 200 as a response
    And   I validate "transactions" "<key>" and "<value>"
    Examples:
      | key                   | value         |
      | id                    |123            |
      | name                  |Create Lead    |



  @regression
  Scenario Outline: Check search response output when user submit GET API request for Role Mapping
    Given I want to execute the Role Mapping API
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 200 as a response
    And   I validate "search" "<key>" and "<value>"
    Examples:
      | key                   | value                       |
      | id                    |123                          |
      | name                  |Can View Hiearchy            |


  @regression
  Scenario Outline: Check widgets response output when user submit GET API request for Role Mapping
    Given I want to execute the Role Mapping API
    When  I pass status as "pending" and submit the Get request
    Then  I get the status code 200 as a response
    And   I validate "widgets" "<key>" and "<value>"
    Examples:
      | key                   | value                        |
      | id                    |123                           |
      | name                  |Next Best Actions             |





