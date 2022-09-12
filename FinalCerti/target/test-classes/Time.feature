Feature: Time OrangeHRM
  Background: User login into OrangeHRM page
    Given Im in OrangeHRM web page

    @LogOutNecessary
    Scenario: View time sheet of the employee in time option
      Given I set the user name and the password field with
        |Admin|admin123|
      When I click on login button
      Then I click on time option
      And Select view from employee
      And The employee's time sheet should be displayed

