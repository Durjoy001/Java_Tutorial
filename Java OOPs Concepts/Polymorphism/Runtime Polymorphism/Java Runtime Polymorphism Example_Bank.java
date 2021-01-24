package objectandclass;
/**
 *
 * @author Durjoy
 */  
class Bank{
     float getRateOfInterest(){
         return 0;
     }
}
class SBI extends Bank{
    @Override
    float getRateOfInterest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    @Override
    float getRateOfInterest(){
        return 7.3f;
    }
}
class AXIS extends Bank{
    @Override
    float getRateOfInterest(){
        return 9.7f;
    }
}
//Test class to create objects and call the methods 
public class ObjectAndClass{ 
    public static void main(String[] args) { 
          Bank b;
          b = new SBI();
          System.out.println(b.getRateOfInterest());
          b = new ICICI();
          System.out.println(b.getRateOfInterest());
          b = new AXIS();
          System.out.println(b.getRateOfInterest());
    }
}
