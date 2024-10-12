Feature: Dashboard Page

  Background: Login Orangehrm
    Given User Log in with User admin to OrangeHrm Dashboard

  @Test
  Scenario: Test Redirect Assign Leave via Quick Launch
    When User click Quick Launch Assign Leave
    Then User redirects to Assign Leave Page

  @Test
  Scenario: Test Redirect Leave List via Quick Launch
    When User click Quick Launch Leave List
    Then User redirects to Leave List Page