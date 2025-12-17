/*
2. Merge Intervals
Description:
Given a list of intervals, merge all overlapping intervals and return the merged list sorted by starting time.
Example:
Input: [[1,3],[2,6],[8,10]]
Output: [[1,6],[8,10]]
*/
import java.util.*;
public class MergeIntervals{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<int[]> ar1 = new ArrayList<>();
		
		for(int i=0 ;i <3;i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			ar1.add(new int[]{start , end});
		}
		
		ArrayList<int []> ar2 = new ArrayList<>();
		
		int [] a = new int[2];
		int [] b = new int[2];
		
	ar2.add(ar1.get(0));
		for(int i=1; i<ar1.size() ;i++){
			
			
			a = (int [])ar2.get(ar2.size()-1);
			b = (int [])ar1.get(i);
			
			if(a[1] >= b[0] ){
				a[1]=b[1];
				
			}else {
				ar2.add(b);
			}
		}
		
		for(int[] i : ar2){
			
		System.out.println(i[0] +"  " +i[1]);
		}
	}
}

