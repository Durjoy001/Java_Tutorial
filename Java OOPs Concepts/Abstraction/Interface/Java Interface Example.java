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
    public void print(){System.out.println("Hello");}  //have to add public keyword before void 
   //because in printable interface print method is public by default.
    
}
public class ObjectAndClass{
    public static void main(String[] args) { 
       A6 obj = new A6();  
       obj.print();  
    }
}
