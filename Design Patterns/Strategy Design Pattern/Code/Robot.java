package Code;

public abstract class Robot {

    private Talkable talk;
    private Walkable walk;
    private Flyable fly;
    
    public abstract void projection();

    public Robot(){
        
    }

    public Robot(Talkable talk, Walkable walk, Flyable fly){
        this.talk = talk;
        this.walk = walk;
        this.fly = fly;
    }

    public void talk(){
        talk.talk();
    }

    public void walk(){
        walk.walk();
    }

    public void fly(){
        fly.fly();
    }
}
