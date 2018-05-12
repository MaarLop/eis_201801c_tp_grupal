package gradle.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class PackmanDef {
    private Packman packman;
    private Biscuit biscuit;
    private Ghost ghost;
    private Fruit fruit;

    @Given("^A new packman")
    public void a_new_packman() {
        packman = new Packman();

    }

    @When("^Packman eats a biscuits$")
    public void packman_eats_a_biscuits() {
        biscuit = new Biscuit();
        packman.eat(biscuit);
    }


    @Then("^Its points are (\\d+)$")
    public void its_points_are(int point) {
        Object actual = packman.getPoints();
        Object expected = point;

        assertThat(actual).isEqualTo(expected);
    }

    @When("^Packman collides with a ghost")
    public void packman_collides_with_a_ghost() {
        ghost = new Ghost();
        packman.collides(ghost);
    }

    @Then("^Its dies$")
    public void its_dies() {
        assert packman.die();
    }

    @When("^Packman eats a fruit$")
    public void packman_eats_a_fruit() {
        fruit = new Fruit();
        packman.eat(fruit);
    }




}
