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



**Explanation :**



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



Note : The FixedAccount account should not call withdraw but when client get the FixedAccount refrence in place of Accoutn client will call the withdraw.



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



















