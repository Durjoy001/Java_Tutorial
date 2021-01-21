package objectandclass;
/**
 *
 * @author Durjoy
 */  
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
        obj.run();//calling method
    }
}
