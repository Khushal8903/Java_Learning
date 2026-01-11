/*
7. Minimum Size Subarray Sum
Description:
Find minimal length of a subarray whose sum ≥ target.
Example:
Input: target=7, nums=[2,3,1,2,4,3]
Output: 2
*/

import java.util.*;
public class MinimumSizeSubarraySum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		System.out.println("Enter the size of the data set:");
		int n = sc.nextInt();
		System.out.println("Enter the Target:");
		int k = sc.nextInt();
		
		for(int i=0;i<n;i++){
			ar.add(sc.nextInt());
		}
		
		int sum=0;
		int a=0;
		
		ArrayList<Integer> l = new ArrayList<>();
		
		for(int i=0;i<ar.size() ; i++){
			
			sum=sum+ar.get(i);
			l.add(ar.get(i));
			
			if(sum>=k){
				sum=0;
				a=l.size();
				l.clear();
			}
		}
		System.out.println("OutPut: " + a);
		
	}
}