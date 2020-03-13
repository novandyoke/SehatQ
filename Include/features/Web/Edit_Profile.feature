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
Feature: Login feature
  As a user, I want to login to https://www.sehatq.com/

  @Valid
  Scenario Outline: Login with a valid credential
    Given I navigate to homepage sehatq
    When I click Login button and Click Continue with Email
    And I enter email <email> and password <password>
    And I click Log in button
    Then I should be able to login successfully

    Examples: 
      | name  | email                   | password |
      | name1 | novandy_347@yahoo.co.id | No191190 |

  Scenario Outline: Edit Profile
    When I click Image profile and click profile
    And I click detail and click edit
    And I edit nama_lengkap <name> tanggal_lahir <Tgl_lahir> tinggi badan <tinggi_badan> berat <berat> and alamat <alamat>
    Then I click Simpan button

    Examples: 
      | name  | Tgl_lahir  | tinggi_badan | berat | alamat      |
      | name1 | 08-08-1992 |          181 |   120 | Edit Alamat |
