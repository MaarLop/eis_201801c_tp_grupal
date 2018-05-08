package gradle.cucumber;

public class Packman {
    private  int points;

    public Packman (){
        this.points= 0;
    }

    public int getPoints() {
        return points;
    }

    public void eat(Food food) {
        this.points += food.getPointsOfIt();
    }
}
