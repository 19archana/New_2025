@smoke
Feature: validation for login page

  Background: 
    Given launch url

  @smoke_two
  Scenario: validate username and password
    When Enter username "archana1992"
    And Enter password "arch@1992"
    And click login button
    Then Navigate to next page

  @smoke_one
  Scenario: Invalidate username and password
    When Enter username "archu1992"
    And Enter password "arch1992"
    And click login button
    Then Navigate to next page

  @smoke_three
  Scenario: valid user and invalid password
    When Enter user "archan1921392"
    And Enter pass "arch199sas2"
    And click login button
    Then Navigate to next page
