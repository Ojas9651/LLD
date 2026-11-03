**November 2**



**SOLID Design Principles :**



**S : Single Responsibility Principle**

**O : Open Close Principle**

**L : Liskov Substitution Principle**

**I : Interface Segregation Principle**

**D : Dependency Inversion Principle**



**------------------------------------------------------**



**Problems that occurs if we do not follow or do not properly follow the SOLID Design principles.**





1. **Maintainability :**



**--> if we introduce new feature it should be easily introduces and new bugs should not be introduced**



**2. Readability :**



**--> Let say new engineers comes up to code and our application is so tightly coupled that it takes long time to read the code base**



**2. Bugs :**



**--> While righting code we introduce a lot of bugs and it takes long time to debug**



**------------------------------------------------------**



**Person who introduced the SOLID principles**



**A Computer Scientist in year 2000 published a paper**



**Robert C Martin**



**------------------------------------------------------**





1. **Single Responsibility Principle (SRP) :**



**Definition :**



\--> A class should have only one reason to change.

\--> A class should do only one thing.



**Example :**



Like a shopping cart should have only one responsibility to calculate the total price but not print Invoice or save the data as well.



\------------------------------------------------------



2\. **Open Close Principle**



**Definition :**



A class should be open for extension but close for modification.



**Example :**

If you want to add a new feature; do not change to any existing class.



Make that class abstract class or interface and implement the feature through inheritance and poly morphism.



Suppose, there is a class that save data to Sql.



But later you want to save to mongoDB.

So, make a interface as DB\_Persiatance and make two different classes for Sql and MongoDb that implements the DP\_Persiatance.



\------------------------------------------------------



**3. Liskov Substitution Principle**



**Definition :**



Subclasses should be substitutable for their base class or parent class.



Child should now narrow down the feature of parent but it can extend.



\------------------------------------------------------



**Guidelines :** 



1. **Signature Rule** 
2. **Property Rule**
3. **Method Rule**



Ques : What is a method signature ?

Ans : A method name , arguments and return type combined together is called method signature.



\-----------------------------------



Ques : What is broad and narrow class ?

Ans : Animal <- Dog (Dog is a Animal)



Dog is narrow class of Animal

Animal is broader class of Dog



\------------------------------------



Ques : What is signature rule ?



**Method Argument Rule :** 



\-> A child class should have the same method argument as Parent.



**Return Type Rule :** 



**->** A child class overridden methods can return the narrow return type than Parent method or same return type that of parent but cannot return the broader return type than parent.



\-> This is called covariance.



**Exception Rule :**



**->** A child class overridden method can throw the same exception that of parent class or can throw the narrow exception but cannot throw the broader exception that parent class method is throwing.



\------------------------------------



**Property Rule : Class Invariant and History Constraint**



1. **Class Invariant :**



**Invariant Meaning : A Rule that should always be true for a class.**



**Rule Meaning : A rule that we want a class should follow**



\--> A child class should always follow the invariant of the Parent class as it is or it should strengthen the invariant but should not weaken the invariant.



Example : 



class Account{

&#x09;



**//Balance should always be >= 0 --> Class Invariant**


&#x09;double balance; 

}



Now all child classes should follow Class Invariant





**2. History Constraint :**



\--> History should not change



**Example :**



class Account{

	private double balance;



**//Withdraw should always be allowed --> History Constraint**


&#x09;private double withdraw(){}
}



\--> A child class should not change immutability of the parent class method or property.



\------------------------------------------------------



**3. Method Rule :**



Pre-condition : 


A child class should either as it is follow the pre-condition of the method that you are overriding or it can weak the pre-condition but should not strengthen.



Example :



class Parent{


&#x09;//(num >= 0 \&\& num <= 5)



&#x09;void m1(int num){}

}



class Child{



&#x09;

&#x09;//(num >= 0 \&\& num <= 5) or

&#x09;//(num >=0 \&\& num <=10)



&#x09;void m1(int num){}

}





Post-Condition :



A child class should either as it is follow the post-condition of the method that you are overriding or it can strengthen the post-condition but should not weak.



Example :



class Car{



&#x09;void brake(){



&#x09;	sout("speed reduce by 20");

&#x09;}



&#x09;//Car should slow down

}



class electricCar extends Car{



&#x09;void brake(){



&#x09;	sout("speed reduce by 20");

&#x09;	

&#x09;	chargeBattery();

&#x09;}

}



Child class should always follow this slow down condition while applying brake.



\------------------------------------------------------



**Explanation LSP :**



Class A{



}



class B extends A{



}



Now, if there is a demand of the reference of A , we should be able to pass B in place of A.



Example :



Class Account {

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}



Class CurrentAccount extends Account{

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}



Class SavingsAccount extends Account{

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}





Class FixedAccount extends Account{

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}



Note : The FixedAccount account should not call withdraw but when client get the FixedAccount refrence in place of Account client will call the withdraw.



To Solve :



Make two classes :



class WithdrawableAccount{



&#x09;deposit(){}

&#x09;withdraw(){}

}



class NonWithdrawableAccount{



&#x09;deposit(){}



}





Class CurrentAccount extends WithdrawableAccount{

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}



Class SavingsAccount extends WithdrawableAccount{

&#x09;

&#x09;deposit(){}

&#x09;withdraw(){}

}





Class FixedAccount extends NonWithdrawableAccount{

&#x09;

&#x09;deposit(){}



}



\------------------------------------------------------

