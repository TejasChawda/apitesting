Feature: Ohayo gosaimas

  Scenario: greeting with ohayo gosaimas
    Given lands on homepage which greets the user with ohayo gosaimas
    When user enters "tej" and 1234
    Then homepage is populated
    And the greeting message is displayed