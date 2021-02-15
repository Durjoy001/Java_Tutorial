package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Student{
    //private data member  
     private String name;
     //we can only access private data member from other class
     //by using get and set method.
    //getter method for name  
    public String getName(){  
        return name;  
    }  
   //setter method for name  
    public void setName(String name){  
        this.name=name;  
    }  
}
public class ObjectAndClass{
    public static void main(String[] args) { 
       Student s = new Student();
       s.setName("ABCD");
        System.out.println(s.getName());
    }
}
