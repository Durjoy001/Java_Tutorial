package objectandclass;
/**
 *
 * @author Durjoy
 */  
interface printable{  
   void print();  
}  
class A6 implements printable{  
    @Override
    public void print(){System.out.println("Hello");}  
    
}
public class ObjectAndClass{
    public static void main(String[] args) { 
       A6 obj = new A6();  
       obj.print();  
    }
}
