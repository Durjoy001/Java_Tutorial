### [Inheritance in Java](https://www.javatpoint.com/inheritance-in-java)   
**Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.**  

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.   

**Inheritance represents the IS-A relationship which is also known as a parent-child relationship.**   

Why use inheritance in java:  
* **For Method Overriding (so runtime polymorphism can be achieved).**  
* **For Code Reusability.**   

**Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.**  
**Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.**  

The **extends keyword** indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.  

### Types of inheritance in java:   
**On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.**  

**In java programming, multiple and hybrid inheritance is supported through interface only.
Multiple inheritance is not supported in Java through class. (When one class inherits multiple classes, it is known as multiple inheritance.)**   

#### :boom:Single Inheritance:   
**When a class inherits another class, it is known as a single inheritance.** In the example, Dog class inherits the Animal class, so there is the single inheritance.   

#### :boom:Multilevel Inheritance:   
**When there is a chain of inheritance, it is known as multilevel inheritance.** As in the example, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.  

#### :boom:Hierarchical Inheritance:  
**When two or more classes inherits a single class, it is known as hierarchical inheritance.** In the example, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.  

### Why multiple inheritance is not supported in java?  
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.   

**Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class. whether there are same method or different, there will be compile time error.**   






