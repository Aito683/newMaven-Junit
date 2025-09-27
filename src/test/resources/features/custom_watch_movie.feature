Feature: Custom watch movie feature
  This feature allows a client to select an existing  movie from the list.
  The goal is to play the movie if it is in the list of available movies.
  Scenario: Custom watch movie scenario
    Given the user has a valid subscription to the app
    And the user is logged into their account
    When the user navigates to the page with the movie list
    And the user selects a movie by name
    Then the movie starts to play
    And the system tracks the movie as "currently watching"