### [Method Overriding in Java](https://www.javatpoint.com/method-overriding-in-java)   
**If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.**   
In other words, If a subclass provides the **specific implementation** of the method that has been declared by one of its parent class, it is known as method overriding.   

Usage of Java Method Overriding:  
* Method overriding is **used to provide the specific implementation** of a method which is already provided by its superclass.  
* **Method overriding is used for runtime polymorphism.**  

Rules for Java Method Overriding:  
* **The method must have the same name as in the parent class method name.**    
* **The method must have the same parameter as in the parent class.**    
* **There must be an IS-A relationship (inheritance).**      

**Can we override static method?**   
No, a static method cannot be overridden. It can be proved by runtime polymorphism.   

**Why can we not override static method?**  
It is because the static method is bound with class whereas instance method is bound with an object. Static belongs to the class area, and an instance belongs to the heap area.    

**Can we override java main method?**  
No, because the main is a static method.     

**Method overloading is the example of compile time polymorphism. Method overriding is the example of run time polymorphism.**   



