Feature: Login
  As a user I should able to login into my Genie

  Background: User is on Genie Page
    Given I navigate to "http://yesgenie.com:30978/"

  @Regression @Smoke
  Scenario Outline: Login button is disabled if both credentials are not entered
    When User enters "<Username>" and "<Password>"
    And I click on Login
    Then The button should be disabled
    Examples:
      | Username | Password |
      |          |          |
      | panna    |          |
      |          | 123     |

  Scenario Outline: I login with invalid credential and also check case sensitivity of username and password
    Given I'm on login page
    When User enters "<Username>" and "<Password>"
    When I click on Login
    Then I should get error message
    Examples:
      | Username | Password |
      | admin    | secretpassword |
      | Panna    | 123           |
      | PANNA    | 123           |
      | panna    | test           |

  @Regression
  Scenario: I login with valid credential with welcome message
    Then I wait for 2 sec
    And I enter "panna" into input field having id "username"
    And I enter "123" into input field having id "password"
    And I click on Login
    Then I should get logged-in with welcome message

  Scenario: Validate Last Login date time format and basic information is displayed
    And I wait for 2 sec
    Then I validate Last Login date and time format displayed on bottom right of the page
    And I click on dropdown on top right of page
    Then I validate basic information is displayed on top right

  Scenario: I should get logged out of application
    And I wait for 2 sec
    Then I should get logout