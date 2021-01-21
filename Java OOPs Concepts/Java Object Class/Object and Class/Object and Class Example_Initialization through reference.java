package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Student {//don't make this class public else you have to make the file
    //name Student.java
    int id;
    String name;
}
  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        
        s1.id = 100;
        s1.name = "Durjoy";
        
        //Printing values of the object  
        System.out.println(s1.id); 
        System.out.println(s1.name);
    }
    
}
