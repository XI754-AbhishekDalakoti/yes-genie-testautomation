@demographics
Feature: Validate demographics APIs

  Background: User has api to test
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"

  @smoke @regression
  Scenario: User validates the response code of demographic api and mdmId as response where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the demographic api where customer type is individual

  @regression
  Scenario: User validates message of demographic api where customer type is individual and mdmId is not available in DB
    When a genie user passes the "24" as a parameter to get the response from demographic api where customer type is individual
    Then a genie user get the "message" as "Record not found." from the api as a response

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


  @smoke @regression
  Scenario: User validates the response code and mdmid of records of demographic api where customer type is corporate
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api where customer type is corporate
    And user get the response for "mdmId" is "998003452" from the demographic api where customer type is corporate

  @regression
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

  @smoke @regression
  Scenario: User validates the response code of demographic api and custID as response where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual

  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api for initial c flag record where customer type is individual for all the mentioned keys in examples
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "emailId" is "csadana@yahoo.co.in" from the demographic api for initial c flag record where customer type is individual
    And user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is individual
    Examples:
      | key              | value                    |
      | name             | CHARU SADANA             |
      | custId           | 996264849                |
      | DOB              | 15-Mar-1994              |
      | profession       | BUSINESS                 |
      | custOpenDate     | 22-Aug-2015              |
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

  @smoke @regression
  Scenario: User validates the response code and custID of demographic api where customer type is corporate
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate

  @regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "emailId" is "amarjeets555@gmail.com" from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is corporate
    Examples:
      | key              | value                           |
      | name             | SURINDRA RADIOS PRIVATE LIMITED |
      | custId           | 998003452                       |
      | DOI              | 09-Apr-1986                     |
      | constitution     | null                            |
      | custOpenDate     | null                            |
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

