package objectandclass;
/**
 *
 * @author Durjoy
 */  
//In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation.
//The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding. 


//Creating a child class  
class Vehicle{
    void run(){System.out.println("Vehicle is running");} 
}
//Creating a child class  
public class ObjectAndClass extends Vehicle{ 
    //defining the same method as in the parent class  
    @Override
    void run(){//specific implementation of run() method
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) { 
    
        ObjectAndClass obj = new ObjectAndClass();//creating object  
        obj.run();//this is a non-static method so,we have to create object to call this
    }
}
