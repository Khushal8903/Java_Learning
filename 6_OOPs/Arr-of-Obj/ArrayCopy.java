/*
Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/
import java.util.*;
public class ArrayCopy{
	int a[];
	public static void main(String x[]){
	
	ArrayCopy ac = new ArrayCopy();
	ac.inputArray();
	int copyArray[] = ac.copyArray(ac.a);
		for(int i=0 ; i<copyArray.length ; i++){
			System.out.print(copyArray[i] + " ");
		}
	
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
	
	
	int[] copyArray(int ...arr){
		int arr1[] = new int[arr.length];
		
		for(int i=0 ; i<arr.length ; i++){
			arr1[i] = arr[i];
		}
		return arr1;
		
	}
}