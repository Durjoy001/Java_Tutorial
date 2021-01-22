package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Animal{  
    void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
    @Override
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");}  
    
    void work(){  
        super.eat();  //parent clas eat method
        bark();  
    }  
}  
//Test class to create objects and call the methods 
public class ObjectAndClass{ 
    public static void main(String[] args) { 
       Dog d = new Dog();
       d.work();
    }
}
