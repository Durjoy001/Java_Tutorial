package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Animal{  
    String color="white";  
}  
class Dog extends Animal{
    String color="black";  
    void printColor(){  
        System.out.println(color);//prints color of Dog class  
        System.out.println(super.color);//prints color of Animal class  
    }  
}
//Test class to create objects and call the methods 
public class ObjectAndClass{ 
    public static void main(String[] args) { 
       Dog d = new Dog();
       d.printColor();
    }
}
