package objectandclass;
/**
 *
 * @author Durjoy
 */ 
//Java Program to demonstrate the working of a banking-system  
//where we deposit and withdraw amount from our account.  
//Creating an Account class which has deposit() and withdraw() methods  

class Account {//don't make this class public else you have to make the file
    //name Account.java
    int acc_no;
    String name;
    float amount;
    
    void insert(int a,String n,float am){
        acc_no = a;
        name = n;
        amount = am;
    }
    //deposit method  
    void deposit(float am){
        amount = amount + am;
        System.out.println(am+" deposited");
    }
    //withdraw method  
    void withdrow(float am){
        if(amount<am){  
            System.out.println("Insufficient Balance");  
        }
        else{  
            amount=amount-am;  
            System.out.println(am+" withdrawn");  
        }  
    }
    //method to check the balance of the account  
    void checkBalance(){System.out.println("Balance is: "+amount);}  
    //method to display the values of an object  
    void display(){System.out.println(acc_no+" "+name+" "+amount);}
}
  
public class ObjectAndClass {
    
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.insert(832345,"Ankit",1000);  
        a1.display();  
        a1.checkBalance();  
        a1.deposit(40000);  
        a1.checkBalance();  
        a1.withdrow(15000);  
        a1.checkBalance();     
    }
}
