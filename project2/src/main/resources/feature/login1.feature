Feature: working on login window

  Scenario Outline: newtours application
    Given user is in newtours application
    When user needs to enter <uname> and <password>
    Then user click on  button
    And user navigated to home page

    Examples: 
      | uname   | password   |
      | mercury | mercury123 |
