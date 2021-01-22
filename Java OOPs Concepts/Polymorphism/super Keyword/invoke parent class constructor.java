package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Animal{  
    Animal(){System.out.println("animal is created");}  
}  
class Dog extends Animal{  
    Dog(){  
        super();  
        System.out.println("dog is created");  
    }  
}  
//Test class to create objects and call the methods 
public class ObjectAndClass{ 
    public static void main(String[] args) { 
       Dog d = new Dog();
    }
}
