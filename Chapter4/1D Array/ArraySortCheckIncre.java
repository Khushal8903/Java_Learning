/*
4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.*;
public class ArraySortCheckIncre{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	boolean f = false;
    for(int i=1 ; i<a.length ; i++){
		
	  if(a[i]>=a[i-1]){
		  f =true;
	  }else{
		  f=false;
		  break;
	  }
	 
	}
	 String str = f?"True" : "False" ;
	  System.out.print(str);
}}