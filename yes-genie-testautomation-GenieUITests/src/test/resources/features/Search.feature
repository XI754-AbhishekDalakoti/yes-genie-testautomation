Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "https://cust360.uat-genie.yesbank.com"
    Then I wait for 2 sec
    And I enter "MCC0008398" into input field having id "username"
    And I enter "yesbank@321" into input field having id "password"
    Then I click on Login

  @Smoke @Regression
  Scenario: Ensure static parameter under search bar is displayed
    And I wait for 2 sec
    Then Under search bar, it contains static search parameters

  @Regression @Regression
  Scenario Outline: Search with record which is not present in system and "No Customer Found." message is displayed
    And I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'No Customer Found.' message is displayed
    And I wait for 2 sec
    Examples:
      | Parameter   |
      | Mohit       |
      | ABZVS6253K  |
      | 15-May-1990 |

  @Regression @Smoke
  Scenario Outline: Search with different parameters
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    And I wait for 2 sec
    Examples:
      | Parameter            |
      | 1001                 |
      | 9184820250           |
      | Abhishek             |
      | AXEPD7154N           |
      | Y7654537             |
      | 123456789123         |
      | 101400079900037      |
      | 10355612355007       |
      | surabhimehta@yesbank |
      | csadana@yahoo.co.in  |

  @Regression
  Scenario: Search with MDM ID and if that MDM ID is not present in CUST ID column then "No Results Found" message should be displayed
    Then I wait for 2 sec
    And I enter "127145" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'No Customer Found.' message is displayed
    And I wait for 2 sec

  @Regression @Smoke
  Scenario Outline: Refine search message option when threshold 50 exceeded
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then 'Too many matching customers found. Please refine your search criterion.' message is displayed due to threshold exceeded
    And I wait for 2 sec
    Examples:
      | Parameter |
      | Ayush     |

  @Regression @Smoke
  Scenario Outline: Search data with refine parameter and lower and upper case both
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    Then Search result is displayed with all fields in search UI screen
    And I wait for 2 sec
    Examples:
      | Parameter           |
      | Ayush + 11-APR-1981 |
      | ayush + 11-apr-1981 |
      | aYUSh + Delhi       |
      | ayush + delhi       |
      | Ayush + 2019        |

  @Regression
  Scenario Outline: When user enters parameter in search field it should intelligently highlight the label with bubble
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then Accordingly respective "<Result>" gets highlighted in static search parameter under search bar
    And I wait for 2 sec
    Examples:
      | Parameter           | Result      |
      | AXEPD7154N          | PAN         |
      | Y7654537            | Passport    |
      | 123456789123        | Aadhar      |
      | Ayush               | Cust Name   |
      | @tomer31twitter     | Twitter ID  |
      | 9184821250          | Mobile No.  |
      | 181400001300037     | Account No. |
      | 12355612355006      | CKYC No.    |
      | anupamgupta@yesbank | UPI Handle  |

  @Regression
  Scenario Outline: Format of Search label below search bar
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    Then I wait for 2 sec
    And I verify search label display like 'Search result for "<Result1>": "<Result2>" "<Result3>": "<Result4>" Results'
    And I wait for 2 sec
    Examples:
      | Parameter     | Result1 | Result2 | Result3    | Result4 |
      | Ayush + delhi | Ayush   | delhi   | Cust Name: | City:   |

  @Regression
  Scenario: For single record after search & user is authorized to view, SNAP page is opened directly
    And I wait for 2 sec
    Then I enter "996264849" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//div[contains(@class,'_1_5k62AIvTivhOaavf2P7e forWeb')]"
    And I wait for 2 sec
    Then I lands to SNAP page directly
    And I wait for 2 sec


