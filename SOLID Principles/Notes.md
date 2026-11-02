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













