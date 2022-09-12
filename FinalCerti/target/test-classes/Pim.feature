Feature: Pim OrangeHRM
  Background: User login into OrangeHRM page
    Given Im in OrangeHRM web page

    @ignore@LogOutNecessary
    Scenario: Search employee by ID
      Given I set the user name and the password field with
        |Admin|admin123|
      When I click on login button
      And Search new employee with ID "0011"
      Then I click on search button
      And I check the existence

    @ignore@LogOutNecessary
    Scenario: Search employee by Name
      Given I set the user name and the password field with
        |Admin|admin123|
      When I click on login button
      And Search new employee with NAME "John Smith"
      Then I click on search button
      And I check the existence by name

    @LogOutNecessary@ignore
    Scenario: Delete employee
      Given I set the user name and the password field with
        |Admin|admin123|
      When I click on login button
      And I click on add employee
      Then I fill the employee information with
        |Nicolas|Andres|Arnez|
      Then I click on save button
      Then I click on Employee List button
      And Search new employee with NAME "Nicolas Andres Arnez"
      Then I click on search button
      Then I click on delete icon
      Then I confirm delete
      And I reset the name text box with ""
      And I click on search button
      And Verify delete

    @ignore@LogOutNecessary
    Scenario: Add employee
      Given I set the user name and the password field with
        |Admin|admin123|
      When I click on login button
      And I click on add employee
      Then I fill the employee information with
        |Nicolas|Andres|Arnez|
      Then I click on save button
      Then I click on Employee List button
      And Search new employee with NAME "Nicolas Andres Arnez"
      Then I click on search button
      And Verify creation
