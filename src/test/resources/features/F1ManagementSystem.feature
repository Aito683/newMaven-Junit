Feature: Explore F1 Teams, Representatives, and Car Specifications

  Scenario Outline: View F1 Teams and Car Specifications
    Given the following F1 teams exist:
      | teamName         | principal         | leadDriver         |
      | <teamName>       | <principal>       | <leadDriver>       |
    And the following cars exist:
      | teamName         | chassis           | engine             | weight |
      | <teamName>       | <chassis>         | <engine>           | <weight> |
    When the user views the details for team "<teamName>"
    And the user views the car specifications for team "<teamName>"
    Then the user should see all teams and their representatives
    And the user should see all car specifications

    Examples:
      | teamName        | principal          | leadDriver       | chassis     | engine        | weight |
      | Mercedes        | Toto Wolff         | Lewis Hamilton  | W13         | Mercedes M13  | 798    |
      | Red Bull Racing | Christian Horner   | Max Verstappen  | RB18        | Honda RA621H | 790    |
      | Ferrari         | Mattia Binotto     | Charles Leclerc | SF21        | Ferrari 065  | 795    |
      | McLaren         | Andreas Seidl      | Lando Norris    | MCL35       | Mercedes M12  | 785    |