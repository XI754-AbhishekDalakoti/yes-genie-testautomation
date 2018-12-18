@demographics
Feature: Validate demographics APIs

  @smoke @regression
  Scenario: User validates the response code of demographic api and mdmId as response where customer type is individual
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    Then user get the response for "mdmId" is "996264849" from the demographic api where customer type is individual

  @regression
  Scenario: User validates message of demographic api where customer type is individual and mdmId is not available in DB
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "24" as a parameter to get the response from demographic api where customer type is individual
    Then a genie user get the "message" as "No value present" from the api as a response
    Then a user get the status code 404 as a response from the demographic api where customer type is individual

  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the demographic api where customer type is individual
    Examples:
      | key                    | value                      |
      | name                   | CHARU SADANA               |
      | mdmId                  | 996264849                  |
      | vintage                | 3.3                        |
      | custType               | FEMALE RESIDENT INDIVIDUAL |
      | emailId                | rahul_sadana@yahoo.co.in   |
      | emailStatus            | VERIFIED                   |
      | currentCityState       | SAHARANPUR,UTTAR PRADESH   |
      | currentCityStateStatus | VERIFIED                   |
      | mobileNumber           | 918482095250               |
      | mobileNumberStatus     | VERIFIED                   |
      | incomeBand             | -                          |
      | custCategory           | I                          |
      | dataSetFlag            | M                          |
      | sentimentBand          | -                          |
      | contactibilityIndex    | 33%                        |
      | homeBranchName         | SAHARANPUR,UTTAR PRADESH   |
      | cKyc                   | -                          |
      | profession             | -                          |
      | currentCityState       | SAHARANPUR,UTTAR PRADESH   |
      | customerSegment        | YES FIRST PRIMARY OPDT     |
      | aadharNo               | NOTVERIFIED                |
      | passportNo             | VERIFIED                   |
      | gender                 | F                          |
      | PS                     | -                          |
      | BS                     | BRB                        |
      | PAN                    | VERIFIED                   |
      | DOB                    | 15-Mar-1994                |


  @smoke @regression
  Scenario: User validates the response code and count of records of demographic api where customer type is corporate
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api where customer type is corporate
    Then user get the response for "mdmId" is "998003452" from the demographic api where customer type is corporate

  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the demographic api where customer type is corporate
    Examples:
      | key                    | value                           |
      | name                   | SURINDRA RADIOS PRIVATE LIMITED |
      | mdmId                  | 998003452                       |
      | vintage                | 4.1                             |
      | custType               | COMPANY                         |
      | emailId                | amarjeets555@gmail.com          |
      | emailStatus            | VERIFIED                        |
      | currentCityState       | CHANDIGARH,CHANDIGARH           |
      | currentCityStateStatus | NOTVERIFIED                     |
      | mobileNumber           | 918080112225                    |
      | mobileNumberStatus     | VERIFIED                        |
      | incomeBand             | -                               |
      | custCategory           | C                               |
      | dataSetFlag            | M                               |
      | constitution           | PVTLTD                          |
      | business               | Retail Trading/Merchants        |
      | industry               | Architecture Firm               |
      | annualTurnover         | 1 CRORE TO 5 CRORE              |
      | landlineNumberStatus   | NOTAVAILABLE                    |
      | PS                     | -                               |
      | BS                     | BRB                             |
      | PAN                    | NOTVERIFIED                     |


  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "<key>" is null from the demographic api where customer type is corporate
    Examples:
      | key            |
      | landlineNumber |
      | webSite        |

