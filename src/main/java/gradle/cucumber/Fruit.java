package gradle.cucumber;

public class Fruit  implements  Food{
    private int pointsOfIt;

    public Fruit(){
        this.pointsOfIt= 20;
    }

    @Override
    public int getPointsOfIt() {
        return this.pointsOfIt;
    }
}
