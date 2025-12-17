/*
Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
public class ArrayInsertion{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n-1 ; i++){
	   a[i] = sc.nextInt();
	}
	System.out.print("Enter the Index of the Array:");
	int idx = sc.nextInt();
	System.out.print("Enter the Value of the Index:");
	int val = sc.nextInt();
	
/*	
	int arr[] = new int[n+1];
	
	for(int i=0; i<idx; i++){
		arr[i] = a[i];
	}
	arr[idx]=val;
	for(int i=idx; i<n; i++){
		arr[i+1] = a[i];
	}
	for(int i=0; i<arr.length;i++){
		System.out.print(arr[i]);
	}
*/

	for(int i=a.length-2 ;i>=idx ; i--){
		a[i+1] = a[i];
	} 
	a[idx] = val;
	
	for(int i=0; i<a.length;i++){
		System.out.print(a[i]);
	}
	}
}