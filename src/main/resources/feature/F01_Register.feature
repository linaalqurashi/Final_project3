@smoke
  Feature: F01_Register: user could register with new accounts
    Scenario Outline: guest user could register with valid data successfully
      Given user go to register page
      When user choose gender
      And user enters first name"Lina" last name "Abdelaziz"
      And user selscts date of birth
      And user enters email field"<round>"
      And user fills pasword fields
      And user clicks on register button
      Then success message is displayed
      Examples:
        |round  |
      |1      |




