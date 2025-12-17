//Write a program to find the product of digits of a given number using recursion.
import java.util.*;
public class productOfDigit{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int p=1;
	System.out.print(digitProduct(n , p));
	
	
	}
	public static int digitProduct(int n , int p){
		if(n==0){
			return p;
		}
		p=p*(n%10);
		return digitProduct(n/10 , p);
		
			
	}
}
