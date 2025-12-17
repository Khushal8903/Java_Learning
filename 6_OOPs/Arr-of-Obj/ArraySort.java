/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
Logic: Use Bubble Sort / Selection Sort.
*/
import java.util.*;
public class ArraySort{
	int a[];
	public static void main(String x[]){
	
	ArraySort as = new ArraySort();
	as.inputArray();
	as.sortArray(as.a);
		
	
	}
	
	
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr.length ; i++){
				arr[i] = sc.nextInt();
			}
			a  = arr;
		}
		
	void sortArray(int ...arr){
		for(int i=0 ; i<arr.length;i++){
			for(int j=0 ; j<arr.length-1 ; j++){
					if(arr[j] > arr[j+1]){
						int temp=arr[j] ; 
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
			}
		}
		
		for(int i=0 ; i<arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}