@search
Feature: Validate Search API

  Background: User has api to test
    Given api to test is "http://yesgenie.com:30978/api/customer/search"

  @simplesearch @smoke @regression
  Scenario Outline: User search with mdmid and other parameters mentioned in below Examples: and validate response from tha api
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    Examples:
      | query              | threshold |
      | 838191             | 50        |
      | 9927217421         | 50        |
      | AAHXX7837X         | 50        |
      | Y7654537           | 50        |
      | customer kumar37   | 50        |
      | 181400005300037    | 50        |
      | 12355612355636     | 5000      |
      | 223355567736       | 5000      |
      | customer36@yesbank | 5000      |
      | 08/09/2003         | 5000      |

  @simplesearch @regression
  Scenario: User search with mdmid and validate customerSearchEnabled is true or false
    When a user search with value "838297" and setting value for threshold "50"
    Then user get the response from the api as "true"

  @simplesearch @regression @smoke
  Scenario Outline: User search with valid custid and validate response for all the mentioned keys in example
    When a user search with value "838297" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value         |
      | customerName     | Foo6 foo      |
      | city             | goa           |
      | addressArea      | mmm road      |
      | homeBranch       | fort goa      |
      | assetRM          | sandeep kumar |
      | liabilityRM      | rahul rawel   |
      | groupId          | 274361        |
      | businessSegment  | brb           |
      | partnerSegment   | brb           |
      | customerOpenDate | 01/05/2011    |
      | DOB              | 05/05/2007    |
      | custType         | I             |

  @simplesearch @smoke @regression
  Scenario Outline: User search with valid mdmid and validate response for custId and mdmId
    When a user search with value "838297" and setting value for threshold "50"
    Then user get the response from the api for initial record of numeric type for "<nkey>" is <nvalue>
    Examples:
      | nkey   | nvalue |
      | custId | 838297 |
      | mdmId  | 838191 |

  @dev
  Scenario: User search with valid mdmid and validate json schema
    When a user search with value "838297" and setting value for threshold "50"
    Then search api response json schema is validated successfully

  @simplesearch @regression
  Scenario: User search with name to test threshold validation
    When a user search with value "Vibhu" and setting value for threshold "50"
    Then user get status code is 400 as response from the api

  @simplesearch @regression
  Scenario: User search with name and validate the count is greater than threshold value
    When a user search with value "Vibhu" and setting value for threshold "5000"
    Then user get the response from the api and count of records is more than 50

  @refinesearch @regression
  Scenario: User perform refine search with valid customer name and city and validate status
    When a user search with value "Venkata Bhuvana Santhosh Kumar Rikka swamy+Thiruvananthapuram" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "Foo6 foo+goa" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value         |
      | customerName     | Foo6 foo      |
      | city             | goa           |
      | addressArea      | mmm road      |
      | homeBranch       | fort goa      |
      | assetRM          | sandeep kumar |
      | liabilityRM      | rahul rawel   |
      | groupId          | 274361        |
      | businessSegment  | brb           |
      | partnerSegment   | brb           |
      | customerOpenDate | 01/05/2011    |
      | DOB              | 05/05/2007    |
      | custType         | I             |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "Foo6 foo+05/05/2007" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value         |
      | customerName     | Foo6 foo      |
      | city             | goa           |
      | addressArea      | mmm road      |
      | homeBranch       | fort goa      |
      | assetRM          | sandeep kumar |
      | liabilityRM      | rahul rawel   |
      | groupId          | 274361        |
      | businessSegment  | brb           |
      | partnerSegment   | brb           |
      | customerOpenDate | 01/05/2011    |
      | DOB              | 05/05/2007    |
      | custType         | I             |