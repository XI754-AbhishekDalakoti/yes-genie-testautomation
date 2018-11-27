Feature: Search or Landing Page
  As a user I should able to login into my app

  Background: User has logged in to Genie
    Given I navigate to "http://yesgenie.com:30978/"

  @Regression
  Scenario: Search with MDM ID
    When I get the page title and decide the starting page
    Then I wait for 2 sec
    And I enter "admin" into input field having id "username"
    And I enter "test" into input field having id "password"
    Then I click on Login
    Then I enter "9927217421" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details

  @Smoke
  Scenario: Ensure static parameter under search bar is there
    Then I wait for 2 sec
    And Under search bar contains static search parameters

  @Regression
  Scenario: Search with wrong MDM ID
    Then I enter "83760" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then No search result should be displayed

  Scenario Outline: Search with different parameters with MDMID
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details
    Examples:
      | Parameter |
      | 838197    |
      | customer7 |

  Scenario Outline: Refine search message option when threshold exceeded
    Then I wait for 2 sec
    And I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    And I click on search button having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then Message should come for search refinement due to threshold exceeded
    Examples:
      | Parameter    |
      | Vibhu        |
      | 223355567736 |

  Scenario Outline: Search data with refine parameter
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on search button having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details
    Examples:
      | Parameter          |
      | Ayush + 02/01/2003 |

  Scenario Outline: When user enters parameter in search field it should intelligently highlight the label with bubble
    Then I wait for 2 sec
    Then I enter "<Parameter>" into search field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And Accordingly respective "<Parameter1>" gets highlighted
    Examples:
      | Parameter  | Parameter1 |
      | AUGXX7978X | PAN        |
      | H7890987   | Passport   |
      | Bhuvana    | Cust Name  |

  @Regression
  Scenario: Close browser
    Then I close browser


