package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Person{  
    int id;  
    String name;  
    Person(int id,String name){  
        this.id=id;  
        this.name=name;  
    }  
}  
class Emp extends Person{  
    float salary;  
    
    Emp(int id,String name,float salary){  
        super(id,name);//reusing parent constructor  
        this.salary=salary;  
    }
    void display(){System.out.println(id+" "+name+" "+salary);}  
}    
//Test class to create objects and call the methods 
public class ObjectAndClass{ 
    public static void main(String[] args) { 
       Emp e1=new Emp(1,"ankit",45000f);  
       e1.display();  
    }
}
