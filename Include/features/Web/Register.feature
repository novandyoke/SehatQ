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
Feature: Register feature
  As a user, I want to Register new Account

  @Valid
  Scenario Outline: Register new User
    Given I navigate to homepage sehatq
    When I click Login button and Click Continue with Email
    And I click New to SehatQ Sign up
    And I enter name <Nama_Lengkap> email <email> and password <password>
    And I check Aggrement
    And I click Log in button

    Examples: 
      | name  | Nama_Lengkap | email                   | password |
      | name1 | Novan        | ilottenovandy@gmail.com | No191190 |

