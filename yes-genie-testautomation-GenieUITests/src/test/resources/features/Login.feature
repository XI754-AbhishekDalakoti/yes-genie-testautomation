Feature: Login
  As a user I should able to login into my Genie

  Background: User is on Genie Page
    Given I navigate to url "https://cust360.yesgenie.com:31390"

  @Regression
  Scenario Outline: Login button should be disabled if both credentials are not entered
    When User enters "<Username>" and "<Password>"
    And I click on Login
    Then The button should be disabled
    Examples:
      | Username | Password |
      |          |          |
      | UIAutomationDND  |          |
      |          | UIAutomation  |

  @Regression
  Scenario: User should not be able to login with invalid credentails
    Then I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "uiautomationdnd" into input field having id "password"
    When I click on Login
    Then I should get error message

  @Regression @logout
  Scenario: User should be able to login when User ID is case insensitive
    Then I wait for 2 sec
    And I enter "uiautomationdnd" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    When I click on Login
    Then I should get logged-in with welcome message

  @Regression @Smoke @logout
  Scenario: I login with valid credential with welcome message
    Then I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    And I click on Login
    Then I should get logged-in with welcome message

  @Smoke @Regression @logout
  Scenario: Validate Last Login date time format and basic information is displayed
    Then I wait for 2 sec
    And I enter "UIAutomationDND" into input field having id "username"
    And I enter "UIAutomation" into input field having id "password"
    And I click on Login
    Then I wait for 2 sec
    Then I validate Last Login date and time format displayed on bottom right of the page
    And I wait for 2 sec
    And I click on dropdown on top right of page
    Then I validate basic information is displayed on top right
