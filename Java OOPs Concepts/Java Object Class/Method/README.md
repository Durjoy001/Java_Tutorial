### [Method in Java](https://www.javatpoint.com/method-in-java)   
It is used to achieve the **reusability** of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the **easy modification and readability** of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.   

Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:   

**Public:** The method is **accessible by all classes** when we use public specifier in our application.     
**Private:** When we use a private access specifier, the method is **accessible only in the classes in which it is defined.**    
**Protected:** When we use protected access specifier, the method is **accessible within the same package or subclasses in a different package.**     
**Default:** When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is **visible only from the same package only.**   

### Static Method  
A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method.  
**The main advantage of a static method is that we can call it without creating an object.** It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.   

### Instance Method
The method of the class is known as an instance method. It is a **non-static method** defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class. Let's see an example of an instance method.  

### Abstract Method
The method that does not has method body is known as abstract method. In other words, without an implementation is known as abstract method. It always declares in the abstract class. It means the class itself must be abstract if it has abstract method. To create an abstract method, we use the keyword abstract.   

### Factory method   
It is a method that returns an object to the class to which it belongs. All static methods are factory methods.   
