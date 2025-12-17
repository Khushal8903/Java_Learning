/*
1. Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2 1  -3   4   -1  2  1   -5  4]  
Output: 6.  (from subarray [4,-1,2,1])
*/

import java.util.*;
public class MaxSumOfSubArray{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Size of Array:");
	int n = sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:", n);
	for(int i=0; i<n; i++){
	  a[i] = sc.nextInt();
	}
	
	
	int  max=0 ;
	for(int i=0;i<a.length;i++){
		int sum=0;
		for(int j=i; j<a.length ; j++){ 
		 sum = sum+a[j];
		
		
		if(sum>max){
		    max =sum;
		}
		}
	}
	System.out.print("Max sum of subArray:"+max);
	}
}