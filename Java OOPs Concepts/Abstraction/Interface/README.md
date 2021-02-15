### [:boom: Interface in Java](https://www.javatpoint.com/interface-in-java)    
**An interface in Java is a blueprint of a class.**   

**The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.**   
In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.   

**Why use Java interface?**  
* It is used to achieve abstraction.  
* By interface, we can support the functionality of multiple inheritance.  
* It can be used to achieve loose coupling.   
 
**Interface fields are public, static and final by default, and the methods are public and abstract by default.**    

**A class extends another class, an interface extends another interface, but a class implements an interface.**    

**If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.**   

**Q) Multiple inheritance is not supported through class in java, but it is possible by an interface, why?**  
As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class.   

**Since Java 8, we can have method body in interface. But we need to make it default method.**     

**An interface can have another interface which is known as a nested interface.**   

