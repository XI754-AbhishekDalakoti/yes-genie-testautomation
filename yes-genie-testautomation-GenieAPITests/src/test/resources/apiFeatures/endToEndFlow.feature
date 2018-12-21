@e2e

Feature: Validate end to end response from search and demographics API

  Scenario Outline: This is the test to validate all API is sending 200 as a response where customer type is individual
    Given api to test is "http://yesgenie.com:30978/api/customer/search"
    When a user search with value "996264849" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    Then a genie user has a demographic api to test is "http://yesgenie.com:30978/api/demographic/"
    And a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    And user get the response for "mdmId" is "996264849" from the demographic api where customer type is individual
    And user get the response for "emailId" is "rahul_sadana@yahoo.co.in" from the demographic api where customer type is individual
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


  Scenario Outline: This is the test to validate all API is sending 200 as a response where customer type is corporate
    Given api to test is "http://yesgenie.com:30978/api/customer/search"
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
      | business               | null                            |
      | industry               | Architecture Firm               |
      | annualTurnover         | 1 CRORE TO 5 CRORE              |
      | landlineNumberStatus   | NOTAVAILABLE                    |
      | PS                     | null                            |
      | BS                     | BRB                             |
      | PAN                    | NOTVERIFIED                     |
      | DOI                    | 09-Apr-1986                     |
      | landlineNumber         | null                            |
      | webSite                | null                            |

  Scenario Outline: This is the test to validate all API is sending 200 as a response where customer type is individual and validate the response of initial c flag record
    Given api to test is "http://yesgenie.com:30978/api/customer/search"
    When a user search with value "996264849" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is individual
    And user get the response for "custId" is "996264849" from the demographic api for initial c flag record where customer type is individual
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the demographic api for initial c flag record where customer type is individual
    Examples:
      | key              | value                     |
      | name             | CHARU SADANA              |
      | custId           | 996264849                 |
      | DOB              | 15-Mar-1994               |
      | profession       | BUSINESS                  |
      | custOpenDate     | 22-Aug-2015               |
      | income           | 0 TO 50 LACS              |
      | emailId          | rahul_sadana@yahoo.co.in  |
      | mobileNumber     | 918482095250              |
      | alternateNumber  | 918482095250              |
      | currentAddress   | SAHARANPUR,UTTAR PRADESH  |
      | permanentAddress | SAHARANPUR,UTTAR PRADESH  |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH  |
      | cluster          | null                      |
      | region           | null                      |
      | assetRM          | null                      |
      | liabilityRM      | 4188029                   |
      | serviceRM        | 2985009                   |
      | groupCode        | null                      |
      | PSM              | null                      |
      | nationality      | IN                        |
      | fatca            | null                      |
      | bagic            | 0                         |
      | ckycStatus       | FCKYC-F to F Complete KYC |
      | riskCategory     | HIGH RISK                 |

  Scenario Outline: This is the test to validate all API is sending 200 as a response where customer type is corporate and validate the response of initial c flag record
    Given api to test is "http://yesgenie.com:30978/api/customer/search"
    When a user search with value "998003452" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than 1
    When a genie user passes the "998003452" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api for initial c flag record where customer type is corporate
    And user get the response for "custId" is "998003452" from the demographic api for initial c flag record where customer type is corporate
    When a genie user passes the "996264849" as a parameter to get the response from demographic api where customer type is corporate
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
