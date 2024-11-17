Feature: Dashboard Page

  Background: Login Orangehrm
    Given User Log in with User admin to OrangeHrm Dashboard

  @Test
  Scenario: Test Redirect Pending Review via My Actions
    When User click Pending Review on My Actions
    Then User redirects to My Review page

  @Test
  Scenario: Test Redirect Candidate to interview via My Actions
    When User click Candidate to interview on My Actions
    Then User redirects to Candidate Recruitment page

  @Test
  Scenario: Test Redirect Assign Leave via Quick Launch
    When User click Quick Launch Assign Leave
    Then User redirects to Assign Leave Page

  @Test
  Scenario: Test Redirect Leave List via Quick Launch
    When User click Quick Launch Leave List
    Then User redirects to Leave List Page

  @Test
  Scenario: Test Redirect Timesheet via Quick Launch
    When User click Quick Launch Timesheet
    Then User redirects to Timesheet Page

  @Test
  Scenario: Test Redirect Apply Leave via Quick Launch
    When User click Quick Launch Apply Leave
    Then User redirects to Apply Leave Page

  @Test
  Scenario: Test Redirect My Leave via Quick Launch
    When User click Quick Launch My Leave
    Then User redirects to My Leave Page

  @Test
  Scenario: Test Redirect My Timesheet via Quick Launch
    When User click Quick Launch My Timesheet
    Then User redirects to My Timesheet Page