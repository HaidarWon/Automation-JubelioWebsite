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
Feature: Testing Login - Valid Email and Password
  I want to use this for testing valid login

  Scenario Outline: Test login valid
    Given I want to open URL
    When I fill valid <email> in email field
    And I fill valid <password> in password field
    Then I click button submit

    Examples: 
      |email|password|
      |qa.rakamin.jubelio@gmail.com|Jubelio123!|