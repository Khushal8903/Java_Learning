/*
6. Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/
import java.util.*;
public class CountEvenOddEle{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n-1);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int even =0, odd =0;
	for(int i=0;i<a.length ;i++){
	  if(a[i]%2==0){
			even++;
	  }else{
	       odd++;
	  }
	  
	}
	System.out.print("Even:"+ even + "," + "Odd:"+ odd);
	
}}
