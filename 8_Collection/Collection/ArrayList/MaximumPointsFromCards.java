/*
8. Maximum Points From Cards
Description:
Pick k elements from either end of list to maximize score.
Example:
Input: cards=[1,2,3,4,5,6,1], k=3
Output: 12
*/
import java.util.*;
public class MaximumPointsFromCards{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the data set:");
		int n=sc.nextInt();
		System.out.println("Enter the k:");
		int k=sc.nextInt();
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i=0;i<n;i++){
			ar.add(sc.nextInt());
		}
		int tSum=0;
		for(int i : ar){
			tSum+=i;
		}
		
		int p = n-k;
		int sum=0;
		for(int i=0 ; i<p; i++){
			sum +=ar.get(i);
		}
		
		System.out.println("Output :" + (tSum-sum));
	}
}