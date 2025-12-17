/*
Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/

import java.util.*;
public class ArrayMerge{
	int a1[];
	int a2[];
	int a3[];
	public static void main(String x[]){
	
	ArrayMerge am = new ArrayMerge();
	am.inputArray();
	am.a3 = am.mergeArrays(am.a1 , am.a2);
	for(int i=0 ; i<am.a3.length ; i++){
		System.out.print(am.a3[i] + " ");
	}
	
	}
	
	
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of first  Array:");
		int n1 = sc.nextInt();
		int []arr1 = new int[n1];
		System.out.print("Enter the value of first Array:");
			for(int i = 0  ;  i<arr1.length ; i++){
				arr1[i] = sc.nextInt();
			}
			
		a1 = arr1;
			
		System.out.print("Enter the size of second  Array:");
		int n2 = sc.nextInt();
		int []arr2 = new int[n2];
		System.out.print("Enter the value of second Array:");
			for(int i = 0  ;  i<arr2.length ; i++){
				arr2[i] = sc.nextInt();
			}
		a2  = arr2;
		
	}
	
	int[] mergeArrays(int []arr1 , int []arr2){
			int num = arr1.length+arr2.length;
			int arr[] = new int[num];
			for(int i=0 ; i<arr1.length; i++){
				arr[i] = arr1[i];
				arr[i+arr1.length] = arr2[i];
			}
		return  arr;
	}

}
	