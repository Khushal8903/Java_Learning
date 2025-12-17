/*
3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import java.util.*;
public class CountPairofDiffk{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	
	for(int i=0 ; i<a.length; i++){
	   for(int j=0; j<a.length;j++){
		   int num = Math.abs(a[i]-a[j]);
		   if(num==2){
				System.out.print("("+a[i]+","+a[j]+")");
		   }
	   } 
	}
	
	}
}