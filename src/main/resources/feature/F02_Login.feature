@smoke
  Feature: F02_Login:user could use login functionality to use their account

    Scenario: user could login with valid email and password
      Given user go to login page
      When  user login with valid mail and password
      And user presses on login button
     Then user login to the system successfully


      Scenario: user couldn't login with invalid email ang password
        Given user go to login page
      When user login with invalid email and password
        And  user presses on login button
        Then user couldn't login to the system