**4. Interface Segregation Principle**



**Definition :**



\--> Many client specific interfaces are better than one general purpose interface.



\--> Client should not forced to implement methods they don't need.



Example :



interface Shape{



&#x09;void area();

&#x09;void volume();

}





class Square implements Shape{



&#x09;void area(){}

&#x09;void volume(){} //not need

}



class Rectangle implements Shape{

&#x09;

&#x09;void area(){}

&#x09;void volume(){} // not need

}



class Cube implements Shape{



&#x09;void area(){}

&#x09;void volume(){}

}



We should make 2 interfaces one 2D shape and 3D shape



class 2DShape{



&#x09;void area(){}

}



class 3DShape{



&#x09;void area(){}

&#x09;void volume(){}

}



\------------------------------------------------------



**5. Dependency Inversion Principle**



Definition :



\--> High level modules should not depend on low level module but rather both should depend on abstraction.



High level Module : Deals with the business logic



Low level module : Module that directly interacts with the system like database , file system



Example :



You are making a application that interacts with Data Base directly



In this scenario :



Application --> High level module

Database --> Low level module





class Application{



&#x09;SQLDB sd;

&#x09;MongoDB md;



}



//Low level Modules that interact with Database



class MongoDB{

&#x09;

}



class SQLDB{



}



\------------------------------



**We should separate application and database with a interface**



**We should do like this :**



class Application{



&#x09;Persistence p; 

}



class Persistence extends Application{

&#x09;

&#x09;void save();

}



class MongoDB extends Persistence{

&#x09;

}



class SQLDB extends Persistence{



}



