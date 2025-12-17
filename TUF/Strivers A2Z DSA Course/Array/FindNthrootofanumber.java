import java.util.*;
public class FindNthrootofanumber {
  public static void main(String []x){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number:");
    int n = sc.nextInt();
    System.out.println("Enter the value of N:");
    int m = sc.nextInt();
    int result = nthRoot(n,m);
    System.out.println("The "+m+"th Root of " + n + " is: " + result);
  }
    static int nthRoot(int n, int m){
    
     
    for(int i=1 ; i<=m/2 ; i++){
      int product=1;
      for(int j=1;j<=n ; j++){
        product = product*i; 
      }
       if(product==m){
      return i;
    }
    
    }
    return -1;
   
       
  }
}
