package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Student{//don't make this class public else you have to make the file
    //name Student.java
    int id;
    String name;
    int age;
    
    //creating two arg constructor  
    Student(int i,String s){
        id =i;
        name = s;
    }
    //creating three arg constructor  
    Student(int i,String s,int a){
        id = i;
        name = s;
        age = a;
    }
    //method to display the values  
    void display(){System.out.println(id+" "+name+" "+age);}
}
  
public class ObjectAndClass {
    public static void main(String[] args) {
            //creating objects and passing values  
            Student s1 = new Student(11111,"Karan");  
            Student s2 = new Student(22222,"Aryan",25);  
            
            //s1.Student(111,"fds"); we can't do this, it's not a method
            
           //calling method to display the values of object  
            s1.display();  
            s2.display();  
    }
    
}
