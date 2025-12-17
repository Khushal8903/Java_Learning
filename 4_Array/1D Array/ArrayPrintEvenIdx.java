/*
Q11. Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
Explanation: Even indices → 0, 2, 4 → elements 4, 7, 6.
*/
import java.util.*;
public class ArrayPrintEvenIdx{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the length of the Array:");
	int n= sc.nextInt();
	System.out.printf("Enter the %d Value of Array:",n);
	int a[] = new int[n];
	for(int i=0; i<n ; i++){ 
	 a[i] = sc.nextInt();
	}
	
	System.out.print("Even Indices Value:");
	for(int i=0; i<n ; i++){
		if(i%2==0){
			System.out.print(a[i]);
	     
	   }
	}
	}
	}
	