package tutorial;

/**
 *
 * @author Durjoy
 */
public class Tutorial {
    
    static int plusMethod(int X,int Y)
    {
        return X+Y;
    }
    static int plusMethod(int X,int Y,int Z)
    {
        return X+Y+Z;
    }
    static double plusMethod(double X,double Y)
    {
        return X+Y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(plusMethod(5,5));
        System.out.println(plusMethod(5,5,5));
        System.out.println(plusMethod(5.5,5.5));
    }
}
