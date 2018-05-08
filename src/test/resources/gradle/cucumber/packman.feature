Feature: Packman game

  Scenario: New packman with no points
    Given A new packman
    Then Its points are 0

   Scenario: A packman eats a biscuit and get ten point
     Given A new packman
     When Packman eats a biscuits
     Then Its points are 10