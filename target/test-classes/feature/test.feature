@featuretag
Feature: Gooogle Functionality

  @smoke @regression
  Scenario: Google Search Funtionality
    Given user should be navigated to the Google Search page
    When He enter any value in the Search Box
    And Click on Search Buttton
    Then Related results will be displayed

  @smoke @abc
  Scenario Outline: Write String in Google Search Textbox for background example
    Given user should be navigated to the Google Search page
    When He enter any value "<variable1>" in the Search Box
    And Click on Search Buttton
    Then Related results like "<varaible2>" and "<variable3>" will be displayed

    Examples: 
      | variable1 | varaible2 | varaible3 |
      | value1    | value2    | value3    |
      | value4    | value5    | value6    |

  @signup
  Scenario: Signup Functionality
    Given launch the broswer and navigate to elearning url
    Then user is on homepage and signup link should be displayed
    When user click on signup link
    Then user navigate to the Registration page
    And user enters all the mandatory information
    And user click on register
    Then user should be able to see the successful registration message
    When user clicks on profile dropdown
    Then user should be able to see to his registered email id
    When user click on homepage
    And user click on compose
    And user enters data for  send to
    And user enters data for subject
    And user enters message in message box
    And user clicks on send message button
    Then user should be able to see the acknowledgement
