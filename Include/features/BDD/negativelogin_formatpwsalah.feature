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
Feature: Testing Login - wrong format Password
  I want to use this for testing login with wrong format password


  Scenario Outline: Test negative wrong format password
    Given I am open url
    When I input valid <email>
    And I fill the wrong format <password>
    Then I click submit and see alert wrong format passsword

    Examples: 
      |email|password|
      |qa.rakamin.jubelio@gmail.com|p|