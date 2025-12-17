/*
______________________________________________________
1. Longest Subarray With Sum ≤ K
Description:
Given an integer list nums and integer k, return the maximum length of a contiguous subarray whose sum is ≤ k.
Example:
Input: nums=[2,3,1,2,4], k=7
Output: 3
Explanation: [3,1,2] has sum 6 ≤ 7.
*/
import java.util.*;
public class LongestSubarrayWithSumK{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data:");
		ArrayList <Integer>al = new ArrayList<>();
		
		for(int i=0 ; i<5 ; i++){
			al.add(sc.nextInt());
		}
		int k=7,sum=0;
		int maxcnt=0, cnt=0,s=0;
		for(int i=0 ; i<al.size();i++){
		
			sum = sum+al.get(i);
			
			if(sum<=k){
				cnt++;
				if(cnt>maxcnt){
					maxcnt=cnt;
				}
				

			}else{
				sum = sum - al.get(s++);
				
			}
				
				
			}
			
			System.out.println(maxcnt);
		
		
	}
}
