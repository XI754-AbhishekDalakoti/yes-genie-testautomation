@search
Feature: Validate Search API

  Background: User has api to test
    Given api to test is "http://yesgenie.com:30978/api/customer/search"

  @simple
  Scenario: User search with mdmid and validate customerSearchEnabled is true or false
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then the result for boolean customerSearchEnabled is "true"

@simple
  Scenario: User search with valid custid and validate status
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then I validate the status is OK

@simple
  Scenario Outline: User search with valid custid and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate and  DOB
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then result for custid in search parameter is "838297"
    Then the result for "<key>" is "<value>"
    Examples:
      | key              | value         |
      | customerName     | Foo6 foo      |
      | addressCity      | goa           |
      | addressArea      | mmm road      |
      | homeBranch       | fort goa      |
      | assetRM          | sandeep kumar |
      | liabilityRM      | rahul rawel   |
      | groupId          | 274361        |
      | businessSegment  | brb           |
      | partnerSegment   | brb           |
      | customerOpenDate | 01/05/2011    |
      | DOB              | 05/05/2007    |

@simple
  Scenario Outline: User search with valid custid and validate response for custId, mdmId and customerSearchEnabled
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then the result for boolean custId is "true"
    Then the result for numeric "<nkey>" is <nvalue>
    Examples:
      | nkey                  | nvalue |
      | custId                | 838297 |
      | mdmId                 | 838191 |

  @simple
  Scenario: User search with valid custid and validate schema
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then search api response schema is validated successfully

  @simple
  Scenario: User search with invalid custid and validate status
    When I set the base URL with query "838297" and isCustomerId "true" and threshold "50"
    Then I validate the status is OK

  @simple
  Scenario: User perform refine search with valid mdmid and validate status
    When I set the base URL with query "838191" and isCustomerId "false" and threshold "50"
    Then I validate the status is OK

  @simple
  Scenario: User search to test threshold validation
    When I set the base URL with query "chandan" and isCustomerId "false" and threshold "50"
    Then I validate the status code is 400

  @simple
  Scenario: User search with DOB and validate the response
    When I set the base URL with query "08/09/2003" and isCustomerId "false" and threshold "5000"
    Then I validate the status is OK

  @simple
  Scenario: User search with mdmid and validate the count is greater
    When I set the base URL with query "838100" and isCustomerId "false" and threshold "5000"
    Then validate count is greater than 10

  @refine
  Scenario: User perform refine search with valid customer name and city and validate status
    When I set the base URL with query "Venkata Bhuvana Santhosh Kumar Rikka swamy%2BThiruvananthapuram" and isCustomerId "false" and threshold "50"
    Then I validate the status is OK

  @refine
  Scenario Outline: User perform refine search with valid customer name and city and validate status and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate and  DOB
    When I set the base URL with query "Venkata Bhuvana Santhosh Kumar Rikka swamy+Thiruvananthapuram" and isCustomerId "false" and threshold "50"
    Then the result for "<key>" is "<value>"
    Examples:
      | key              | value                                      |
      | customerName     | Venkata Bhuvana Santhosh Kumar Rikka swamy |
      | addressCity      | Thiruvananthapuram                         |
      | addressArea      | main road                                  |
      | homeBranch       | fort goa                                   |
      | assetRM          | customer2                                  |
      | liabilityRM      | rahul customer2                            |
      | groupId          | 274363                                     |
      | businessSegment  | brb                                        |
      | partnerSegment   | brb                                        |
      | customerOpenDate | 01/05/2011                                 |
      | DOB              | 05/05/2007                                 |

  @refine
  Scenario Outline: User perform refine search with valid customer name and city and validate status and validate response for customerName, addressCity, addressArea, homeBranch, assetRM, liabilityRM, groupId, businessSegment, partnerSegment, customerOpenDate and  DOB
    When I set the base URL with query "Venkata Bhuvana Santhosh Kumar Rikka swamy+05/05/2007" and isCustomerId "false" and threshold "50"
    Then the result for "<key>" is "<value>"
    Examples:
      | key              | value                                      |
      | customerName     | Venkata Bhuvana Santhosh Kumar Rikka swamy |
      | addressCity      | Thiruvananthapuram                         |
      | addressArea      | main road                                  |
      | homeBranch       | fort goa                                   |
      | assetRM          | customer2                                  |
      | liabilityRM      | rahul customer2                            |
      | groupId          | 274363                                     |
      | businessSegment  | brb                                        |
      | partnerSegment   | brb                                        |
      | customerOpenDate | 01/05/2011                                 |
      | DOB              | 05/05/2007                                 |