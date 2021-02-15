package objectandclass;
/**
 *
 * @author Durjoy
 */  
abstract class Bike{
    abstract void run();//there is no method body , for this reason
    //we use abstract keyword.if we don't use abstract keyword then
    //there have to method body in run method.
}


public class ObjectAndClass extends Bike{
    @Override
    void run(){
        System.out.println("Running.....");
    }
    public static void main(String[] args) { 
        ObjectAndClass obj = new ObjectAndClass();
        obj.run();
    }
}
