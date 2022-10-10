Feature: Create new user functionality

  Background: Land to Home page
    Given Go to login page

    @smoke
    Scenario: Positive: Create new user
      Given user should click Add user button
      And verify following field names are displayed
        | First name | Last name | Email address | Username | Password | Bio | User type | Time zone | Language |
      And enter following dat to create new user
        | firstName | lastName | emailAddress | userName | password |
        |