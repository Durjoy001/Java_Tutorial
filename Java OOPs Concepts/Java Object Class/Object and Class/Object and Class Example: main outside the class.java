package objectandclass;
/**
 *
 * @author Durjoy
 */
//Java Program to demonstrate having the main method in another class  
//Creating Student class.  

class Student {//don't make this class public else you have to make the file
    //name Student.java
    int id = 5;
    String name;
}

//Creating another class which contains the main method  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        
        Student s1 = new Student();
        
        //Printing values of the object  
        System.out.println(s1.id);//accessing member through reference variable  
        System.out.println(s1.name);
    }
    
}
