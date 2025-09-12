 //Sum of Two Numbers Equals Target
//Given a sorted array and a target, check if there are two numbers that sum up to the target.
import java.util.*;
public class CheckTarget{
	public static void main(String x[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++)
	{
	   a[i] = sc.nextInt();
	}
	
	System.out.printf("Enter the Target:");
	int Target = sc.nextInt();
	
	int start = 0 ;
	int end = a.length-1;
	
	while(start<=end)
	{
		if(a[start]+a[end]==Target){
			System.out.println(a[start] + "," + a[end]);
			start++;
			end--;
		}else if(a[start]+a[end] > Target){
			end--;
		}else{
			start++;
		}
	}
	}
}


