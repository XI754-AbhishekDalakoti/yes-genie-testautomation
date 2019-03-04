@demographics
Feature: Validate demographics APIs

  Background: User get the access token
    Given a genie user has a demographic api to test is "/api/genie/demographic/"


  @smoke @regression
  Scenario: User validates the response code of demographic api and mdmId as response where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the demographic api where customer type is individual

  @regression
  Scenario: User validates message of demographic api where customer type is individual and mdmId is not available in DB
    When a genie user passes the "24E" as a parameter to get the response from demographic api where customer type is individual
    Then a genie user get the 204 from the api as a response

  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is individual for all the mentioned keys in examples
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "emailId" is "csadana@yahoo.co.in" from the demographic api where customer type is individual
    And user get the response for "vintage" is "3.3" from the demographic api where customer type is individual
    And user get the response for "<key>" is "<value>" from the demographic api where customer type is individual
    Examples:
      | key                    | value                      |
      | name                   | CHARU SADANA               |
      | mdmId                  | 996264849                  |
      | custType               | FEMALE RESIDENT INDIVIDUAL |
      | emailStatus            | VERIFIED                   |
      | currentCityState       | SAHARANPUR,UTTAR PRADESH   |
      | currentCityStateStatus | INDETERMINISTIC                   |
      | mobileNumber           | 917123456789               |
      | mobileNumberStatus     | VERIFIED                   |
      | profitablilityBand     | #FF0000                      |
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
      | DOB                    | 1975-08-27 00:00:00        |


  @smoke @regression @dm
  Scenario: User validates the response code and mdmid of records of demographic api where customer type is corporate
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the demographic api where customer type is corporate

  @regression @dm
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "emailId" is "amarjeets555@gmail.com" from the demographic api where customer type is corporate
    And user get the response for "vintage" is "4.1" from the demographic api where customer type is corporate
    And user get the response for "<key>" is "<value>" from the demographic api where customer type is corporate
    Examples:
      | key                    | value                           |
      | name                   | SURINDRA RADIOS PRIVATE LIMITED |
      | mdmId                  | 998003452                       |
      | custType               | FEMALE RESIDENT INDIVIDUAL      |
      | emailStatus            | VERIFIED                        |
      | currentCityState       | PATNA,BIHAR                     |
      | currentCityStateStatus | INDETERMINISTIC                 |
      | mobileNumber           | 6080112225                      |
      | mobileNumberStatus     | NOTVERIFIED                     |
      | profitablilityBand     | #FF0000                         |
      | custCategory           | C                               |
      | indexType              | M                               |
      | constitution           | null                            |
      | business               | null                            |
      | industry               | Agri Commodities                |
      | annualTurnover         | 1 TO 5 CRORE                    |
      | landlineNumberStatus   | null                            |
      | PS                     | RS                              |
      | BS                     | BRB                             |
      | PAN                    | NOTVERIFIED                     |
      | DOI                    | 2015-05-27 00:00:00             |
      | landlineNumber         | 919158706602                    |
      | webSite                | null                            |

  @smoke @regression @dm
  Scenario: User validates the response code of demographic api and custID as response where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual

  @regression @dm
  Scenario Outline: User search with valid mdmId and validate response of demographic api for initial c flag record where customer type is individual for all the mentioned keys in examples
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "emailId" is "csadana@yahoo.co.in" from the demographic api for initial c flag record where customer type is individual
    And user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is individual
    Examples:
      | key              | value                    |
      | name             | CHARU SADANA             |
      | custId           | 996264849                |
      | DOB              | 1975-08-27 00:00:00      |
      | profession       | BUSINESS                 |
      | custOpenDate     | 2015-05-27 00:00:00      |
      | income           | 0 TO 50 LACS             |
      | mobileNumber     | 917123456789             |
      | alternateNumber  | 919158706602             |
      | currentAddress   | SAHARANPUR,UTTAR PRADESH |
      | permanentAddress | SAHARANPUR,UTTAR PRADESH |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH |
      | cluster          | null                     |
      | region           | null                     |
      | assetRM          | null                     |
      | liabilityRM      | 4188029                  |
      | serviceRM        | 2985009                  |
      | groupCode        | 1466889                  |
      | PSM              | null                     |
      | nationality      | IN                       |
      | fatca            | null                     |
      | bagic            | 0                        |
      | ckycStatus       | Not Available            |
      | riskCategory     | HIGH RISK                |

  @smoke @regression @dm
  Scenario: User validates the response code and custID of demographic api where customer type is corporate
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate

  @regression @dm
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "emailId" is "amarjeets555@gmail.com" from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is corporate
    Examples:
      | key              | value                           |
      | name             | SURINDRA RADIOS PRIVATE LIMITED |
      | custId           | 998003452                       |
      | DOI              | 2015-05-27 00:00:00             |
      | constitution     | null                            |
      | custOpenDate     | 2015-05-27 00:00:00             |
      | annualTurnover   | 1 TO 5 CRORE                    |
      | mobileNumber     | 6080112225                      |
      | alternateNumber  | 919158706602                    |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH        |
      | cluster          | null                            |
      | region           | null                            |
      | IEC              | null                            |
      | assetRM          | null                            |
      | liabilityRM      | 4188029                         |
      | serviceRM        | 2985009                         |
      | groupCode        | 1466889                         |
      | PSM              | null                            |
      | natureOfBusiness | null                            |
      | natureOfIndustry | Agri Commodities                |
      | riskCategory     | HIGH RISK                       |
      | website          | null                            |
      | ecommSite        | null                            |

