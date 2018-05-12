Feature: Packman game

  Scenario: New packman with no points
    Given A new packman
    Then Its points are 0

   Scenario: A packman eats a biscuit and get ten point
     Given A new packman
     When Packman eats a biscuits
     Then Its points are 10

     Scenario: A packman collides with a ghost and die
     Given A new packman
     When Packman collides with a ghost
     Then Its dies

     Scenario: A packman eats a fruit and get twenty point
          Given A new packman
          When Packman eats a fruit
          Then Its points are 20

Scenario: A pacman collides with weakened ghost
          Given A new packman
          When Packman collides with a ghost weakened
          Then the pacman does not die and the ghost loses its body