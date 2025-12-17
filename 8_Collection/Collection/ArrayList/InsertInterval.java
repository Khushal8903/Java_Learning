/*
3. Insert Interval
Description:
Insert a new interval into a sorted list of non-overlapping intervals and merge if required.
Example:
Input: intervals=[[1,3],[6,9]], newInterval=[2,5]
Output: [[1,5],[6,9]]
*/
import java.util.*;
public class InsertInterval{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		ArrayList<int []> ar = new ArrayList<>();
		
		for(int i=0 ; i<2 ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			ar.add( new int []{a ,b});
		}
		
		ArrayList<int []> ar1 = new ArrayList<>();
		
		System.out.println("Enter the new Interval :");
		int s = sc.nextInt();
		int e = sc.nextInt();
		ar1.add(new int []{s , e});
		
		int [] a= new int[2];
		int [] b= new int[2];
		
		for(int i=0 ; i<ar.size();i++){
			a = (int [])ar1.get(ar1.size()-1);
			b = (int [])ar.get(i);
			if(a[1] >= b[0]){
				a[0]=b[0];
			}else{
				ar1.add(b);
			}
		}
		for(int [] k : ar1){
			System.out.println(k[0] + "  " + k[1]);
		}
		
	}
}