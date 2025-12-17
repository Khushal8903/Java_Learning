//Write a program to find the greatest common divisor (GCD) of two numbers using recursion.
import java.util.*;
public class calGCD{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the 1st No:");
	int n1 = sc.nextInt();
	System.out.print("Enter the 2nd No:");
	int n2 = sc.nextInt();

	int res = findGCD(n1 ,  n2); 
	System.out.print(res);
	
	}
	public static int findGCD(int a ,int b){
		
	
			if(b==0){
				return a;
			}
			return findGCD(b , a%b);
			
	}
} 