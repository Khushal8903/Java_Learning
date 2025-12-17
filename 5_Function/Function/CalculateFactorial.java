/*
Calculate Factorial


Write a function factorial(int n) that returns the factorial of a given number.


Call it from main() and display the factorial.
*/
import java.util.*;
public class CalculateFactorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input:");
	int p = sc.nextInt();
	int res = calFac(p);
	System.out.print("Factorial is:"+ res);
	}
		public static int calFac(int a){
			int f=1;
			while(a!=0){
				f = f*a;
				a--;
			}
			return f;
		}
	
	}