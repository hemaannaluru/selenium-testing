Feature: working on web application

  Scenario Outline: dezlearn.com
    Given user is in dezlearn.com
    When user gets the url and title
    Then user works on alert
    And user capture screenshot and close the window
