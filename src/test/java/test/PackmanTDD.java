package test;

import gradle.cucumber.Biscuit;
import gradle.cucumber.Ghost;
import gradle.cucumber.Packman;
import org.junit.Test;

import static org.junit.Assert.*;

public class PackmanTDD {

    @Test
    public void givenANewPackmanWhenIGetItsPointsItsReturnCero(){
        Packman newPackman= new Packman();

        assertEquals(0, newPackman.getPoints());

    }

    @Test
    public void givenANewPackmanWithsEatsABiscuitWhenIGetItsPointsItsRurnTen(){
        Packman newPackman= new Packman();
        Biscuit newBiscuit= new Biscuit();

        newPackman.eat(newBiscuit);

        assertEquals(10, newPackman.getPoints());

    }

    @Test
    public void PacmanHitsAWeakenedGhostAndIDoNotDie(){
        Packman newPackman= new Packman();
        Ghost newGhost= new Ghost();
        newGhost.weaken();
        newPackman.collides(newGhost);

        assertFalse(newPackman.isDie());
    }

    @Test
    public void PacmanHitsAWeakenedGhostAndTheGhostLosesItsBody(){
        Packman newPackman= new Packman();
        Ghost newGhost= new Ghost();
        newGhost.weaken();
        newPackman.collides(newGhost);

        assertFalse(newGhost.hasBody());
    }

    @Test
    public void PacmanHitsAGhostWithOutBodyAndIDoNotDie(){
        Packman newPackman= new Packman();
        Ghost newGhost= new Ghost();
        newGhost.takeOutBody();
        newPackman.collides(newGhost);

        assertFalse(newPackman.isDie());
    }


}
