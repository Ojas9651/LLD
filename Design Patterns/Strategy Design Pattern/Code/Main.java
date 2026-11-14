package Code;

class Main{
    public static void main(String[] args){
        Robot flyingRobot = new CompanionRobot(new NormalTalk(),
                                    new NormalWalk(),
                                    new NormalFly()    
                                );
        flyingRobot.fly();
        flyingRobot.walk();
        flyingRobot.talk();
    }
}