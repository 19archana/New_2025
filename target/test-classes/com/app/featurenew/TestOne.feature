Feature: Validation for scenario outline data

  @multipledata
  Scenario Outline: Validate login page
    Given launch url
    When Enter userone "<Username>"
    And Enter passone   "<Password>"
    Then Validate Homepage

    Examples: 
      | Username | Password |
      | archana  | asafd233 |
      | vishnu   | wafadg34 |
      | anirudh  | cvzdd3   |

  @asList
  Scenario: Validate invalid username and valid password
    When Enter the values for given form
      | archana        |         
      | Archana vishnu |         
      | Anirudh|
      
      @asMap
      Scenario: Validate invalid username and valid password
      When Enter the data for given form
      |Firstname|Archana|
      |Lastname|Vishnu|
