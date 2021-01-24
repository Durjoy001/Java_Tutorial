package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Bike{
     void run(){
        System.out.println("running...");
    }
}
class Splendor extends Bike{
    @Override
    void run(){
        System.out.println("runnig safely with 60km....");
    }
}
//Test class to create objects and call the methods 
public class ObjectAndClass extends Bike{ 
    public static void main(String[] args) { 
          Bike obj = new Splendor();//Upcasting
          obj.run();
    }
}
