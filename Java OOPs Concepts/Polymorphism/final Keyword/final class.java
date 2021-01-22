    final class Bike{
    
     }  
      
    class Honda1 extends Bike{  //can't be extends final class
          void run(){System.out.println("running safely with 100kmph");}  
        
      public static void main(String args[]){  
          Honda1 honda= new Honda1();  
          honda.run();  
        }  
    }  
    
    Output:Compile Time Error  
