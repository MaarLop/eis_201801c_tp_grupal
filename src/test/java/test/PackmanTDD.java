package test;

import gradle.cucumber.Biscuit;
import gradle.cucumber.Packman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
