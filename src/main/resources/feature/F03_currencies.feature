@smoke
  Feature: F03_currencies: user could change currency
    Scenario:user could change currency from dollar to euro
      Given user goes to homepage
      When user chooses euro currency
      Then euro symbol is shown for displayed product in homepage