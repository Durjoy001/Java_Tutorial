package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Calculation {//don't make this class public else you have to make the file
    //name Student.java
    void fact(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial is "+fact);
    }
}
  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        
        new Calculation().fact(5);//calling method with anonymous object 
    }
    
}
