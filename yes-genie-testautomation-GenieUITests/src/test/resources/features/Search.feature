Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

  @Regression
  Scenario: Search with MDM ID
    Given I'm on login page
    Then I wait for 2 sec
    And I enter "panna" into input field having id "username"
    And I enter "123" into input field having id "password"
    Then I click on Login
    And I wait for 2 sec
    Then I enter "838240" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then Search result is displayed with all fields

  @Smoke
  Scenario: Ensure static parameter under search bar is displayed
    And I wait for 2 sec
    Then Under search bar, it contains static search parameters

  @Regression
  Scenario: Search with wrong MDM ID
    And I enter "838241" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then No search result is displayed

  Scenario Outline: Search with different parameters with MDMID
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields
    Examples:
      | Parameter               |
      | 838285                  |
      | 9927217998              |
      | Ajit Singh              |
      | AAHXX7837Z              |
      | Y7654561                |
      | 12355612355878          |
      | ajitsingh@yesbank       |
      | ajitsingh99@yahoo.co.in |
      | 223355567986            |
      | 12-Sep-2000             |
      | Indore                  |

  Scenario Outline: Refine search message option when threshold 50 exceeded
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Message comes for search refinement due to threshold exceeded
    Examples:
      | Parameter           |
      | Ayush               |
      | anupamgupta@yesbank |

  Scenario Outline: Search data with refine parameter
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields
    Examples:
      | Parameter        |
      | Ayush + Jabalpur |

  Scenario Outline: When user enters parameter in search field it should intelligently highlight the label with bubble
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then Accordingly respective "<Result>" gets highlighted
    Examples:
      | Parameter  | Result    |
      | AUGXX7978X | PAN       |
      | H7890987   | Passport  |
      | Bhuvana    | Cust Name |

  Scenario Outline: Format of Search label below search bar
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    And I verify search label display like 'Search result for "<Result1>": "<Result2>" "<Result3>": "<Result4>" Results'
    Then I should get logout
    Examples:
      | Parameter           | Result1 | Result2     | Result3    | Result4 |
      | Ayush + 15-May-1990 | Ayush   | 15-May-1990 | Cust Name: | DOB:    |

  @Regression
  Scenario: Close browser
    Then I close browser


