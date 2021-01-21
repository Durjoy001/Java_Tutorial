package objectandclass;
/**
 *
 * @author Durjoy
 */
public class ObjectAndClass {
    //field or data member or instance variable 
    int id;
    String name;
    //creating main method inside the class  
    
    public static void main(String[] args) {
        //Creating an object or instance  
        ObjectAndClass obj = new ObjectAndClass();
        
        //Printing values of the object  
        System.out.println(obj.id);//accessing member through reference variable  
        System.out.println(obj.name);
    }
    
}
