@wip
Feature: ruth US
  Agile History : As a user , I want to manage filters on the Marketing page.

  Background: Open login page
    When user open login page


  Scenario Outline: Store and sales managers should be able to unchecks any amount of boxes.
    Given user logged in as "<userType>" and "<password>"
    When user hovers over on marketing module.
    When user clicks on the Campaings option.
    When user clicks on the Icon filters.
    When user clicks on the Manage filters dropdown.
    Then user should be able to unchecks any amount of boxes.

    Examples:
    |userType|password|
    |   salesmanager101 |    UserUser123    |
    |   storemanager85  |    UserUser123    |