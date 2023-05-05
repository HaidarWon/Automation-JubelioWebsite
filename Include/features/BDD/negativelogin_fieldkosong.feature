#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: BDD - Cannot Login - Field null
  I want to use this for my negative login feature = Empty Field

  @tag1
  Scenario: Testing automation website jubelio-Login With Empty field
    Given I want navigate to jubelio login page
    When I check alert when username field not fill
    And I check alert when password field not fill
    Then I check Popup alert when username and password field in not fill