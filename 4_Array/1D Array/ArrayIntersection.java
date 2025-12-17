/*
7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/
import java.util.*;
public class ArrayIntersection{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the size of First Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of First Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	System.out.print("Enter the size of Second Array:");
	int n1 =sc.nextInt();
	int b[] = new int[n1];
	System.out.printf("Enter the %d value of Second Array:",n);
	for(int i=0 ; i<n1 ; i++){
	   b[i] = sc.nextInt();
	}
	
	for(int i=0 ; i<a.length ;i++){
		for(int j=0  ; j<b.length;j++){
		
			if(a[i] == b[j]){
			  System.out.print(a[i]+" " );
			}
		
		}
	
	}
}}