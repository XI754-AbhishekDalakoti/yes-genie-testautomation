@demographics
Feature: Validate demographics APIs

  @dev
  Scenario Outline: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for individual customer type
    Then json schema response of "<filename>" for demographic api for individual is validated successfully
    Examples:
      | filename                          |
      | demographicsIndividualSchema.json |

  @Smoke @Regression
  Scenario: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for individual customer type
    Then a user get the status code 200 as a response from the demographic api for individual
    Then user get the response from the demographic api for individual and count of records is more than 1

  @Regression
  Scenario Outline: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for individual customer type
    Then user get the response from the demographic api for individual for "<key>" is "<value>"
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
  Scenario Outline: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for individual customer type
    Then user get the response from the demographic api for individual for the initial record for mdmid is "<value>"
    Examples:
      | value  |
      | 809725 |

  @Regression
  Scenario Outline: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for individual customer type
    Then user get the response from the demographic api for individual for "<parameter>" like pan is "<value>"
    Examples:
      | parameter  |value|
      | PAN        |     |
      | aadharNo   |     |
      | passportNo |     |

  @dev
  Scenario Outline: User validates the json schema of demographic api for corporate
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for corporate customer type
    Then json schema response of "<filename>" for demographic api for corporate is validated successfully
    Examples:
      | filename                         |
      | demographicsCorporateSchema.json |

  @Smoke @Regression
  Scenario: User validates the json schema of demographic api for individual
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for corporate customer type
    Then a user get the status code 200 as a response from the demographic api for corporate
    Then user get the response from the demographic api for corporate and count of records is more than 1

  @Regression
  Scenario Outline: User validates the json schema of demographic api for corporate
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for corporate customer type
    Then user get the response from the demographic api for corporate for "<key>" is "<value>"
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
  Scenario Outline: User validates the json schema of demographic api for corporate
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for corporate customer type
    Then user get the response from the demographic api for corporate for the initial record for mdmid is "<value>"
    Examples:
      | value  |
      | 809725 |

  @Regression
  Scenario Outline: User validates the json schema of demographic api for corporate
    Given a genie user has an demographic api to test is "http://yesgenie.com:30978/api/customer/search"
    When a genie user searches the "mdmid" and open snap page for corporate customer type
    Then user get the response from the demographic api for corporate for "<parameter>" like pan is "<value>"
    Examples:
      | parameter |value|
      | PAN       |     |
