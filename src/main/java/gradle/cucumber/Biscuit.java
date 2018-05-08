package gradle.cucumber;

public class Biscuit implements Food {
    private int pointsOfIt;

    public Biscuit(){
        this.pointsOfIt= 10;
    }

    @Override
    public int getPointsOfIt() {
        return this.pointsOfIt;
    }
}
