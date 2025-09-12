//Sliding Window Maximum (Optional Advanced)
//Return the maximum in every window of size k (can be skipped or bonus).

import java.util.*;
public class SlidingWindowMaximum{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	int k=3, max=0;
	
	for(int i=0 ; i<a.length-3  ; i++){
			max=0;
		for(int j=i ; j<i+k ; j++){
			if(max<a[j]){
				max = a[j];
			}
			
		}
		System.out.printf("Max In %d Sub Array:%d", a[i] , max);
		System.out.println();
	}
	}
}