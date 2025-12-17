//Write a program to calculate the factorial of a given number using recursion.
import java.util.*;
public class calculateFactorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int n = sc.nextInt();
	int b = findFact(n);
	System.out.print(b);
	
	}
	
	public static int findFact(int a){
		int f=1;
		if(a==1){
			return 1;
		}
		
		return a*findFact(--a);
	}
}