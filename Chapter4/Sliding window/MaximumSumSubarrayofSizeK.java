//Maximum Sum Subarray of Size K
//Find the maximum sum of a subarray with size k.
import java.util.*;
public class MaximumSumSubarrayofSizeK{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	
	int max = 0,k=2,sum=0;
	
	for(int i=0 ; i<n ; i++){
		
		sum = sum + a[i];
		if(i>=k){
			sum = sum-a[i-k];
		}
		if(sum>max){
			max = sum;

		}
		
	}
	System.out.print(max);
	
	}
}