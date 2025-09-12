//Write a function to find the LCM of two numbers using HCF.

import java.util.*;
public class FindLCM{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the two input:");
	int p = sc.nextInt();
	int q = sc.nextInt();
	int res = GCD(p , q);
	int out = p*q/res;
	System.out.print("LCM is:"+out);
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