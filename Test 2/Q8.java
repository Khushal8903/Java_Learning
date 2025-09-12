/*
Q8. Write a Java program to find the maximum sum of any contiguous subarray of size k from a 
given array. 
Concept tested: Fixed-size sliding window for subarray sums. 
  
 Input: arr = [2, 1, 5, 1, 3, 2], k = 3 
 Output: 9 
 Explanation: Subarray [5,1,3] has the maximum sum = 9
*/
import java.util.*;
public class Q8{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a[]={2, 1, 5, 1, 3, 2};
	int k=3,sum=0,max=0,n=0;
	for(int i= 0 ; i<a.length ; i++){
		if(i<k){
		sum=sum+a[i];
		if(sum>max){
			max=sum;
			}
		}else{
			sum = sum+a[i]-a[i-k];
			if(sum>max){
			max=sum;
			n=i;
			}
		}
	}
	
	System.out.println(max);
	System.out.println("["+a[n-2]+ "," + a[n-1] + "," + a[n] +"]");
	
	}
} 