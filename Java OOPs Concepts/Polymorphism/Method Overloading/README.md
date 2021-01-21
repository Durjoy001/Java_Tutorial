### [Method Overloading](https://www.javatpoint.com/method-overloading-in-java)   
**If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.**  
Method overloading increases the readability of the program.     

There are two ways to overload the method in java  
* By changing number of arguments   
* By changing the data type of arguments   
 
**In Java, Method Overloading is not possible by changing the return type of the method only.**    

###  Why Method Overloading is not possible by changing the return type of method only?   
In java, method overloading is not possible by changing the return type of the method only because of ambiguity.
Because how can java determine which method should be called, if they have same name ,same number of argument and same argument type.   

### Can we overload java main() method?   
**Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only.**    

