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
    Then user get the response for "emailId" is "rahul_sadana@yahoo.co.in" from the demographic api where customer type is individual
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
      | mobileNumber           | 918482095250               |
      | mobileNumberStatus     | VERIFIED                   |
      | profitablilityBand     | null                       |
      | custCategory           | I                          |
      | indexType              | M                          |
      | sentimentBand          | null                       |
      | contactibilityIndex    | 33%                        |
      | homeBranchName         | SAHARANPUR,UTTAR PRADESH   |
      | cKyc                   | null                       |
      | profession             | BUSINESS                   |
      | customerSegment        | YES FIRST PRIMARY OPDT     |
      | aadharNo               | NOTVERIFIED                |
      | passportNo             | VERIFIED                   |
      | gender                 | F                          |
      | PS                     | null                       |
      | BS                     | BRB                        |
      | PAN                    | VERIFIED                   |
      | DOB                    | 15-Mar-1994                |


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
      | custType               | COMPANY                         |
      | emailStatus            | VERIFIED                        |
      | currentCityState       | CHANDIGARH,CHANDIGARH           |
      | currentCityStateStatus | NOTVERIFIED                     |
      | mobileNumber           | 918080112225                    |
      | mobileNumberStatus     | VERIFIED                        |
      | profitablilityBand     | null                            |
      | custCategory           | C                               |
      | indexType              | M                               |
      | constitution           | PVTLTD                          |
      | natureofBusiness       | Retail Trading/Merchants        |
      | natureofIndustry       | Architecture Firm               |
      | annualTurnover         | 1 CRORE TO 5 CRORE              |
      | landlineNumberStatus   | NOTAVAILABLE                    |
      | PS                     | null                            |
      | BS                     | BRB                             |
      | PAN                    | NOTVERIFIED                     |
      | DOI                    | 09-Apr-1986                     |
      | landlineNumber         | null                            |
      | webSite                | null                            |

#  @regression
#  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
#    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
#    Then user get the response for "<key>" is null from the demographic api where customer type is corporate
#    Examples:
#      | key            |
#      | landlineNumber |
#      | webSite        |

  @smoke @regression @sprint5
  Scenario: User validates the response code of demographic api and custID as response where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual

  @regression @sprint5
  Scenario Outline: User search with valid mdmId and validate response of demographic api for initial c flag record where customer type is individual for all the mentioned keys in examples
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is individual
    Examples:
      | key              | value                                                           |
      | name             | CHARU SADANA                                                    |
      | custId           | 996264849                                                       |
      | DOB              | 15-Mar-1994                                                     |
      | profession       | null                                                            |
      | custOpenDate     | 22-Aug-2015                                                     |
      | income           | null                                                            |
      | emailId          | rahul_sadana@yahoo.co.in                                        |
      | mobileNumber     | 918482095250                                                    |
      | alternateNumber  | 918482095250                                                    |
      | currentAddress   | W/O RAHUL SADANA 25-B KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL |
      | permanentAddress | W/O RAHUL SADANA 25-B KULTAR SINGH NAGAR NEAR DAV PUBLIC SCHOOL |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH                                        |
      | cluster          | null                                                            |
      | region           | null                                                            |
      | assetRM          | null                                                            |
      | liabilityRM      | 4188029                                                         |
      | serviceRM        | 2985009                                                         |
      | groupCode        | null                                                            |
      | PSM              | null                                                            |
      | nationality      | IN                                                              |
      | fatca            | null                                                            |
      | bagic            | 0                                                               |
      | ckycStatus       | N                                                               |
      | riskCategory     | HIGH RISK                                                       |

  @smoke @regression @sprint5
  Scenario: User validates the response code and custID of demographic api where customer type is corporate
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate

  @regression @sprint5
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is corporate
    Examples:
      | key              | value                           |
      | name             | SURINDRA RADIOS PRIVATE LIMITED |
      | custId           | 998003452                       |
      | DOI              | 09-Apr-1986                     |
      | constitution     | PVTLTD                          |
      | custOpenDate     | 29-Oct-2014                     |
      | annualTurnover   | 1 CRORE TO 5 CRORE              |
      | emailId          | amarjeets555@gmail.com          |
      | mobileNumber     | 918080112225                    |
      | alternateNumber  | 918080112225                    |
      | homeBranch       | CHANDIGARH                      |
      | cluster          | null                            |
      | region           | null                            |
      | IEC              | null                            |
      | assetRM          | null                            |
      | liabilityRM      | NO RM                           |
      | serviceRM        | 3719003                         |
      | groupCode        | 1466888                         |
      | PSM              | null                            |
      | natureofBusiness | Retail Trading/Merchants        |
      | natureofIndustry | Architecture Firm               |
      | riskCategory     | LOW RISK                        |
      | website          | null                            |
      | ecommSite        | null                            |

