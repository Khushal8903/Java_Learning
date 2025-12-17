/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage()
Logic: Use sum ÷ total elements.
*/
import java.util.*;
public class ArrayAverage{
	static Scanner sc = new Scanner(System.in);
	int a[] ;
	public static void main(String x[]){
			
		ArrayAverage aa = new ArrayAverage();
		aa.inputArray();
		double res = aa.findAverage(aa.a);
		
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
	
	double findAverage(int ...arr){
		int sum = 0 ; 
		for(int i=0 ; i<arr.length ; i++){
			sum = sum+arr[i];
		}
		return (double)sum/arr.length;
	}
	
} 
