import java.util.*;

public class SqureRootOfNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int n = sc.nextInt();
    int result = squareRoot(n);
    System.out.println("The Square Root of " + n + " is: " + result);
  }
    static int squareRoot(int n){
   int root=0;

        for(int i=1 ; i<n/2;i++){
            int s = i*i;
            if(s==n){
                root= i;
                break;
            }
            else if(s>n){
                root=i-1;
                break;
            }

            }
            return root;
}
}