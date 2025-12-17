/*
Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.
*/

import java.util.*;
public class ArraySum{
	static Scanner sc = new Scanner(System.in);
	int a[] ;
	public static void main(String x[]){
			
		ArraySum as = new ArraySum();
		as.inputArray();
		int res = as.calculateSum(as.a);
		
		System.out.print("Minimum number in Array: " + res );
	}
	
	void inputArray(){
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int [] arr1 = new int[n];
		System.out.print("Enter the value of the Array:");
		for(int i=0 ; i<arr1.length ; i++){
			arr1[i] = sc.nextInt();
		}
		
		a = arr1;
	}
	
	int calculateSum(int ...arr){
		int sum = 0 ; 
		for(int i=0 ; i<arr.length ; i++){
			sum = sum+arr[i];
		}
		return sum;
	}
	
} 
