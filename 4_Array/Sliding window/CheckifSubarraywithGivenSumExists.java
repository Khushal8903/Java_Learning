//Check if Subarray with Given Sum Exists
//For a given sum, check if there’s a subarray with that sum using sliding window.
import java.util.*;
public class CheckifSubarraywithGivenSumExists{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array:");
	int size = sc.nextInt();
	System.out.print("Enter the Value of Array:");
	int a[] = new int[size];
	for(int i=0 ; i<a.length ; i++){
			a[i] = sc.nextInt();
	}
	
	System.out.print("Enter the sum:");
	int sum1 = sc.nextInt();
	
	int k = 3, sum=0;
	boolean b= false;
	for(int i=0 ; i<a.length ; i++){
		
		if(i<k){
			sum = sum+a[i];
		}else{
			sum = sum - a[i-k]+a[i];
		}
		
		if(sum1 == sum ){
			b = true;
		}
		
	
	}
	if(b){
			System.out.print("Found");
		}else{
			System.out.print("Not Found");
		}
	}
}