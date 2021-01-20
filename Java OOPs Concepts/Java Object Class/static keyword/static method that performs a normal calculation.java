package objectandclass;
/**
 *
 * @author Durjoy
 */ 
//Java Program to demonstrate the use of static variable
class Calculate{
    
    static int cube(int x){
        return (x*x*x);
    }
}
  
public class ObjectAndClass {
    public static void main(String[] args) { 
            
        int res = Calculate.cube(5);
        System.out.println(res);
    }
    
}
