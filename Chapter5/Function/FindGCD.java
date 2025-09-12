//Write a function to find the GCD (HCF) of two numbers.

import java.util.*;
public class FindGCD{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the two input:");
	int p = sc.nextInt();
	int q = sc.nextInt();
	int res = GCD(p , q);
	System.out.print("GCD is:"+res);
	}
		public static int GCD(int a , int b){
			while(b!=0){
				int temp = b;
				b=a%b;
				a = temp;
			}
			return a;
		}
	
	}