Feature: Chemical Reactions
  Scenario: Perform Chemical Reactions
    Given professor prepares to mix chemicals
    When the following chemical reactions are performed:
      | Chemical A | Chemical B | Chemical C | Chemical D |
      |------------|------------|------------|------------|
      | O2         | H2         | CH4        | H2O        |
      | HCl        | NaOH       | NaCl       | H2O + HCl  |
      | Na         | Cl2        | -          | NaCl       |
    Then result is obtained as the final product in each reaction
    And saved in the box to be carried out
