/*
Q10. Write a Java program to find all unique triplets in the array whose sum is zero using the two 
pointer technique. 
 
  Example: 
   Input: arr = [-1, 0, 1, 2, -1, -4]   
   Output: [[-1, -1, 2], [-1, 0, 1]]
*/
import java.util.*;
public class Q10{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[]={-1, 0, 1, 2, -1, -4};
	int k=3;
	int start =0 , end = k;
	
	while(end<a.length-1){
		int sum=0;
			for(int i=start ; i<end ; i++){
				sum = sum+a[i];
			}
				
			if(sum==0){
					System.out.print("[" + a[start] +","+ a[start+1] + "," + a[end-1]+"]");	
				}
				
			
			
		start++;
		end++;
	}
	}
}