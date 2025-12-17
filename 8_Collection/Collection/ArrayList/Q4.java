/*
Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/
import java.util.*;
public class Q4{
	public static void main(String x[]){
		
		int arr[] = {1,1,2,3,2,3,9,5,7,8,8,6,4,5,3,4,6,8,7,5,4,1,2,3};
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for(int i : arr){
			ar.add(i);
		}
		for(int i=0 ; i<=9 ; i++){
			int cnt=0;
			for(int j = 0 ; j<ar.size() ; j++){
				if(i == ar.get(j)){
					cnt++;
				}
			}
			// for(int j : ar){
				// if(i == j){
					// cnt++;
				// }
			// }
			
			if(cnt>0){
				System.out.println(i + " : " + cnt); 
			}
		}
		
	}
}