**UML Diagrams**



**Summary** : This tells how we describe the class , it's properties and behaviors and access modifiers and association and connection in the form of a diagram



\------------------------------------------------



\-> Express your idea in terms of Diagram , express the components and entities and how they will interact.



There are 2 types :



1. **Structural (static)** : 


-> What will be the components in our application and how they will be connected with each other. 



\-> It tells how the application will look.



\-> There are 7 Structural Diagrams





2\. **Behavioral (Dynamic)** : 



\-> Tells how the different components will interact with each other.



\-> There are 7 Structural Diagrams



We only need to study 2 and rest are use case specific.



\------------------------------------------------------



We need to study these two :



\--> **Class Diagram** : type of Structural diagram

\--> **Sequence Diagram** : type of Behavioral diagram



\------------------------------------------------------



**Class Diagram** :



What classes you application will have and how they will be connected.



Tell the class structure

Tell the association and connection.



Class Car {



&#x09;String brand;

&#x09;String model;

&#x09;int engineCC;



&#x09;startEngine();

&#x09;stopEngine();

&#x09;accelerate();

&#x09;brake();

}



if class is abstract : write <<abstract>> like below



&#x09;     <<abstract>>

\---------------------------------

|		Car		|

\---------------------------------

|	- brand : String	|

|	- model : String	|

|	- engineCC : int	|

\---------------------------------

|	+ startEngine() : void	|

|	+ stopEngine() : void	|

|	+ accelerate() : void	|

|	+ brake() : void	|

\---------------------------------



Public : +

Protected : #

Private : -



\----------------------------------------------



Access Modifier Scope :



Access Modifier	- within class - from child class -outside the class



Public 	-  yes 	-   yes -  yes

Protected - yes - yes - no

private - yes - no - no



\----------------------------------------------



Association :



When 2 classes are connected then we say they have the association or connection.



Types of Association :



\-> Class Association

\-> Object Association



\--> Class Association : Inheritance



\--> Object Association :

&#x09;	|\_\_\_\_\_\_> : Simple Association

&#x09;	|\_\_\_\_\_\_> : Aggregation Association

&#x09;	|\_\_\_\_\_\_> : Composition Association



&#x09;In program we say these 3 as composition.



\------------------------------------------



Inheritance : (is-a) relationship : closed arrow



Class Animal

&#x09;|\_\_\_\_> : Child Cow : is-a animal

&#x09;|\_\_\_\_> : Child Dog : is-a animal



\------------------------------------



Class Cow \_\_\_\_\_|> is a Class Animal



\------------------------------------------



Composition : (has-a) relationship



\-------------------------------------------



Simple Association : \_\_\_\_\_\_\_\_\_\_\_



Weakest form of interaction between 2 classes.



Example :



Class Arjun	\_\_\_\_\_\_\_\_\_>	Class House



We say Arjun has-a house : in real life (simple association)



To show simple association :



We Draw a open arrow : \_\_\_\_\_\_\_\_\_> : unidirectional



\-----------------------------------------------



Aggregation Association :



Two objects are more linked or associated than simple association



Example :



Class Room



Class Sofa 

Class Bed

Class Chair



In this there is a main object and in that there are small  objects.



To show Aggregation :



\_\_\_\_\_\_\_\_\_\_\_\_<> : not dotted line and diamond arrow



Class Sofa ------<> Class Room

Class Bed --------<> Class Room

Class Chair ------<> Class Room



In association the objects also may exists independently



\---------------------------------------------------



Composition Association :



Class Chair



Class ChairArms

Class ChairSeat

Class ChairWheels



A chair is made of the composition of different parts like arms, seat , wheels etc.



These classes cannot exists independently.



To show Composition :



\_\_\_\_\_\_\_\_\_\_\_\_\_<fill-the-arrow> : not dotted line and diamond arrow and arrow if filled





Class ChairArms -------<fill-the-arrow> Class Chair

Class ChairSeat -------<fill-the-arrow> Class Chair

Class ChairWheels -------<fill-the-arrow> Class Chair





\------------------------------------------------------



Show composition in class : all 3 types is shown as below in program



Class A{



&#x09;method1();

}



Class B{



&#x09;A a;



&#x09;public B(){

&#x09;	a = new A();

&#x09;}



&#x09;method2();

}



In Main :



B b = new B();

b.method2;



b.a.method1(); : to call method 1



\------------------------------------------------------

&#x09;	

Sequence Diagram





How to represent classes ?



\_\_

|A|   

\_\_





Lifeline -



&#x09;A		B		

&#x09;|		|

\_\_\_\_\_\_\_	|\_\_\_\_\_\_		|

|\_\_\_\_\_\_	|\_\_\_\_\_\_	|	|	

&#x09;|		|	

&#x09;|		|

&#x09;|		|

\-------------------------------------

&#x09;	

Activation Bar : mentioned as rectangle above



\------------------------------------------------------



Messages :



Synchronous : \_\_\_\_\_\_\_\_\_\_|> closed arrow

&#x09;      

<|---------- : response dotted line



wait for response





Asynchronous : \_\_\_\_\_\_\_\_\_\_>



No wait for response





Note : All the messages will be send till the activation bar is active.



\----------------------------------------------------





Create Message and Destroy Message :



When our application message runs many objects gets created and destroyed.



\-> When a object send a create message a new object is created.



\-> When a object send a destroy message a already existing object is destroyed.



\------------------------------------------------------



Lost Message :



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_> a encircled dot





Found Message :



encircled dot \_\_\_\_\_\_\_\_\_\_> found



\------------------------------------------------------



alt - if-else

option - if

loop



\------------------------------------------------------







