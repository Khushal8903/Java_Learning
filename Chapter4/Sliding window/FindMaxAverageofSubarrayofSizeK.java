//Find Max Average of Subarray of Size K
//Find the maximum average of any subarray of size k.
import java.util.*;
public class FindMaxAverageofSubarrayofSizeK{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	int k=3, t=3, max=0;
	
	for(int i=0 ; i<a.length-3  ; i++){
	 int sum=0;
		for(int j=i ; j<i+k ; j++){
			
			sum = sum + a[j];
			int avg = sum/k;
			if(avg>max){
				max =avg;
			}
			
		}
		
		
	}
	System.out.print(max);
	}
}