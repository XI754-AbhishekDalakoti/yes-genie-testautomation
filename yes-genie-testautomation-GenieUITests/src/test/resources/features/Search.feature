Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

  @Smoke
  Scenario: Ensure static parameter under search bar is displayed
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "panna" into input field having id "username"
    And I enter "123" into input field having id "password"
    Then I click on Login
    And I wait for 2 sec
    Then Under search bar, it contains static search parameters

  @Regression
  Scenario Outline: Search with record which is not present in system and "No Results Found" message is displayed
    And I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'No Results Found, Please refine' message is displayed
    Examples:
      | Parameter   |
      | Mohit       |
      | ABZVS6253k  |
      | 15-May-1990 |

  Scenario Outline: Search with different parameters
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    Examples:
      | Parameter               |
      | 210010                  |
      | 9184821250              |
      | Ajay                    |
      | AXEPD7154N              |
      | Y7654537                |
      | 123456789123            |
      | 181400001300037         |
      | 12355612355006          |
      | anupamgupta@yesbank     |
      | anupamgupta@yahoo.co.in |
      | @tomer31twitter         |

  Scenario: Search with MDM ID and if that MDM ID is not present in CUST ID column then "No Results Found" message should be displayed
    Then I wait for 2 sec
    And I enter "810110" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'No Results Found, Please refine' message is displayed

  Scenario Outline: Refine search message option when threshold 50 exceeded
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'Search returned too many results, Please refine' message is displayed due to threshold exceeded
    Examples:
      | Parameter |
      | Ayush     |

  Scenario Outline: Search data with refine parameter and lower and upper case both
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    Examples:
      | Parameter           |
      | Ayush + 15-May-1990 |
      | ayush + 15-may-1990 |
      | aYUSh + Gurgaon     |
      | ayush + gurgaon     |
      | Ayush + 181         |

  Scenario Outline: When user enters parameter in search field it should intelligently highlight the label with bubble
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then Accordingly respective "<Result>" gets highlighted in static search parameter under search bar
    Examples:
      | Parameter           | Result      |
      | AUGXX7978X          | PAN         |
      | H7890987            | Passport    |
      | 123456789123        | Aadhar      |
      | Bhuvana             | Cust Name   |
      | @tomer31twitter     | Twitter ID  |
      | 9184821250          | Mobile No.  |
      | 181400001300037     | Account No. |
      | 12355612355006      | CKYC No.    |
      | anupamgupta@yesbank | UPI Handle  |

  Scenario Outline: Format of Search label below search bar
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    And I verify search label display like 'Search result for "<Result1>": "<Result2>" "<Result3>": "<Result4>" Results'
    Examples:
      | Parameter           | Result1 | Result2     | Result3    | Result4 |
      | Ayush + 15-May-1990 | Ayush   | 15-May-1990 | Cust Name: | DOB:    |

  Scenario: For single record after search & user is authorized to view, SNAP page is opened directly
    Then I wait for 2 sec
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly

  Scenario: For single record after search & user is not authorized to view, record is displayed in results
    Then I wait for 2 sec
    And I wait for 2 sec
    Then I enter "2408888" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    Then I should get logout