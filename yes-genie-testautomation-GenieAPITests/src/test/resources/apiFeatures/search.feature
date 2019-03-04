@search
Feature: Validate Search API

  Background: User get the access token
#    Given user wants a valid access token from "http://sso.yesgenie.com:30978/auth/realms/YBL/protocol/openid-connect/token" URI
#    And to get valid access token user passes "yes-genie-frontend" as "client_id" and "password" as "grant_type" and "manisha" as "username" and "manisha" as "password" and "f2b07a8f-ce69-41c6-9d28-f056bc9713fe" as "client_secret"
    Given api to test is "/api/genie/customer/search"

  @simplesearch @smoke @regression
  Scenario Outline: User search with custId and other parameters mentioned in below Examples: and validate response from tha api
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than or equal to 0
    Examples:
      | query               | threshold |
      | 996264849           | 50        |
      | 7123456789          | 50        |
      | AXEPD7154N          | 50        |
      | Y7654537            | 50        |
      | CHARU SADANA        | 50        |
      | 101400079900037     | 5000        |
      | 12355612355006      | 5000        |
      | 123456789123        | 5000        |
      | anupamgupta@yesbank | 5000        |
      | @tomer31twitter     | 5000        |

  @simplesearch @regression
  Scenario: User search with custId and validate accessiblity is true or false
    When a user search with value "996264849" and setting value for threshold "50"
    Then user get the response from the api as "true"

  @simplesearch
  Scenario: User search with valid email id and validate response from the api
    When a user search with value "csadana@yahoo.co.in" and setting value for threshold "50"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than or equal to 1

  @simplesearch @regression
  Scenario Outline: User search with valid custid and validate response for all the mentioned keys in example
    When a user search with value "996264849" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value                    |
      | customerName     | CHARU SADANA             |
      | city             | SAHARANPUR               |
      | addressArea      | W/O RAHUL SADANA 25-B    |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH |
      | assetRM          | NULL                     |
      | groupId          | 274937                   |
      | businessSegment  | BRB                      |
      | partnerSegment   | NULL                     |
      | customerOpenDate | 11-Mar-2017              |
      | DOB              | 11-Sep-1987              |
      | custType         | I                        |


  @simplesearch @smoke @regression
  Scenario Outline: User search with valid custId and validate response for custId and mdmId
    When a user search with value "996264849" and setting value for threshold "50"
    Then user get the response from the api for initial record of numeric type for "<nkey>" is <nvalue>
    Examples:
      | nkey   | nvalue    |
      | custId | 996264849 |
      | mdmId  | 101       |

  @simplesearch @regression
  Scenario: User search with name to test threshold validation
    When a user search with value "Ayush" and setting value for threshold "50"
    Then user get status code is 400 as response from the api

  @simplesearch @regression
  Scenario: User search with name and validate the count is greater than threshold value
    When a user search with value "Ayush" and setting value for threshold "5000"
    Then user get the response from the api and count of records is more than or equal to 51

  @simplesearch @smoke @regression
  Scenario Outline: User search with different parameters mentioned in below examples to validate search is not restrict to case sensitive
    When a user search with value "<query>" and setting value for threshold "<threshold>"
    Then a user get the status code 200 as a response from the api
    And user get the response from the api and count of records is more than or equal to 0
    Examples:
      | query               | threshold |
      | ChaRu sadana        | 50        |
      | AnupamGupta@yesbank | 5000      |
      | @toMEr31twitter     | 5000      |
      | AxepD7154N          | 50        |
      | y7654537            | 50        |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and city and validate response for all the mentioned keys in below Examples:
    When a user search with value "Prabhat Arya+Saharanpur" and setting value for threshold "100"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value                 |
      | customerName     | Prabhat Arya          |
      | city             | SAHARANPUR            |
      | addressArea      | W/O RAHUL SADANA 25-B |
      | homeBranch       | SAHARANPUR,UTTAR PRADESH|
      | assetRM          | NULL                  |
      | groupId          | 274937                |
      | businessSegment  | BRB                   |
      | partnerSegment   | NULL                  |
      | customerOpenDate | 11-Mar-2017           |
      | DOB              | 11-Sep-1987           |
      | custType         | I                     |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and DOB and validate response for all the mentioned keys in below Examples:
    When a user search with value "Ayush+30-May-1952" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value                 |
      | customerName     | Ayush                 |
      | city             | Delhi                 |
      | addressArea      | W/O RAHUL SADANA 25-B |
      | homeBranch       | Panipat,Haryana       |
      | assetRM          | NULL                  |
      | groupId          | 274937                |
      | businessSegment  | BRB                   |
      | partnerSegment   | RB                    |
      | customerOpenDate | 18-Apr-2016           |
      | DOB              | 30-May-1952           |
      | custType         | I                     |

  @refinesearch @regression
  Scenario Outline: User perform refine search with valid customer name and Branch Code and validate response for all the mentioned keys in below Examples:
    When a user search with value "Ayush+2019" and setting value for threshold "50"
    Then user get the response from the api for the initial record for "<key>" is "<value>"
    Examples:
      | key              | value                 |
      | customerName     | Ayush                 |
      | city             | Delhi                 |
      | addressArea      | W/O RAHUL SADANA 25-B |
      | homeBranch       | Panipat,Haryana       |
      | assetRM          | NULL                  |
      | groupId          | 274937                |
      | businessSegment  | BRB                   |
      | partnerSegment   | RB                    |
      | customerOpenDate | 30-Nov-2016           |
      | DOB              | 30-May-1952           |
      | custType         | I                     |