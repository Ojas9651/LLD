**Strategy Design Pattern**



Definition :



Defines a family of Algorithm, put them into separate classes so that they can be changed at run time.



\-----------------------------------------



Why this was needed, lets see with the help of below example -



Note : Strategy design will prove like inheritance is a very bad thing.



Example :



class Robot {



&#x09;walk(){}

&#x09;talk(){}

&#x09;projection(); // how a robot will look like

}



class CompanionRobot extends Robot{

&#x09;

&#x09;projection(){

&#x09;

&#x09;}

}



class WorkerRobot extends Robot{

&#x09;

&#x09;projection(){



&#x09;}

}



class SparrowRobot extends Robot{

&#x09;

&#x09;fly(){

&#x09;

&#x09;}



&#x09;projection(){

&#x09;

&#x09;}

}



class CrowRobot extends Robot{

&#x09;

&#x09;fly(){

&#x09;

&#x09;}



&#x09;projection(){

&#x09;

&#x09;}

}



Note : We are writing fly() again and again and that breaks DRY principle.



If we write fly() in Robot. So, if any class will call fly , all will fly even if which are not supposed to.



Solution :



class Flyable() extends Robot{

&#x09;

&#x09;fly(){

&#x09;

&#x09;}

}



class SparrowRobot extends Flyable 





Now if another type of robots like (fly with jet, not walkable etc) are introduced then we again need to change the inheritance hierarchy or we need to make new classes.



So, the solution to solve inheritance is not more inheritance.



\--------------------



Problems with Inheritance :



Code reuse

2\. To add new feature a lot of changes are required.

3\. Breaking OCP



\--------------------



Solution : Strategy Design Pattern



Definition :



Defines a family of Algorithm, put them into separate classes so that they can be changed at run time.





Main Rule -> Separate the part that was not changing from the one which was changing.



In Robot example -



walk() , talk() , fly()  --  changing



projection() -- not changing



\----------------



class Robot{

&#x09;

&#x09;projection(); // abstract method

}



interface Talkable{

&#x09;

&#x09;talk();

}



interface Walkable{

&#x09;

&#x09;walk();

}



interface Flyable{

&#x09;

&#x09;fly();

}



\---------------------



Now make concrete classes of these interfaces



class NormalTalk implements Talkable{

&#x09;

&#x09;talk(){

&#x09;

&#x09;}

}



class NoTalk implements Talkable{

&#x09;

&#x09;talk(){

&#x09;

&#x09;}

}



class NormalWalk implements Walkable{

&#x09;

&#x09;walk(){

&#x09;

&#x09;}

}



class NoWalk implements Walkable{

&#x09;

&#x09;walk(){

&#x09;

&#x09;}

}



class NormalFly implements Flyable{

&#x09;

&#x09;fly(){

&#x09;

&#x09;}

}



class NoFly implements Walkable{

&#x09;

&#x09;fly(){

&#x09;

&#x09;}

}



\---------------------



Now we only need to keep a (has-a) relationship or composition relationship with the Talk, Walk and Fly.





class Robot{



&#x09;Talkable talk;

&#x09;Walkable walk;

&#x09;Flyable fly;



&#x09;projection();

}



\----------------------------



In this example Robot class is using the interfaces so it is Client.



The Interfaces we make are strategies.



\-----------------------------------------------------



Now Explaining the Definition -



\-> Define a family of algorithm 



We make Talkable, Walkable, Flyable and put them into different interface or classes



\-> So that they can be changed at runtime



No at runtime we can decode which properties the robot will have of talkable , walkable or flyable



\------------------------------------------------------





**Examples -**



PlaymentSystem has Strategies -> UPI, Card, Netbanking











