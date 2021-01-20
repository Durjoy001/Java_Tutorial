### [Java static keyword](https://www.javatpoint.com/static-keyword-in-java)    
**The static keyword in Java is used for memory management mainly.** We can apply static keyword with variables, methods, blocks and nested classes.   

### Java static variable:  
**If we declare any variable as static, it is known as a static variable.**   
* The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.  
* **Advantages of static variable : It makes your program memory efficient (i.e., it saves memory). Static variable will get the memory only once.**      
 
### Java static method:   
If you apply static keyword with any method, it is known as static method.  
* A static method belongs to the class rather than the object of a class.  
* A static method can be invoked without the need for creating an instance/object of a class.  
* A static method can access static data member and can change the value of it.  

**Restrictions for the static method:**   
* The static method can not use non static data member or call non-static method directly.  
* this and super cannot be used in static context.  

### Why is the Java main method static?  
It is because the object is not required to call a static method. If it were a non-static method, JVM creates an object first then call main() method that will lead the problem of extra memory allocation.    




