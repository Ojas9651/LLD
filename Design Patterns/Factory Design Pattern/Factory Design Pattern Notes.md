**Factory Design Pattern**



Definition :




**What is real world factory ?**



A place from which a objects or product is made.



**In programming :**



A class from which we get the object is called a factory.



**---------------------------------------------------**



**Separate business login from object creation logic.**



**Because putting them together can make code difficult to read and understand.**



**---------------------------------------------------**



**Client ----** ask factory for object **----> Factory**



Client should not know how the objects are creating , just it should get the object when it needs.



Client should be decoupled from object creation logic.



\----------------------------------------------------



Factory Types :



1. Simple Factory -> Not a design pattern 
2. Factory Method -> Proper Design pattern
3. Abstract Factory Method -> Proper Design pattern



1. Simple Factory ->



Definition :



A simple factory decides which concrete class to instantiate.



abstract class Burger {



&#x09;prepare();
}



class BasicBurger extends Burger{

&#x09;

&#x09;prepare(){}

}



class StandardBurger extends Burger{



&#x09;prepare(){}

{



class PremiumBurger extends Burger{



&#x09;prepare(){}

}



Now we need a factory that will create a burger :



class BurgerFactory{



&#x09;Burger createBurger(type){



&#x09;}

}



\-----------------------------------------------------



2\. Factory Method



Definition :



Defines an interface for creating Objects but allows subclasses to decide which class to instantiate.



\--------------------



Again go to the example of Burger.



Now let says, we have different factories which prepare the all burgers or we have 3 different factories for preparing different burgers.



abstract BurgerFactory{



&#x09;createBurger();

}



Factory 1 : only create Basic and Standard Burgers



class BurgerFactory1 extends BurgerFactory{



&#x09;createBurger(){}

}



Factory 2 : only create Premium Burgers



class BurgerFactory2 extends BurgerFactory{



&#x09;createBurger(){}

}



\------------------------------------------------------



3\. Abstract Factory Method



Definition :



Provides an interface for creating families of related Objects without specifying their concrete classes.



Now let say the concrete factories can make different products.



abstract class Burger{



}



abstract class GarlicBread{



}



//Concrete classes for above two classes



abstract class Factory{



&#x09;createBurger();

&#x09;createGarlicBread();



}



Factory1 extends Factory{



}



Factory extends Factory{



}



\------------------------------------------------------



Practical Example where Factory Design Pattern is Implemented :



Notification System



SMS

Push

Email



Factory that decides which notification to send.



Notification System --- String type--> Factory



Factory Decides which notification to send



\------------------------------------------------------



