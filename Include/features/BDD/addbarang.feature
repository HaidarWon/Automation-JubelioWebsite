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
Feature: Testing add barang
  I want to use this for testing add barang


  Scenario: Testing feature add barang jubelio
    Given I want to open the url jubelio
    When I login to jubelio website
    Then I click dropdown barang
    And I click dropdown katalog
    Then I click dropdown in review
    And I click button tambah baru
    Then I add data barang
    And I save data
    