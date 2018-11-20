@search
Feature: Validate Search API

  Background: User has api to test
    Given api to test is "http://yesgenie.com:30978/api/customer/search"

  @simple
  Scenario Outline: User search with mdmid, mobile no, pan, adhar,name,account number etc. and validate customerSearchEnabled is true or false
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user should get the positive response from the system
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

  @simple
  Scenario: User search with mdmid and validate customerSearchEnabled is true or false
    When a user search with value "838191" and setting value for threshold "50"
    Then user should get the response from the system as "true"

  @simple
  Scenario Outline: User search with valid mdmid and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate, cust flag and DOB
    When a user search with value "838191" and setting value for threshold "50"
    Then user should get the response from the system for first record for "<key>" is "<value>"
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

  @simple
  Scenario Outline: User search with valid mdmid and validate response for custId, mdmId and customerSearchEnabled
    When a user search with value "838191" and setting value for threshold "50"
    Then user should get the response from the system as "true"
    Then user should get the response from the system for first record of numeric type for "<nkey>" is <nvalue>
    Examples:
      | nkey   | nvalue |
      | custId | 838297 |
      | mdmId  | 838191 |

  @simple
  Scenario: User search with valid mdmid and validate schema
    When a user search with value "838191" and setting value for threshold "50"
    Then search api response schema is validated successfully

  @simple
  Scenario: User search to test threshold validation
    When a user search with value "Vibhu" and setting value for threshold "50"
    Then user should get status code is 400 as response from the system

  @simple
  Scenario: User search with name and validate the count is greater
    When a user search with value "Vibhu" and setting value for threshold "5000"
    Then user should get the response from the system and count of records should be more than 50

  @refine
  Scenario: User perform refine search with valid customer name and city and validate status
    When a user search with value "Venkata Bhuvana Santhosh Kumar Rikka swamy+Thiruvananthapuram" and setting value for threshold "50"
    Then a user should get the positive response from the system

  @refine
  Scenario Outline: User perform refine search with valid customer name and city and validate status and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate and  DOB
    When a user search with value "Foo6 foo+goa" and setting value for threshold "50"
    Then user should get the response from the system for first record for "<key>" is "<value>"
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

  @refine
  Scenario Outline: User perform refine search with valid customer name and city and validate status and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate and  DOB
    When a user search with value "Foo6 foo+05/05/2007" and setting value for threshold "50"
    Then user should get the response from the system for first record for "<key>" is "<value>"
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