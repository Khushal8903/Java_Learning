/*
Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax(int arr[]) → display maximum element
int findMin(int arr[]) → display minimum element
Logic: Loop through array, compare each element, store max.
*/

import java.util.*;
public class ArrayMax{
	static Scanner sc = new Scanner(System.in);
	int a[] ;
	public static void main(String x[]){
			
		ArrayMax am = new ArrayMax();
		am.inputArray();
		int max = am.findMax(am.a);
		int min = am.findMin(am.a);
		System.out.print("Minimum number in Array: " + min + "\nMaximum number in Array: " + max);
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
	
	int findMax(int [] arr){
		int max = arr[0] ; 
		for(int i=0 ; i<arr.length ; i++){
				if(arr[i]>max){
					max = arr[i];
				}
		}
		return max;
	}
	
	int findMin(int []arr){
		int min = arr[0] ; 
			for(int i=0 ; i<arr.length ; i++){
					if(arr[i]<min){
						min = arr[i];
					}
			}
			return min;
	}
} 
