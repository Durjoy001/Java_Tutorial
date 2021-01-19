package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Student{//don't make this class public else you have to make the file
    //name Student.java
    int id;
    String name;
    
    //creating a parameterized constructor  
    Student(int i,String s){
        id =i;
        name = s;
    }
    //method to display the values  
    void display(){System.out.println(id+" "+name);}
}
  
public class ObjectAndClass {
    public static void main(String[] args) {
            //creating objects and passing values  
            Student s1 = new Student(11111,"Karan");  
            Student s2 = new Student(22222,"Aryan");  
            
            //s1.Student(111,"fds"); we can't do this, it's not a method
            
           //calling method to display the values of object  
            s1.display();  
            s2.display();  
    }
    
}
