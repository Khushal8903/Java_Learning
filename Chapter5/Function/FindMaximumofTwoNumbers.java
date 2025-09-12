/*
Find Maximum of Two Numbers


Write a function findMax(int a, int b) that returns the maximum of two numbers.


Call this function in main() and print the result.
*/

import java.util.*;
public class FindMaximumofTwoNumbers{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the two input:");
	int p = sc.nextInt();
	int q = sc.nextInt();
	int res = maxTwo(p , q);
	System.out.print("MAx is:"+res);
	}
		public static int maxTwo(int a , int b){
			if(a>b){
				return a;
			}else{
				return b;
			}
			
		}
	
	}