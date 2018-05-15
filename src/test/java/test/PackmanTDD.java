package test;

import gradle.cucumber.Biscuit;
import gradle.cucumber.Fruit;
import gradle.cucumber.Ghost;
import gradle.cucumber.Packman;
import org.junit.Test;

import static org.junit.Assert.*;

public class PackmanTDD {

    @Test
    public void givenANewPackmanWhenIGetItsPointsItsReturnZeroAndIthsAlive(){
        Packman newPackman= new Packman();

        assertEquals(0, newPackman.getPoints());
        assertFalse(newPackman.isDie());

    }

    @Test
    public void givenANewBiscuitWhenIGetItsPointsItsReturnTen(){
        Biscuit newBiscuit= new Biscuit();

        assertEquals(10, newBiscuit.getPointsOfIt());

    }

    @Test
    public void givenANewFruitWhenIGetItsPointsItsReturnTwenty(){
        Fruit newFruit= new Fruit();

        assertEquals(20, newFruit.getPointsOfIt());

    }

    @Test
    public void givenANewGhosthWeCanCheckThatIsNotWeack(){
        Ghost newGhost= new Ghost();

        assertFalse(newGhost.isWeakened());
    }

    @Test
    public void givenANewGhosthWeCanCheckThatIsWeack(){
        Ghost newGhost= new Ghost();
        newGhost.weaken();

        assert(newGhost.isWeakened());
    }

    @Test
    public void givenANewGhosthWeCanCheckThatItHasBody(){
        Ghost newGhost= new Ghost();

        assert(newGhost.hasBody());
    }

    @Test
    public void givenANewGhosthWeCanCheckThatItHasNotBody(){
        Ghost newGhost= new Ghost();
        newGhost.takeOutBody();

        assertFalse(newGhost.hasBody());
    }


}
