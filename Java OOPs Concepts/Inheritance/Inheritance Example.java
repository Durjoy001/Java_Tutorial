package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Employee{
    float salary = 40000;
}
class Programmer extends Employee{
    int bonous = 10000;
}
public class ObjectAndClass {
    public static void main(String[] args) { 
        Programmer p = new Programmer();
        System.out.println("salary is "+ p.salary);
        System.out.println("bonus is" + p.bonous);
        // Programmer object can access the field of own class 
        //as well as of Employee class i.e. code reusability. 
    }
}
