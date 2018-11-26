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
    When I click on element having class "buttonRipple"
    Then I enter "9927217421" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details

#  @Smoke
#  Scenario: Search static parameter
#    Then I wait for 2 sec
#    And Search bar contains static search parameters

  @Regression
  Scenario: Search with wrong MDM ID
    Then I enter "83760" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then No search result should be displayed

  Scenario: Validate tool tip message on cust id by selecting checkbox
    Then I wait for 2 sec
    When I click on element having xpath "(//input[@type='checkbox'])[1]"
    Then I should get the tool tip with message

  Scenario: Search with custID
    Then I wait for 2 sec
    When I click on element having xpath "(//input[@type='checkbox'])[1]"
    Then I enter "9927217421" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details

  Scenario: Search with wrong custID
    When I click on element having xpath "(//input[@type='checkbox'])[1]"
    Then I enter "838191" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then No search result should be displayed

  Scenario Outline: Search with different parameters with CUSTID
    Then I wait for 2 sec
    When I click on element having xpath "(//input[@type='checkbox'])[1]"
    Then I enter "<Parameter>" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    Then I wait for 2 sec
    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
    Then I wait for 2 sec
    Then I get Search result in tabular format with all details
    Examples:
      | Parameter       |
      | customer kumar3 |
      | 9927217421      |
      | 838237          |
      | AAHXX7830X      |
      | Y7654539        |
      | customer40@yesbank |
      | 223355567741       |

#  Scenario Outline: Refine search message option when threshold exceeded
#    Then I wait for 2 sec
#    When I click on element having xpath "(//input[@type='checkbox'])[1]"
#    Then I enter "<Parameter>" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
#    Then I wait for 2 sec
#    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
#    Then I wait for 2 sec
#    Then Message should come for search refinement due to threshold exceeded
#    Examples:
#      | Parameter       |
#      | Manisha |
#      | Vibhu   |

#  Scenario Outline: Search with refine search
#    Then I wait for 2 sec
#    When I click on element having xpath "(//input[@type='checkbox'])[1]"
#    Then I enter "chandan" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
#    Then I wait for 2 sec
#    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
#    Then Message should come for search refinement due to threshold exceeded
#    Then I wait for 2 sec
#    Then I click on element having xpath "//img[@class="_2v8jDvYep4VKSCVzkEmiR2"]"
#    Then I wait for 2 sec
#    Then I enter "<Parameter>" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
#    Then I wait for 2 sec
#    When I click on element having xpath "//span[@class='_2v8jDvYep4VKSCVzkEmiR2 _1_5k62AIvTivhOaavf2P7e forWeb']"
#    Then I wait for 2 sec
#    Then I get Search result in tabular format with all details
#    Then I scroll to end of page
#    Examples:
#      | Parameter       |
#      | chandan + 08/09/2018 |
#      | Chandan + Lucknow    |
#      | Chandan + 28/03/1980 |

  Scenario Outline: Search should intelligently highlight typed parameter
    Then I wait for 2 sec
    When I click on element having xpath "(//input[@type='checkbox'])[1]"
    Then I enter "<Parameter>" into input field having class "_1GAtZAgoj0RN5y2WYQ-IKL"
    And Accordingly particular "<Parameter1>" gets highlighted
  Examples:
  | Parameter  | Parameter1 |
  | AUGXX7978X | PAN        |
  | H7890987   | Passport   |
  | Bhuvana    | Cust Name  |

  @Regression
  Scenario: Close browser
    Then I close browser

