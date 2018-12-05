@demographics
Feature: Validate demographics APIs

  @dev
  Scenario Outline: User validates the json schema of demographic api where customer type is individual to validate that API is per contract
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is individual
    Then a genie user validates that in the response for demographic api for individual has all the required fields of required types as mentioned in "<filename>"
    Examples:
      | filename                          |
      | demographicsIndividualSchema.json |

  @Smoke @Regression
  Scenario: User validates the response code and count of records of demographic api where customer type is individual
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is individual
    Then a user get the status code 200 as a response from the demographic api where customer type is individual
    Then user get the response from the demographic api where customer type is individual and count of records in response is more than 1

  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "<key>" is "<value>" from the demographic api where customer type is individual
    Examples:
      | key                 | value            |
      | mobileNumber        | AJAY KUMAR       |
      | custSegment         | Pune             |
      | customerType        | 9899             |
      | vintage             | customer25       |
      | CKYC No.            | rahul customer35 |
      | BS/PS               | 274337           |
      | profitablilityBand  | BRB              |
      | contactibilityIndex | RB               |
      | gender              | C                |
      | custType            | C                |

  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for the initial record for mdmid is "<value>" from the demographic api where customer type is individual
    Examples:
      | value  |
      | 809725 |

  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is individual
    Then user get the response for "<parameter>" like pan is "<value>" from the demographic api where customer type is individual
    Examples:
      | parameter  |value|
      | PAN        |     |
      | aadharNo   |     |
      | passportNo |     |

  @dev
  Scenario Outline: User validates the json schema of demographic api where customer type is corporate to validate that API is per contract
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is corporate
    Then a genie user validates that in the response for demographic api for corporate has all the required fields of required types as mentioned in "<filename>"
    Examples:
      | filename                         |
      | demographicsCorporateSchema.json |

  @Smoke @Regression
  Scenario: User validates the response code and count of records of demographic api where customer type is corporate
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is corporate
    Then a user get the status code 200 as a response from the demographic api where customer type is corporate
    Then user get the response from the demographic api where customer type is corporate and count of records in response is more than 1


  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "<key>" is "<value>" from the demographic api where customer type is corporate
    Examples:
      | key                | value            |
      | mobileNumber       | AJAY KUMAR       |
      | landlineNumber     | Pune             |
      | email              | Fort, Mumbai     |
      | customerType       | 9899             |
      | vintage            | customer25       |
      | CKYC No.           | rahul customer35 |
      | BS/PS              | 274337           |
      | profitablilityBand | BRB              |
      | annualTurnover     | RB               |
      | DOI                | 03-May-2011      |
      | business           | 01-Jan-1990      |
      | industry           | C                |
      | gender             | C                |
      | custType           | C                |

  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for the initial record for mdmid is "<value>" from the demographic api where customer type is corporate
    Examples:
      | value  |
      | 809725 |

  @Regression
  Scenario Outline: User search with valid mdmId and validate response of demographic api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user passes the "mdmid" as a parameter to get the response from demographic api where customer type is corporate
    Then user get the response for "<parameter>" like pan is "<value>" from the demographic api where customer type is corporate
    Examples:
      | parameter |value|
      | PAN       |     |
