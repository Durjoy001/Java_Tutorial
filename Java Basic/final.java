//However, you can add the final keyword if you don't want others (or yourself) to overwrite existing values 
//(this will declare the variable as "final" or "constant", which means unchangeable and read-only):
/*final int myNum = 15;
myNum = 20;  will generate an error: cannot assign a value to a final variable*/

package tutorial;
/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        final int X = 15;
        System.out.println(X);
    }
    
}
