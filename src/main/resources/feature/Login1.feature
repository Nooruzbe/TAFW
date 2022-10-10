Feature: Login functionality

  Background: Land to Home Page
    Given Go to login page ""

    @Smoke
    Scenario: Positive Login with credentials
      Given Enter "nuta" in userName or Email input field
      And Enter "helloWord321!" in password input field
      When user click on login button
      Then user should successfully logged in

      @Smoke
      Scenario: Positive: creating user
        Given Enter "" in userName or Email input field
        And Enter "" in password input field
        When


