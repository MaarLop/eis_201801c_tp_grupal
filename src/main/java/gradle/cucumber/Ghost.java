package gradle.cucumber;

public class Ghost {
    private Boolean hasBody;
    private Boolean isWeakened;
    public Ghost(){
        this.hasBody= true;
        this.isWeakened=false;
    }

    public Boolean hasBody() {
        return this.hasBody;
    }
    public Boolean isWeakened(){return  this.isWeakened;}
    public void noBody(){
        this.hasBody=false;
    }
    public void weaken(){
        this.isWeakened=true;
    }
}
