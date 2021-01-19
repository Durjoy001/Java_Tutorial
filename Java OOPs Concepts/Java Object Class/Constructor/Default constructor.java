package objectandclass;
/**
 *
 * @author Durjoy
 */ 
class Bike {//don't make this class public else you have to make the file
    //name Bike.java
    
    //creating a default constructor  
    Bike(){
        System.out.println("Bike");
    }
}
  
public class ObjectAndClass {
    public static void main(String[] args) {
          //calling a default constructor
          Bike b = new Bike();//called constructor
          
         //b.Bike(); this is not method so in this way we will not able to call Bike
    }
    
}
