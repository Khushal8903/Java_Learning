/*
Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/
import java.util.*;
public class ArrayDeletion{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	System.out.print("Enter the Index of the Array:");
	 int idx = sc.nextInt();
	
	
	for(int i=idx ; i<a.length-1;i++){
	    a[i] = a[i+1];
	}
	
	
	for(int i=0 ; i<a.length-1; i++){
		System.out.print(a[i]);
	}
	
	}
}