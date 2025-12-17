//calculate factorial
import java.util.*;
public class calFactorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	System.out.println(calFactorial(num));
	}
	
	public static int calFactorial(int n){
			int f=1;
		while(n!=0){
		
			f = f*n;
			n--;
		}
			 
		return f;
	}
}