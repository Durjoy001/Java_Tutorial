package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Student {//don't make this class public else you have to make the file
    //name Student.java
    int roll;
    String name;
    void insertRecord(int r,String s){
        roll = r;
        name = s;
    }
    void displayInfo(){
        System.out.println(roll+" "+name);
    }
}
  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        //We can also create multiple objects and store information in it through reference variable.
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.insertRecord(111,"dj");
        s2.insertRecord(222, "ddddj");
        
        s1.displayInfo();
        s2.displayInfo();
    }
    
}
