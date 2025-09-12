/*
  Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.
*/

import java.util.*;
public class Q1{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int n = sc.nextInt();
	
	int a=n ,b=n,count=0,sum=0,sum1=0;
	
		while(a!=0){
		sum=sum+ a%10;
		a=a/100;
		}
		System.out.println("Even place sum:" + sum);
		
		
		b=b/10;
		while(b!=0){
			sum1 = sum1+b%10;
			b = b/100;
		}
		System.out.println("Odd place sum:" + sum1);
	
		System.out.println("Difference:" + (sum - sum1));
	}
}