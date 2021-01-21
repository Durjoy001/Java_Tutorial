package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}
public class ObjectAndClass {
    public static void main(String[] args) { 
      BabyDog d = new BabyDog();
      d.weep();
      d.eat();
      d.bark();
    }
}
