//Widening casting is done automatically when passing a smaller size type to a larger size type:

package tutorial;
/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    }
    
}
