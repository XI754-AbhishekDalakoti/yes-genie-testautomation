@search
Feature: Validate Search API

  Background: User has api to test
    Given api to test is "http://yesgenie.com:30978/api/customer/search"

  @simplesearch @smoke @regression
  Scenario Outline: User search with custId and other parameters mentioned in below Examples: and validate response from tha api
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    Then user get the response from the api and count of records is more than 1
    Examples:
      | query               | threshold |
      | 210010              | 50        |
      | 9184820250          | 50        |
      | AXEPD7154N          | 50        |
      | Y7654537            | 50        |
      | Ayush               | 500       |
      | 181400001300037     | 50        |
      | 12355612355006      | 50        |
      | 123456789123        | 50        |
      | anupamgupta@yesbank | 50        |
      | @tomer31twitter     | 50        |

  @simplesearch @regression
  Scenario: User search with custId and validate customerSearchEnabled is true or false
    When a user search with value "210010" and setting value for threshold "50"
    Then user get the response from the api as "true"

  @simplesearch @regression @smoke
  Scenario Outline: User search with valid custid and validate response for all the mentioned keys in example
    When a user search with value "210010" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | Ayush            |
      | city             | Delhi            |
      | addressArea      | Fort, karnal     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 15-May-1990      |
      | custType         | I                |

  @simplesearch @smoke @regression
  Scenario Outline: User search with valid custId and validate response for custId and mdmId
    When a user search with value "210010" and setting value for threshold "50"
    Then user get the response from the api for initial record of numeric type for "<nkey>" is <nvalue>
    Examples:
      | nkey   | nvalue |
      | custId | 210010 |
      | mdmId  | 810110 |

  @dev
  Scenario: User search with valid custId and validate json schema
    When a user search with value "210010" and setting value for threshold "50"
    Then search api response json schema is validated successfully

  @simplesearch @regression
  Scenario: User search with name to test threshold validation
    When a user search with value "Ayush" and setting value for threshold "50"
    Then user get status code is 400 as response from the api

  @simplesearch @regression
  Scenario: User search with name and validate the count is greater than threshold value
    When a user search with value "Ayush" and setting value for threshold "5000"
    Then user get the response from the api and count of records is more than 50

  @simplesearch @smoke @regression
  Scenario Outline: User search with different parameters mentioned in below examples to validate search is not restrict to case sensitive
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    Then user get the response from the api and count of records is more than 1
    Examples:
      | query               | threshold |
      | AyUsh               | 5000      |
      | AnupamGupta@yesbank | 5000      |
      | @toMEr31twitter     | 5000      |
      | AxepD7154N          | 50        |
      | y7654537            | 50        |

  @refinesearch @regression
  Scenario: User perform refine search with valid customer name and city and validate status
    When a user search with value "HUSSEIN ABDULKARIM  BALWA POA+Bangalore" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    Then user get the response from the api and count of records is more than 1

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "Ayush+Delhi" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | Ayush            |
      | city             | Delhi            |
      | addressArea      | Fort, karnal     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 15-May-1990      |
      | custType         | I                |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and DOB and validate response for all the mentioned keys in below Examples:
    When a user search with value "Ayush+15-May-1990" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | Ayush            |
      | city             | Delhi            |
      | addressArea      | Fort, karnal     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 15-May-1990      |
      | custType         | I                |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and Branch Code and validate response for all the mentioned keys in below Examples:
    When a user search with value "Ayush+181" and setting value for threshold "5000"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value            |
      | customerName     | Ayush            |
      | city             | Delhi            |
      | addressArea      | Fort, karnal     |
      | homeBranch       | 9899             |
      | assetRM          | customer25       |
      | liabilityRM      | rahul customer35 |
      | groupId          | 274337           |
      | businessSegment  | BRB              |
      | partnerSegment   | RB               |
      | customerOpenDate | 03-May-2011      |
      | DOB              | 15-May-1990      |
      | custType         | I                |

  @simplesearch
  Scenario: User perform refine search with valid email id and validate response from the api
    When a user search with value "anupamgupta@yahoo.co.in" and setting value for threshold "5000"
    Then a user get the status code 200 as a response from the api
    Then user get the response from the api and count of records is more than 1
