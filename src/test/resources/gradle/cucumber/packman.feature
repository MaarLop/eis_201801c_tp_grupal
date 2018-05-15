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
          When Pacman collides with a ghost weakened
          Then The pacman does not die
          And The ghost loses its body

        Scenario: A pacman collides with ghost without body
          Given A new packman
          When Pacman collides with a ghost without body
          Then The pacman does not die

        Scenario: A packman eats a pellet and every ghosts get weaknes
           Given A new packman
           When Packman eats a pellet and there are 10 ghost in the play
           Then Every one of the ghosts get weaknes