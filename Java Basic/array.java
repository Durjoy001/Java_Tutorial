package tutorial;

/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String[] cars = {"Volvo", "BMW","Ford","MAZDA"};
        String S = "abcdefghijklmnopqrstuvwxyz";
        
        System.out.println(S.length());
        
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        
        int[] myNum  = {10,20,30,40};
        
        int[] array = new int[100];
        
        array[0] = 100;
        System.out.println(array[0]);
        
        for(int i=0;i<myNum.length;i++)
        {
            System.out.println(myNum[i]);
        }
    }
    
}
