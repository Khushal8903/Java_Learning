/*
1. Two Sum (LC 1)
Description:
 Find indices of two numbers in an array that add up to a target.
Example:
 Input: [2,7,11,15], target = 9
 Output: [0,1]
Approach (HashMap):
Store number → index in a HashMap
For each element, check if target - num exists
Time: O(n)
*/
import java.util.*;

public class TwoSum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		HashMap<Integer , Integer> hmm = new HashMap<>();
		
		System.out.println("Enetr the size of the data set : ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target: ");
		int target = sc.nextInt();
		
		
		for(int i=0 ; i<arr.length ;i++){
			int num = target - arr[i];
			
			if(hmm.containsKey(num)){
				System.out.println(hmm.get(num)+","+ i);
				return;
			}
			
			hmm.put(arr[i] , i);
		}
		
	}
}