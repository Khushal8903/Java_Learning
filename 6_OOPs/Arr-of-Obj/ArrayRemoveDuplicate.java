/*
Q13. Remove Duplicate Elements from Array
Class: ArrayRemoveDuplicate
Functions:
void inputArray(int arr[])
int[] removeDuplicate()
Logic: Use nested loop, copy only unique elements to new array.
*/
import java.util.*;
public class ArrayRemoveDuplicate{
	int a[];
	public static void main(String x[]){
	
	ArrayRemoveDuplicate ard = new ArrayRemoveDuplicate();
	ard.inputArray();
	int []arr1 = ard.removeDuplicate(ard.a);
	for(int i=0 ; i<arr1.length ;i++){
		if(arr1[i] != -1)
		System.out.print(arr1[i]+ " ");
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
		
	int[] removeDuplicate(int ...arr){
		
		for(int i=0; i<a.length-1;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]==a[j]&&a[j]!=-1){
				a[j]=-1;
			}
		}
	
	}
	
	}
		return arr;
	}
}