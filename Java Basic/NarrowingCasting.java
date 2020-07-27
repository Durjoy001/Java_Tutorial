//Narrowing casting must be done manually by placing the type in parentheses in front of the value:

package tutorial;
/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
    double myDouble = 9.78;
    int myInt = (int) myDouble; // Manual casting: double to int

    System.out.println(myDouble);   // Outputs 9.78
    System.out.println(myInt);      // Outputs 9
    }
    
}
