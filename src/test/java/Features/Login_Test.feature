Feature: Login Test

  @loginTest
  Scenario Outline: Go to Trendyol and Login Test
    Given Navigate to Website
    And click Popup
    And click Sign in button
    And enter Email "<email>"
    And write Password "<password>"
    When click Submit button
    Examples:
      | email   | password   |
      | notstick61@gmail.com | Antimon.55 |


