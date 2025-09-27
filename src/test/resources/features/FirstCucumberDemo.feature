# gherkin has it's specific syntax that we need to follow
  #hashtag is a comment
  #first keyword in a feature should be Feature:
  #Feature: is a title of this Feature file
  ##a Feature is like on test class
  #one feature file will consist of all tests cases related to one particular function

Feature: Deposit Tests
  #we also have an ability to add more explanation about this feature file
  #Here we would write the extra details about the feature
  #Here we would write the extra details about the feature
  #Here we would write the extra details about the feature

  #Scenario: is like 1 test case
  Scenario:  we give scenario name here
    Given Bank account 1 exists with $1000 balance
    #Given - is used to define pre-conditional steps
    #Given sentence should be in past tense
    When Bank account 1 deposits $100 dollars
    #When - is used to define action steps. This is where we actually call
  ##the functionality that we are testing
  Then Bank account 1 should have $1100 dollars in balance
    #then - is used for validations/assertions

