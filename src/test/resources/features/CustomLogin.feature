#Task: Create a Custom Cucumber Feature File
#Objective: In this task, you will create a custom Cucumber feature file that represents a login scenario. You have the creative freedom to define the feature and scenario details.
#Instructions:
#1.Feature Description:
#Create a feature file with any name you choose (e.g., "custom_login.feature").
#Utilize the
#Feature
# keyword to craft a unique feature description.
#2.Scenario Description:
#Create a scenario with a unique name (e.g., "Custom login scenario").
#Use the
#Scenario
# keyword to define this scenario.
#
#3.Given Steps:
#
#Add at least two "Given" steps. You can create your own context or prerequisites that make sense in the context of your scenario.
#
#4.When Step:
#
#Include a "When" step that signifies a specific action or event that should occur in your scenario.
#
#5.Then Steps:
#
#Add at least two "Then" steps. These steps should describe the expected outcomes or results that should follow your scenario's "When" step.
#
#6.Task Completion:
#
#Ensure that your feature file accurately represents your custom login scenario with the specified steps.
#
#Save the feature file in your project's "src/test/resources" or equivalent directory.

  Feature: Custom Login Feature
    This feature tests a custom login process for a fictional application.
    The goal is to ensure users can log in successfully when valid credentials are provided
    and receive an error message when credentials are invalid.

    Scenario: Custom login Scenario
      Given the user is on the login page
      And the user has a valid account with username "testUser" and password "pass123"
      When the user enters their username and password and clicks the login button
      Then the user should be redirected to the dashboard
      And the welcome message "Welcome, testUser!" should be displayed