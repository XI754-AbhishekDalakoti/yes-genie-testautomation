@nba
Feature: Validate nba APIs


  @smoke @regression @nba
  Scenario: User validates the response code of nba api and mdmId as response where customer type is individual
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the nba api where customer type is individual

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
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

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples of boolean type
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is individual and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  @regression @nba
  Scenario: User search with valid mdmId and validate response of nba api where customer type is individual for additional info fields
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "branch_code" is "1" as additional info from the nba api where customer type is individual
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is individual
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is individual
    And user get the response for "BU" is "YES BANK" as additional info from the nba api where customer type is individual

  @regression @nba
  Scenario: User validates the response of nba api by passing invalid mdmId where customer type is individual
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "121" as a mdmid to get the response from nba api where customer type is individual
    Then a user get empty List as response

  @smoke @regression @nba
  Scenario: User validates the response code of nba api and mdmId as response where customer type is corporate
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the nba api where customer type is corporate

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "amount" is "54856.73" from the nba api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the nba api where customer type is corporate
    Examples:
      | key                 | value                                           |
      | mdmId               | 998003452                                       |
      | actionCode          | SR01                                            |
      | recommendationTitle | ECS instructions not initiated |
      | category            | Regulatory                                      |
      | toolTip             | ECS instructions not initiated |
      | accountNo           | 39400000000000                                  |
      | dueDate             | 31-Mar-2019                                     |
      | cumulationCount     | 1                                               |
      | priority            | 5                                               |
      | status              | OPEN                                            |
      | referenceNo         | 127                                            |

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is corporate for all the mentioned keys in examples of boolean type
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is corporate and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  @regression @nba
  Scenario: User search with valid mdmId and validate response of nba api where customer type is corporate for additional info fields
    Given a genie user has a nba api to test is "/api/genie/recommendation/view/"
    When a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "branch_code" is "2" as additional info from the nba api where customer type is corporate
    And user get the response for "BU" is "null" as additional info from the nba api where customer type is corporate
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is corporate
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is corporate


  @smoke @regression @nba
  Scenario: User validates the response code of nba api and actionCode as response
    Given a genie user has a nba api to test is "/api/genie/recommendation/configurations/mappings"
    When a genie user passes the "FD001" as action codes to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And user get the response for "actionCode" is "FD001" from the nba api where customer type is individual

  @regression @nba
  Scenario Outline: User search with valid actionCode and validate response of nba api for all the mentioned keys in examples
    Given a genie user has a nba api to test is "/api/genie/recommendation/configurations/mappings"
    When a genie user passes the "FD001" as action codes to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba api where customer type is individual
    Examples:
      | key         | value       |
      | actionCode  | FD001        |
      | actionLabel | Book FD     |
      | iconType    | FD          |
      | transaction | Create Lead |


  @smoke @regression @nba
  Scenario: User validates the response code of nba create lead api and mdmId as response where customer type is individual
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "996264849" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba lead api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the nba lead api where customer type is individual

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "996264849" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the nba lead api where customer type is individual
    Examples:
      | key         | value      |
      | mdmId       | 996264849  |
      | referenceNo | 123        |
      | custId      | 996264849  |
      | productName | 9          |
      | bu          | Branch Banking   |
      | sourceRefId | SABranch Banking |
      | branchCode  | 1          |
      | remarks     | null       |

  @smoke @regression @nba
  Scenario: User validates the response code of nba create lead api and mdmId as response where customer type is corporate
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "998003452" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba lead api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the nba lead api where customer type is corporate

  @regression @nba
  Scenario Outline: User search with valid mdmId and validate response of nba create lead api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "998003452" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the nba lead api where customer type is corporate
    Examples:
      | key         | value      |
      | mdmId       | 998003452  |
      | referenceNo | 123        |
      | custId      | 998003452  |
      | productName | 9      |
      | bu          | Branch Banking   |
      | sourceRefId | FDBranch Banking |
      | branchCode  | 2          |
      | remarks     | null       |

  @regression @nba
  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is individual
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "996264849" as a mdmid and "134" as a refrence id to get the response from nba api where customer type is individual
    And a genie user edits the "remarks" field by the "null"
    Then user validates remarks modify successfully

  @regression @nba
  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is corporate
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "998003452" as a mdmid and "134" as a refrence id to get the response from nba api where customer type is corporate
    And a genie user edits the "remarks" field by the "test data"
    Then user validates remarks modify successfully

  @regression @nba
  Scenario: User validates the response code of nba api and pass the invalid actionCode as response
    Given a genie user has a nba api to test is "/api/genie/recommendation/configurations/mappings"
    When a genie user passes the "FD0123" as action codes to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And a user get empty List as response

  @regression @nba
  Scenario: User validates the response code of nba create lead api and pass the invalid mdmId
    Given a genie user has a nba api to test is "/api/genie/lead/"
    When a genie user passes the "1" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then a user get the status code 204 as a response from the nba lead api where customer type is individual

  @smoke @regression @nba
  Scenario: User validates the response code and response of blacklist api
    Given a genie user has a blacklist api to test is "/api/genie/blacklist/reasons"
    When a genie user passes the "FD001" as action codes to get the response from blacklist api
    Then a user get the status code 200 as a response from the blacklist api
    And user get the reason "Customer does not need the product" from the blacklist api

  @regression @nba
  Scenario: User validates the empty response of blacklist api
    Given a genie user has a blacklist api to test is "/api/genie/blacklist/reasons"
    When a genie user passes the "FD0003" as action codes to get the response from blacklist api
    Then a user get the status code 200 as a response from the blacklist api and "[]" as a message in body

  @regression @nba
  Scenario: User validates the response code of dismissal put api where user enters reason and action
    Given a genie user has a dismissal api to test is "/api/genie/recommendation/dismissal/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from dismissal api where customer type is individual
    And a genie user edits the "reason" field by the "testing for reason field" and "actionChannel" field by the "GENIE" to see "Success" from dismissal api where customer type is individual
    Then user validates response code to validate fields modify successfully for dismissal

  @regression @nba
  Scenario: User validates the response code of dismissal put api with invalid reference id
    Given a genie user has a dismissal api to test is "/api/genie/recommendation/dismissal/"
    When a genie user passes the "996264849" as a mdmid and "1290" as a refrence id to get the response from dismissal api where customer type is individual
    And a genie user edits the "reason" field by the "testing for reason field" and "actionChannel" field by the "GENIE" to see "Recommendation Data not found for mdmId:996264849, referenceNo:1290 " from dismissal api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully

  @regression @nba
  Scenario: User validates the response code of dismissal put api where user enters deferDate, action and recomendationDueDate
    Given a genie user has a defer api to test is "/api/genie/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-16" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Success" as body from defer api where customer type is individual
    Then user validates response code to validate fields modify successfully for defer

  @regression @nba
  Scenario: User validates the response code of dismissal put api where user enters less than or equal to current date
    Given a genie user has a defer api to test is "/api/genie/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-09" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Defer date is Invalid." as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer

  @regression @nba
  Scenario: User validates the response code of dismissal put api where user enters greater than recomendationDueDate date
    Given a genie user has a defer api to test is "/api/genie/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "129" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2023-01-09" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Defer date is Invalid." as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer

  @regression @nba
  Scenario: User validates the response code of dismissal put api where user enters invalid reference id
    Given a genie user has a defer api to test is "/api/genie/recommendation/"
    When a genie user passes the "996264849" as a mdmid and "1290" as a refrence id to get the response from defer api where customer type is individual
    And a genie user edits the "deferDate" field by the "2019-01-16" and "actionChannel" field by the "GENIE" and "recomendationDueDate" field by the "2019-12-31" to see "Recommendation Data not found for mdmId:996264849, referenceNo:1290 " as body from defer api where customer type is individual
    Then user validates the response code to validate fields modify unsuccessfully for defer
