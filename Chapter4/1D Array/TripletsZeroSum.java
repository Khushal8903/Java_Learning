/*
2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class TripletsZeroSum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array:");
	int n= sc.nextInt();
	
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0; i<n ; i++){
	 a[i] = sc.nextInt();
	}
	
	
	
	for(int i=0 ; i<a.length ; i++){
		
	    for(int j=i+1; j<=a.length-1;j++){
		  
			for(int k=j+1 ; k<=a.length-2;k++){
				if(a[i]+a[j]+a[k]==0){
					System.out.print("("+a[i] +","+a[j]+","+a[k]+")");
				}
			}
			 
			
		}
		
	}
	
	}
}