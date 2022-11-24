Feature: Working on amazon page

  Scenario: web application
    Given an amazon page and opening amazon page
    When page is opened
    Then store into excel sheet
    And close the browser
