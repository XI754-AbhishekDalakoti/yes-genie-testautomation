Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to url "https://cust360.yesgenie.com:31390"
    Then I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    Then I click on Login

  @Smoke @Regression @logout
  Scenario: Ensure static parameter under search bar is displayed
    And I wait for 2 sec
    Then Under search bar, it contains static search parameters

  @Regression @Regression @logout
  Scenario Outline: Search with record which is not present in system and "No Customer Found." message is displayed
    And I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    Then 'No Customer Found.' message is displayed
    And I wait for 2 sec
    Examples:
      | Parameter   |
      | Xebia       |
      | ABZVS6253K  |
      | 15-May-1990 |

  @Regression @Smoke @logout
  Scenario Outline: Search with different parameters
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    And I wait for 2 sec
    Examples:
      | Parameter                    |
      | 181920                       |
      | 8800292281                   |
      | charu sadana                 |
      | AQXPP8200E                   |
      | P5166954                     |
      | 057763400000124              |
      | 555LA17180020001             |
      | 50047485661343               |
      | rajatkanwar.gupta@yesbank.in |

  @Regression @logout
  Scenario: Search with MDM ID and if that MDM ID is not present in CUST ID column then "No Results Found" message should be displayed
    Then I wait for 2 sec
    And I enter "9980023199" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    Then 'No Customer Found.' message is displayed
    And I wait for 2 sec

  @Regression @Smoke @logout
  Scenario Outline: Refine search message option when threshold 50 exceeded
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    Then 'Too many matching customers found. Please refine your search criterion.' message is displayed due to threshold exceeded
    And I wait for 2 sec
    Examples:
      | Parameter    |
      | Ayush Sharma |

  @Regression @Smoke @logout
  Scenario Outline: Search data with refine parameter and lower and upper case both
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    And I wait for 2 sec
    Examples:
      | Parameter                 |
      | Resham devi + 12-dec-1950 |
      | resham DEVI + 12-Dec-1950 |
      | aYUSh sharma + Delhi      |
      | ayush Sharma+ delhi       |
      | Kanak + 1                 |

  @Regression @logout
  Scenario Outline: When user enters parameter in search field it should intelligently highlight the label with bubble
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then Accordingly respective "<Result>" gets highlighted in static search parameter under search bar
    And I wait for 2 sec
    Examples:
      | Parameter           | Result      |
      | AXEPD7154N          | PAN         |
      | Y7654537            | Passport    |
      | Ayush               | Cust Name   |
      | @tomer31twitter     | Twitter ID  |
      | 9184821250          | Mobile No.  |
      | 181400001300037     | Account No. |
      | 12355612355006      | CKYC No.    |
      | anupamgupta@yesbank | UPI Handle  |

  @Regression @logout
  Scenario Outline: Format of Search label below search bar
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    Then I wait for 2 sec
    And I verify search label display like 'Search result for "<Result1>": "<Result2>" "<Result3>": "<Result4>" Results'
    And I wait for 2 sec
    Examples:
      | Parameter | Result1 | Result2 | Result3    | Result4      |
      | Kanak + 1 | Kanak   | 1       | Cust Name: | Branch Code: |

  @Regression @logout
  Scenario: For single record after search & user is authorized to view, SNAP page is opened directly
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(text(),'Search')]"
    And I wait for 2 sec
    Then I click on individual record
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec

