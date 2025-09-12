
public class CompAssApp{
    public static void main(String x[]){
        int n = 5;
        n += 5; 
        System.out.println("After += : " + n);       //  10

        n -= 3; 
        System.out.println("After -= : " + n);      //  7

        n *= 2; 
        System.out.println("After *= : " + n);      // 14

        n /= 2;  
        System.out.println("After /= : " + n);      // 7

        n %= 5;  
        System.out.println("After %= : " + n);     //  2
    }
}
