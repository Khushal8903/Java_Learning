//Write a program to find the sum of first n natural numbers using recursion.
import java.util.*;
public class sumOfFirstNthNaturalNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int n = sc.nextInt();
	int b = sumOfNatural(n);
	System.out.print(b);
	
	}
	
	public static int sumOfNatural(int a){
		
		if(a==1){
			return 1;
		}
		
		return a+sumOfNatural(--a);
	}
}