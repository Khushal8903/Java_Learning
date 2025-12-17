/*
5. Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/
import java.util.*;
public class ArrayMissingNumb{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n-1);
	for(int i=0 ; i<n-1 ; i++){
	   a[i] = sc.nextInt();
	}
	int sum=0;
	int total =(n*(n+1))/2;
	
	for(int i=0 ; i<a.length; i++){
		sum = sum+a[i];
	}
	int num = total - sum;
	System.out.print("Missing number is:" + num);
	
}}