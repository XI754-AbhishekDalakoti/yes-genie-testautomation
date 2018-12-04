@search
Feature: Validate Search API

  Background: User has api to test
    Given api to test is "http://yesgenie.com:30978/api/customer/search"

  @simplesearch @smoke @regression
  Scenario Outline: User search with mdmid and other parameters mentioned in below Examples: and validate response from tha api
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    Then user get the response from the api and count of records is more than 1
    Examples:
      | query               | threshold |
      | 838240              | 5000      |
      | 9927217123          | 5000      |
      | AAKXX7837C          | 5000      |
      | Y7654537            | 5000      |
      | Ayush               | 5000      |
      | 181400005300037     | 5000      |
      | 12355612355636      | 5000      |
      | 223355560036        | 5000      |
      | anupamgupta@yesbank | 5000      |
      | 01-Jan-1990         | 5000      |

  @simplesearch @regression
  Scenario: User search with mdmid and validate customerSearchEnabled is true or false
    When a user search with value "838240" and setting value for threshold "50"
    Then user get the response from the api as "true"

  @simplesearch @regression @smoke
  Scenario Outline: User search with valid custid and validate response for all the mentioned keys in example
    When a user search with value "838240" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | AJAY KUMAR       |
      | city             | Pune             |
      | addressArea      | Fort, Mumbai     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 01-Jan-1990      |
      | custType         | C                |

  @simplesearch @smoke @regression
  Scenario Outline: User search with valid mdmid and validate response for custId and mdmId
    When a user search with value "838240" and setting value for threshold "50"
    Then user get the response from the api for initial record of numeric type for "<nkey>" is <nvalue>
    Examples:
      | nkey   | nvalue |
      | custId | 838219 |
      | mdmId  | 838240 |

  @dev
  Scenario: User search with valid mdmid and validate json schema
    When a user search with value "838240" and setting value for threshold "50"
    Then search api response json schema is validated successfully

  @simplesearch @regression
  Scenario: User search with name to test threshold validation
    When a user search with value "Ayush" and setting value for threshold "50"
    Then user get status code is 400 as response from the api

  @simplesearch @regression
  Scenario: User search with name and validate the count is greater than threshold value
    When a user search with value "Ayush" and setting value for threshold "5000"
    Then user get the response from the api and count of records is more than 50

  @refinesearch @regression
  Scenario: User perform refine search with valid customer name and city and validate status
    When a user search with value "HUSSEIN ABDULKARIM  BALWA POA+Bangalore" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "AJAY KUMAR+Pune" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | AJAY KUMAR       |
      | city             | Pune             |
      | addressArea      | Fort, Mumbai     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 01-Jan-1990      |
      | custType         | C                |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "AJAY KUMAR+01-Jan-1990" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | AJAY KUMAR       |
      | city             | Pune             |
      | addressArea      | Fort, Mumbai     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 01-Jan-1990      |
      | custType         | C                |
