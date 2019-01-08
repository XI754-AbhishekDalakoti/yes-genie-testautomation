@e2e

Feature: Validate end to end response from elastic search , demographics and NBA API

  Background: User get the access token
    Given user wants a valid access token from "http://yesgenie.com:30978/auth/realms/YBL/protocol/openid-connect/token" URI
    And to get valid access token user passes "yes-genie-frontend" as "client_id" and "password" as "grant_type" and "chandan" as "username" and "chandan" as "password" and "f2b07a8f-ce69-41c6-9d28-f056bc9713fe" as "client_secret"
    And api to test is "http://yesgenie.com:30978/api/genie/customer/search"

  Scenario Outline: This is the test to validate response upto demographics where customer type is individual
    When a user search with value "996264849" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the demographic api where customer type is individual
    And user get the response for "emailId" is "csadana@yahoo.co.in" from the demographic api where customer type is individual
    And user get the response for "vintage" is "3.3" from the demographic api where customer type is individual
    And user get the response for "<key>" is "<value>" from the demographic api where customer type is individual
    Examples:
      | key                    | value                      |
      | name                   | CHARU SADANA               |
      | mdmId                  | 996264849                  |
      | custType               | FEMALE RESIDENT INDIVIDUAL |
      | emailStatus            | VERIFIED                   |
      | currentCityState       | SAHARANPUR,UTTAR PRADESH   |
      | currentCityStateStatus | VERIFIED                   |
      | mobileNumber           | 917123456789               |
      | mobileNumberStatus     | VERIFIED                   |
      | profitablilityBand     | GREEN                      |
      | custCategory           | I                          |
      | indexType              | M                          |
      | sentimentBand          | null                       |
      | contactibilityIndex    | 33%                        |
      | homeBranchName         | SAHARANPUR,UTTAR PRADESH   |
      | cKyc                   | null                       |
      | profession             | BUSINESS                   |
      | customerSegment        | YES FIRST PRIMARY OPDT     |
      | aadharNo               | VERIFIED                   |
      | passportNo             | VERIFIED                   |
      | gender                 | F                          |
      | PS                     | RS                         |
      | BS                     | BRB                        |
      | PAN                    | VERIFIED                   |
      | DOB                    | 15-May-1990                |


  Scenario Outline: This is the test to validate response upto demographics where customer type is corporate
    When a user search with value "998003452" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the demographic api where customer type is corporate
    And user get the response for "emailId" is "amarjeets555@gmail.com" from the demographic api where customer type is corporate
    And user get the response for "vintage" is "4.1" from the demographic api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the demographic api where customer type is corporate
    Examples:
      | key                    | value                           |
      | name                   | SURINDRA RADIOS PRIVATE LIMITED |
      | mdmId                  | 998003452                       |
      | custType               | FEMALE RESIDENT INDIVIDUAL      |
      | emailStatus            | VERIFIED                        |
      | currentCityState       | PATNA,BIHAR                     |
      | currentCityStateStatus | NOTVERIFIED                     |
      | mobileNumber           | 6080112225                      |
      | mobileNumberStatus     | NOTVERIFIED                     |
      | profitablilityBand     | YELLOW                          |
      | custCategory           | C                               |
      | indexType              | M                               |
      | constitution           | null                            |
      | business               | null                            |
      | industry               | Agri Commodities                |
      | annualTurnover         | 1 TO 5 CRORE                    |
      | landlineNumberStatus   | NOTAVAILABLE                    |
      | PS                     | RS                              |
      | BS                     | BRB                             |
      | PAN                    | NOTVERIFIED                     |
      | DOI                    | 29-Feb-2016                     |
      | landlineNumber         | null                            |
      | webSite                | null                            |


  Scenario Outline: This is the test to validate response upto nba view api where customer type is individual and validate the response of initial c flag record
    When a user search with value "996264849" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual
    Then a genie user has a nba api to test is "http://yesgenie.com:30978/api/recommendation/view/"
    And a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba api where customer type is individual
    And user get the response for "amount" is "54856.73" from the nba api where customer type is individual
    And user get the response for "<key>" is "<value>" from the nba api where customer type is individual
    Examples:
      | key                 | value                                           |
      | mdmId               | 996264849                                       |
      | actionCode          | FD02                                            |
      | referenceNo         | 126                                             |
      | toolTip             | Non Individual Customer not registered on CNB 4 |
      | accountNo           | 39400000000000                                  |
      | dueDate             | 31-Dec-2019                                     |
      | cumulationCount     | 1                                               |
      | priority            | 4                                               |
      | status              | open                                            |
      | recommendationTitle | Non Individual Customer not registered on CNB 4 |
      | category            | Regulatory                                      |

  Scenario Outline: This is the test to validate response upto nba view API where customer type is individual and validate the response of boolean fields
    When a user search with value "996264849" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual
    Then a genie user has a nba api to test is "http://192.168.3.241:31175/api/recommendation/view/"
    And a genie user passes the "996264849" as a mdmid to get the response from nba api where customer type is individual
    Then user get the response for "branch_code" is "416" as additional info from the nba api where customer type is individual
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is individual
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is individual
    And user get the response for "BU" is "YES BANK" as additional info from the nba api where customer type is individual
    And user get the response for "<key>" is "<value>" from the nba api where customer type is individual and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  Scenario Outline: This is the test to validate response upto nba view api where customer type is corporate and validate the response of initial c flag record
    When a user search with value "998003452" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate
    Then a genie user has a nba api to test is "http://192.168.3.241:31175/api/recommendation/view/"
    And a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba api where customer type is corporate
    And user get the response for "amount" is "54856.73" from the nba api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the nba api where customer type is corporate
    Examples:
      | key                 | value                   |
      | mdmId               | 998003452               |
      | actionCode          | FD03                    |
      | recommendationTitle | Issue Cheque Book (P 4) |
      | category            | Service                 |
      | toolTip             | Issue Cheque Book (P 4) |
      | accountNo           | 39400000000000          |
      | dueDate             | null                    |
      | cumulationCount     | 1                       |
      | priority            | 4                       |
      | status              | open                    |
      | referenceNo         | 128                     |


  Scenario Outline: This is the test to validate response upto nba view API where customer type is corporate and validate the response of boolean fields
    When a user search with value "998003452" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate
    Then a genie user has a nba api to test is "http://192.168.3.241:31175/api/recommendation/view/"
    And a genie user passes the "998003452" as a mdmid to get the response from nba api where customer type is corporate
    Then user get the response for "branch_code" is "416" as additional info from the nba api where customer type is corporate
    And user get the response for "fd_amount" is "54856.73" as additional info from the nba api where customer type is corporate
    And user get the response for "LOB" is "Branch Banking" as additional info from the nba api where customer type is corporate
    And user get the response for "BU" is "YES BANK" as additional info from the nba api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the nba api where customer type is corporate and field is of boolean type
    Examples:
      | key            | value |
      | dismissable    | false |
      | cumulationFlag | true  |

  @regression
  Scenario Outline: User search with valid mdmId and validate response of nba api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "996264849" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is individual
    Then a user get the status code 200 as a response from the nba lead api where customer type is individual
    And user get the response for "<key>" is "<value>" from the nba lead api where customer type is individual
    Examples:
      | key         | value      |
      | mdmId       | 996264849  |
      | referenceNo | 123        |
      | custId      | 996264849  |
      | productName | FD628      |
      | bu          | YES BANK   |
      | sourceRefId | FDYES BANK |
      | branchCode  | 416        |
      | remarks     | null       |

  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is individual
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "996264849" as a mdmid and "134" as a refrence id to get the response from nba api where customer type is individual
    And a genie user edits the "remarks" field by the "test data"
    Then user validates remarks modify successfully

  Scenario Outline: User search with valid mdmId and validate response of nba create lead api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "998003452" as a mdmid and "123" as a refrence id to get the response from nba api where customer type is corporate
    Then a user get the status code 200 as a response from the nba lead api where customer type is corporate
     And user get the response for "<key>" is "<value>" from the nba lead api where customer type is corporate
    Examples:
      | key         | value      |
      | mdmId       | 998003452  |
      | referenceNo | 123        |
      | custId      | 998003452  |
      | productName | FD628      |
      | bu          | YES BANK   |
      | sourceRefId | FDYES BANK |
      | branchCode  | 416        |
      | remarks     | null       |

  Scenario: User validates the response code of nba create lead put api where user enters remarks field where customer is corporate
    Given a genie user has a nba api to test is "http://yesgenie.com:30978/api/lead/"
    When a genie user passes the "998003452" as a mdmid and "134" as a refrence id to get the response from nba api where customer type is corporate
    And a genie user edits the "remarks" field by the "test data"
    Then user validates remarks modify successfully

  Scenario Outline: User search with valid custid and validate response for all the mentioned keys in example
    When a user search with value "996264849" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value                    |
      | customerName     | CHARU SADANA             |
      | city             | SAHARANPUR               |
      | addressArea      | W/O RAHUL SADANA 25-B    |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH |
      | assetRM          | NULL                     |
      | groupId          | 274937                   |
      | businessSegment  | BRB                      |
      | partnerSegment   | NULL                     |
      | customerOpenDate | 13-May-2011              |
      | DOB              | 15-May-1990              |
      | custType         | I                        |