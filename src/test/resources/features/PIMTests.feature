Feature: PIM Page

  Background: Login Orangehrm
    Given User Log in with User admin to OrangeHrm Dashboard
    Then User navigates to PIM Page

  @Test
  Scenario: Test Add New Employee without Login Details
    When User navigates to the Add Employee page
    And User adds in the employee details form with valid information
    Then Confirmation message Successfully added is displayed

  @Test
  Scenario: Test Add New Employee with Login Details
    When User navigates to the Add Employee page
    And User adds in the employee details form with Login Details
    Then Confirmation message Successfully added is displayed