    class Bike{  
          final void run(){System.out.println("running");}  
    }  
         
    class Honda extends Bike{  
           void run(){System.out.println("running safely with 100kmph");}//can't be override  
         
       public static void main(String args[]){  
           Honda honda= new Honda();  
           honda.run();  
       }  
    }  
    
    Output:Compile Time Error
