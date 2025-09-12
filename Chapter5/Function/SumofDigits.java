/*
Sum of Digits


Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.


Example: Input 123 → Output: 6.


*/
import java.util.*;
public class SumofDigits{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input:");
	int t = sc.nextInt();
	int res = sumOfDigits(t);
	System.out.print("Sum is:"+ res);
	}
		public static int sumOfDigits(int a){
			int sum=0;
			while(a!=0){
				sum = sum+ a%10;
				a=a/10;
			}
			return sum;
		}
	
	}