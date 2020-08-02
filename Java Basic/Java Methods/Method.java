package tutorial;

/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    static void firstMethod() {
        
        System.out.println("I just got executed!");
    }
    
    static void secondMethod(String S,int Z){
        System.out.println(S+" "+Z);
    }
    
    static int thirdMethod(int Z)
    {
        return Z + 5;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        firstMethod();
        
        secondMethod("ABCD",100);
        secondMethod("EFGH",200);
        
        int X = thirdMethod(5);
        System.out.println(X);
        
        //When a parameter is passed to the method, it is called an argument. 
        //So, from the example above: S is a parameter,
        //while ABCD, EFGH are arguments.
        /*OUTPUT :
        I just got executed!
        ABCD 100
        EFGH 200
        10*/
    }
}
