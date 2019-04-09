@portfolio @channels
Feature: Validate channel apis


  @smoke @regression
  Scenario: User validates the response code of channel api and mdmId as response where customer type is individual
    Given a genie user has a channel api to test is "/api/genie/portfolio/channelsnaps/"
    When a genie user passes the "996264849" as a mdmid to get the response from channel api where customer type is individual
    And get the response from channel api
    Then a user get the status code 200 as a response from the channel api where customer type is individual


  @regression
  Scenario Outline: User search with valid mdmId and validate response of channel api where customer type is individual for all the mentioned keys in examples
    Given a genie user has a channel api to test is "/api/genie/portfolio/channelsnaps/"
    When a genie user passes the "996264849" as a mdmid to get the response from channel api where customer type is individual
    And get the response from channel api
    Then user get the response for netbanking loans "<key>" is "<value>" from the channel api where customer type is individual
    Examples:
      | key                           | value          |
      | channelCategory               | Netbanking     |
      | channelName                   | Netbanking     |
      | registeredStatus              | Not Registered |
      | lockedStatus                  | Unlocked       |
      | usage                         | Medium         |
      | trend                         | Constant       |




  @regression
  Scenario: User search with valid mdmId and validate response of channel api where customer type is Individual for all the mentioned keys in examples
    Given a genie user has a channel api to test is "/api/genie/portfolio/channelsnaps/"
    When a genie user passes the "24E" as a mdmid to get the response from channel api where customer type is individual
    And get the response from channel api
    Then a user get the status code 200 as a response from the channel api where customer type is individual
    And a user get empty Object as response from the channel api where customer type is individual