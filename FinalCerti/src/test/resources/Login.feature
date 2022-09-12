Feature: Login OrangeHRM
  Background: User login into OrangeHRM page
    Given Im in OrangeHRM web page

    @ignore
    Scenario Outline: Login into OrangeHRM page with invalid credentials
      Given I set the user name and the password field with
        |"<user>"|"<pwd>"|
      When I click on login button
      Then An error message that says "Invalid credentials" is displayed
      Examples:
        |user|pwd   |
        |admin|admin|
        |abc  |def  |


    @ignore@LogOutNecessary
      Scenario: Login into OrangeHRM page with valid credentials
        Given I set the user name and the password field with
          |Admin|admin123|
        When I click on login button
        Then The PIM page should be displayed

