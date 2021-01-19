package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Employee {//don't make this class public else you have to make the file
    //name Student.java
    int id;
    String name;
    float salary;
    void insert(int i,String n,float s){
        id = i;
        name = n;
        salary = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }
}
  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        //We can also create multiple objects and store information in it through reference variable.
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        
        E1.insert(111,"dj",10);
        E2.insert(222, "ddddj",100);
        
        E1.display();
        E2.display();
    }
    
}
