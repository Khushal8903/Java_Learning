//Number of Subarrays of Size K with Average Greater Than Threshold
//Count how many subarrays of size k have an average greater than a given threshold.
import java.util.*;
public class NumberofSubarraysofSizeKwithAverageGreaterThanThreshold{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int k=3, t=3, count=0,sum=0;
	for(int i=0 ; i<n ; i++){
		
		if(i<k){
		sum=sum+a[i];
		}else{
		sum = sum - a[i-k];
		sum = sum+a[i];
		}
		int avg=sum/k;
		if(avg>t){
			count++;
		}
	}
	
	System.out.print(count);
	}
}