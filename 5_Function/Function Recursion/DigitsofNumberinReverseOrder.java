// Write a program to print the digits of a number in reverse order using recursion.
import java.util.*;
public class DigitsofNumberinReverseOrder{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	
	 digOfNumberinRev(n);
	
	
	}
	public static int digOfNumberinRev(int a){
		if(a==0){
		 return 0;
		}
			System.out.print(a%10 +" ");
		return digOfNumberinRev(a/10);	
	}
}
