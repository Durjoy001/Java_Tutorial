package objectandclass;
/**
 *
 * @author Durjoy
 */ 
//Java Program to demonstrate the use of static variable
class Student{//don't make this class public else you have to make the file
    //name Student.java
    
    int id;
    String name;
    static String college = "SUST";
    
    //static method to change the value of static variable  
     static void change(){  
     college = "SWE";  
     }
    
     //constructor to initialize the variable  
     Student(int r, String n){  
     id = r;  
     name = n;  
     }  
     
     //method to display values  
     void display(){System.out.println(id+" "+name+" "+college);}  
    
}
  
public class ObjectAndClass {
    public static void main(String[] args) { 
            
            Student.change();//calling change method  
            //A static method can be invoked without the need for creating an object of a class.
            
            //creating objects  
            Student s1 = new Student(111,"Karan");  
            Student s2 = new Student(222,"Aryan");  
            Student s3 = new Student(333,"Sonoo");  
            //calling display method  
            s1.display();  
            s2.display();  
            s3.display();       
    }
    
}
