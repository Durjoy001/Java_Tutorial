package objectandclass;
/**
 *
 * @author Durjoy
 */  
interface Printable{  
    void print();  
}  
interface Showable{  
    void show();  
}  
class A7 implements Printable,Showable{  
    @Override
    public void print(){System.out.println("Hello");}  
    @Override
    public void show(){System.out.println("Welcome");}  

}
public class ObjectAndClass{
    public static void main(String[] args) { 
       A7 obj = new A7();  
       obj.print();  
       obj.show();   
    }
}
