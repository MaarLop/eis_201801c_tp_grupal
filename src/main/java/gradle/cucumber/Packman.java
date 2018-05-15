package gradle.cucumber;

public class Packman {
    private  int points;
    private  Boolean isALive;

    public Packman (){
        this.points= 0;
        this.isALive=true;
    }

    public int getPoints() {
        return points;
    }

    public void eat(Food food) {
        this.points += food.getPointsOfIt();
    }

    public void collides(Ghost ghost) {

        if (ghost.hasBody() && !ghost.isWeakened()){
            this.isALive=false;
        }
        if(ghost.hasBody() && ghost.isWeakened()){
            ghost.takeOutBody();
        }

    }

    public Boolean isDie() {
        return !this.isALive;
    }
}
