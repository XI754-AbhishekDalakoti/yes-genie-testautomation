@nba
Feature: Validate nba APIs

  @smoke @regression
  Scenario: User validates the response code of nba api and mdmId as response where customer type is individual
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the nba api where customer type is individual

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "amount" is "54856.73" from the nba api where customer type is individual
    And user get the response for "<key>" is "<value>" from the nba api where customer type is individual
    Examples:
      | key                 | value                                           |
      | mdmId               | 996264849                                       |
      | actionCode          | FD02                                            |
      | referenceNo         | 126                                             |
      | toolTip             | Non Individual Customer not registered on CNB 4 |
      | accountNo           | 39400000000000                                  |
      | dueDate             | 31-Mar-2019                                     |
      | cumulationCount     | 1                                               |
      | priority            | 4                                               |
      | status              | open                                            |
      | recommendationTitle | Non Individual Customer not registered on CNB 4 |
      | category            | Regulatory                                      |

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples of boolean type
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is individual and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  @regression
  Scenario: User search with valid mdmId and validate response of nba api where customer type is individual for additional info fields
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "branch_code" is "1" as additional info from the nba api where customer type is individual
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is individual
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is individual
    And user get the response for "BU" is "YES BANK" as additional info from the nba api where customer type is individual

  @regression
  Scenario: User validates the response of nba api by passing invalid mdmId where customer type is individual
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "121" as a mdmid to get the response from nba api where customer type is individual
    Then a user get empty List as response

  @smoke @regression
  Scenario: User validates the response code of nba api and mdmId as response where customer type is corporate
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the nba api where customer type is corporate

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "amount" is "54856.73" from the nba api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the nba api where customer type is corporate
    Examples:
      | key                 | value                                           |
      | mdmId               | 998003452                                       |
      | actionCode          | FD02                                            |
      | recommendationTitle | Non Individual Customer not registered on CNB 4 |
      | category            | Regulatory                                      |
      | toolTip             | Non Individual Customer not registered on CNB 4 |
      | accountNo           | 39400000000000                                  |
      | dueDate             | 31-Mar-2019                                     |
      | cumulationCount     | 1                                               |
      | priority            | 4                                               |
      | status              | open                                            |
      | referenceNo         | 126                                             |

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is corporate for all the mentioned keys in examples of boolean type
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is corporate and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  @regression
  Scenario: User search with valid mdmId and validate response of nba api where customer type is corporate for additional info fields
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "branch_code" is "2" as additional info from the nba api where customer type is corporate
    And user get the response for "BU" is "YES BANK" as additional info from the nba api where customer type is corporate
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is corporate
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is corporate


  @smoke @regression
  Scenario: User validates the response code of nba api and actionCode as response
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/configurations/mappings"
    When a genie user passes the "FD01" as action codes to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And user get the response for "actionCode" is "FD01" from the nba api where customer type is individual

  @regression
  Scenario Outline: User search with valid actionCode and validate response of nba api for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/configurations/mappings"
    When a genie user passes the "FD01" as action codes to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is individual
    Examples:
      | key         | value       |
      | actionCode  | FD01        |
      | actionLabel | Book FD     |
      | iconType    | TBD         |
      | transaction | Create Lead |


  @smoke @regression
  Scenario: User validates the response code of nba create lead api and mdmId as response where customer type is individual
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "996264849" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba lead api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the nba lead api where customer type is individual

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "996264849" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba lead api where customer type is individual
    Examples:
      | key         | value      |
      | mdmId       | 996264849  |
      | referenceNo | 123        |
      | custId      | 996264849  |
      | productName | FD628      |
      | bu          | YES BANK   |
      | sourceRefId | FDYES BANK |
      | branchCode  | 1          |
      | remarks     | null       |

  @smoke @regression
  Scenario: User validates the response code of nba create lead api and mdmId as response where customer type is corporate
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "998003452" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba lead api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the nba lead api where customer type is corporate

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba create lead api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "998003452" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the nba lead api where customer type is corporate
    Examples:
      | key         | value      |
      | mdmId       | 998003452  |
      | referenceNo | 123        |
      | custId      | 998003452  |
      | productName | FD628      |
      | bu          | YES BANK   |
      | sourceRefId | FDYES BANK |
      | branchCode  | 2          |
      | remarks     | null       |

  @regression
  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is individual
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "996264849" as a mdmid and "133" as a refrence id to get the response from nba api where customer type is individual
    And a genie user edits the "remarks" field by the "test data"
    Then user validates remarks modify successfully

  @regression
  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is corporate
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "998003452" as a mdmid and "133" as a refrence id to get the response from nba api where customer type is corporate
    And a genie user edits the "remarks" field by the "test data"
    Then user validates remarks modify successfully

  @regression
  Scenario: User validates the response code of nba api and pass the invalid actionCode as response
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/configurations/mappings"
    When a genie user passes the "FD0123" as action codes to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And a user get empty List as response

  @regression
  Scenario: User validates the response code of nba create lead api and pass the invalid mdmId
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "1" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then a user get the status code 204 as a response from the nba lead api where customer type is individual

  @smoke @regression
  Scenario: User validates the response code and response of blacklist api
    Given a genie user has a blacklist api to test is "http://yesgenie.com:30978/api/blacklist/reasons"
    When a genie user passes the "FD01" as action codes to get the response from blacklist api
    Then a user get the status code 200 as a response from the blacklist api
    And user get the reason "Customer does not need the product" from the blacklist api

  @regression
  Scenario: User validates the empty response of blacklist api
    Given a genie user has a blacklist api to test is "http://yesgenie.com:30978/api/blacklist/reasons"
    When a genie user passes the "FD03" as action codes to get the response from blacklist api
    Then a user get the status code 200 as a response from the blacklist api and "No Record Found." as a message in body

  @regression
  Scenario: User validates the response code of dismissal put api where user enters reason and action
    Given a genie user has a dismissal api to test is "http://yesgenie.com:30978/api/recommendation/dismissal/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from dismissal api where customer type is individual
    And a genie user edits the "reason" field by the "testing for reason field" and "actionChannel" field by the "GENIE" to see "Success" from dismissal api where customer type is individual
    Then user validates response code to validate fields modify successfully for dismissal

  @regression
  Scenario: User validates the response code of dismissal put api with invalid reference id
    Given a genie user has a dismissal api to test is "http://yesgenie.com:30978/api/recommendation/dismissal/"
    When a genie user passes the "996264849" as a mdmid and "1290" as a refrence id to get the response from dismissal api where customer type is individual
    And a genie user edits the "reason" field by the "testing for reason field" and "actionChannel" field by the "GENIE" to see "Recommendation Data not found for mdmId:996264849, referenceNo:1290 " from dismissal api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully

  @regression
  Scenario: User validates the response code of dismissal put api where user enters deferDate, action and recomendationDueDate
    Given a genie user has a defer api to test is "http://yesgenie.com:30978/api/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-16" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Success" as body from defer api where customer type is individual
    Then user validates response code to validate fields modify successfully for defer

  @regression
  Scenario: User validates the response code of dismissal put api where user enters less than or equal to current date
    Given a genie user has a defer api to test is "http://yesgenie.com:30978/api/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-09" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Defer date is Invalid." as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer

  @regression
  Scenario: User validates the response code of dismissal put api where user enters greater than recomendationDueDate date
    Given a genie user has a defer api to test is "http://yesgenie.com:30978/api/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2023-01-09" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Defer date is Invalid." as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer

  @regression
  Scenario: User validates the response code of dismissal put api where user enters invalid reference id
    Given a genie user has a defer api to test is "http://yesgenie.com:30978/api/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "1290" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-16" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Recommendation Data not found for mdmId:996264849, referenceNo:1290 " as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer
