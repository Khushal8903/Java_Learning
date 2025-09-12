/*
Reverse a Number


Write a function reverseNumber(int n) that returns the reverse of a given number.


Example: Input 456 → Output: 654.


*/
import java.util.*;
public class reverseNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input:");
	int p = sc.nextInt();
	int res = reverseNumber(p);
	System.out.print("Reverse is:"+ res);
	}
		public static int reverseNumber(int a){
			int rev = 0;
			while(a!=0){
				rev = rev*10 + a%10;
				a=a/10;
			}
			return rev;
		}
	
	}