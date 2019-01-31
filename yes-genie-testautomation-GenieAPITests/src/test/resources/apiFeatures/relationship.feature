@relationship
Feature: Validate nba APIs

  @smoke @regression
  Scenario: User validates the response code of relationship api and mdmId as response where customer type is individual
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "996264849" as a mdmid to get the response from relationship api where customer type is individual
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Individual
    Then a user get the status code 200 as a response from the relationship api where customer type is individual
    And user get the response for friend group for "mdmId" is "12713" from the relationship api where customer type is individual
    And user get the response for family group for "mdmId" is "601" from the relationship api where customer type is individual

  @regression
  Scenario Outline: User search with valid mdmId and validate response of relationship api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "996264849" as a mdmid to get the response from relationship api where customer type is individual
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Individual
    Then user get the response for friend group for "<key>" is "<value>" from the relationship api where customer type is individual
    Examples:
      | key              | value         |
      | name             | Abhishek Jain |
      | mdmId            | 12713         |
      | relation         | Friend        |
      | bankName         | Yes Bank      |
      | custCategory     | I             |
      | relationshipType | Friend        |
      | imageUrl         | null          |
      | remarks          | System        |
      | incomeBand       | null          |

  @regression
  Scenario Outline: User search with valid mdmId and validate response of relationship api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "996264849" as a mdmid to get the response from relationship api where customer type is individual
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Individual
    Then user get the response for family group for "<key>" is "<value>" from the relationship api where customer type is individual
    Examples:
      | key              | value        |
      | name             | Pankaj Gupta |
      | mdmId            | 601          |
      | relation         | Family       |
      | bankName         | Yes Bank     |
      | custCategory     | I            |
      | relationshipType | Family       |
      | imageUrl         | null         |
      | remarks          | System       |
      | incomeBand       | Red          |

  @smoke @regression
  Scenario: User validates the response code of relationship api and mdmId as response where customer type is corporate
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "1002" as a mdmid to get the response from relationship api where customer type is corporate
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Corporate
    Then a user get the status code 200 as a response from the relationship api where customer type is corporate
    And user get the response for Corporate group for "mdmId" is "112345" from the relationship api where customer type is corporate
    And user get the response for family group for "mdmId" is "996264849" from the relationship api where customer type is corporate

  @regression
  Scenario Outline: User search with valid mdmId and validate response of relationship api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "1002" as a mdmid to get the response from relationship api where customer type is corporate
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Corporate
    Then user get the response for Corporate group for "<key>" is "<value>" from the relationship api where customer type is corporate
    Examples:
      | key              | value           |
      | name             | Turkey Crackers |
      | mdmId            | 112345          |
      | relation         | Spouse          |
      | bankName         | Yes Bank        |
      | custCategory     | C               |
      | relationshipType | Corporate       |
      | imageUrl         | null            |
      | remarks          | System          |
      | incomeBand       | Green           |

  @regression
  Scenario Outline: User search with valid mdmId and validate response of relationship api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "1002" as a mdmid to get the response from relationship api where customer type is corporate
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Corporate
    Then user get the response for family group for "<key>" is "<value>" from the relationship api where customer type is corporate
    Examples:
      | key              | value        |
      | name             | Charu Sadana |
      | mdmId            | 996264849    |
      | relation         | Spouse       |
      | bankName         | Axis Bank    |
      | custCategory     | I            |
      | relationshipType | Family       |
      | imageUrl         | null         |
      | remarks          | System       |
      | incomeBand       | Green        |


  @regression
  Scenario: User search with valid mdmId and validate response of relationship api where customer type is corporate for all the mentioned keys in examples
    Given a genie user has a relationship api to test is "http://cust360.yesgenie.com:30978/api/customer/relationship/"
    When a genie user passes the "24" as a mdmid to get the response from relationship api where customer type is individual
    And a user pass groupLimit value "2" and setting value for relationshipLimit is "1" where customer type is Individual
    Then a user get the status code 200 as a response from the relationship api where customer type is individual
    And a user get empty Object as response from the relationship api where customer type is individual


