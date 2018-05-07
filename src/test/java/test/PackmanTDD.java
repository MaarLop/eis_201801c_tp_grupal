package test;

import gradle.cucumber.Packman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PackmanTDD {

    @Test
    public void givenANewPackmanweGetItsPointsAndItsReturnCero(){
        Packman newPackman= new Packman();

        assertEquals(0, newPackman.getPoints());

    }
}
