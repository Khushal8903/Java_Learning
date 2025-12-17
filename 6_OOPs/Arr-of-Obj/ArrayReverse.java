/*
Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray()
*/
import java.util.*;
public class ArrayReverse{
	int a[];
	public static void main(String x[]){
	
	ArrayReverse ar = new ArrayReverse();
	ar.inputArray();
	ar.reverseArray(ar.a);	
	
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
		
	void reverseArray(int ...arr){
		for(int i=arr.length-1 ; i>=0 ; i--){
			System.out.print(a[i] + " ");
		}
	}
}