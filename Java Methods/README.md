# Method  
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.

Why use methods?
To reuse code: define the code once, and use it many times.

A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). 
Java provides some pre-defined methods, such as System.out.println(), 
but you can also create your own methods to perform certain actions.

Create a method inside MyClass:    

public class MyClass {  
  static void myMethod() {  
    // code to be executed  
  }  
}  

Example Explained  
    * myMethod() is the name of the method  
    * static means that the method belongs to the MyClass class and not an object of the MyClass class.  
    * void means that this method does not have a return value.  
   
# Parameters and Arguments  
Information can be passed to methods as parameter. Parameters act as variables inside the method.  
Parameters are specified after the method name, inside the parentheses.  
You can add as many parameters as you want, just separate them with a comma.      

# Return Values  
The void keyword, used in the examples above, indicates that the method should not return a value.   
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.)  
instead of void, and use the return keyword inside the method:    
  
# Method Overloading   
 * With method overloading, multiple methods can have the same name with different parameters:  
int myMethod(int x)  
float myMethod(float x)  
double myMethod(double x, double y)  
Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.  
