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
      | admin    |          |
      |          | test     |

  Scenario: I login with invalid credential
    And I enter "admin" into input field having id "username"
    And I enter "secretpassword" into input field having id "password"
    Then I click on Login
    Then I should get error message

  @Regression
  Scenario: I login with valid credential with welcome message
    And I enter "admin" into input field having id "username"
    And I enter "test" into input field having id "password"
    Then I click on Login
    Then I should get logged-in with welcome message

  Scenario: Validate Last Login date time format and basic information is displayed
    Then I wait for 2 sec
    And Last Login date and time is displayed with basic info

  Scenario: I should get logged out of application
    And I wait for 2 sec
    Then I should get logout