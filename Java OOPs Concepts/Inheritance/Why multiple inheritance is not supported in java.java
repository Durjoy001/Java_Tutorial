package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class A{
    void msg(){
        System.out.println("Hello...");
    }
}
class B{
    void msg(){
        System.out.println("Welcome...");
    }
}
public class ObjectAndClass extends A,B{////suppose if it were 
    public static void main(String[] args) { 
      ObjectAndClass c = new ObjectAndClass();
      c.msg();////Now which msg() method would be invoked?  
      //whether there are same method or different, there will be compile time error.
    }
}
OUTPUT:   
Compile Time Error
