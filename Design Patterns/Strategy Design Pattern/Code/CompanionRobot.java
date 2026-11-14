package Code;

public class CompanionRobot extends Robot{
    
    public void projection(){
        System.out.println("This Robot looks like Doraemon");
    }

    public CompanionRobot(Talkable talk, Walkable walk, Flyable fly){
        super(talk, walk, fly);
    }
}
