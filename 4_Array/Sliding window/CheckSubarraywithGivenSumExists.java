//Check if Subarray with Given Sum Exists
//For a given sum, check if there’s a subarray with that sum using sliding window.
import java.util.*;
public class CheckSubarraywithGivenSumExists{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements:");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for( int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		
		System.out.println("Enter target:");
		int target=sc.nextInt();
		int k=2;
		int sum=0;
		
		  for(int i=0; i<n; i++)
        {
            sum += a[i];
            if(i >= k)     
                sum -= a[i-k];
            if(i >= k-1&&sum== target)
                System.out.printf("[ %d,%d ]\t", a[i-k+1], a[i]);
			}}
}