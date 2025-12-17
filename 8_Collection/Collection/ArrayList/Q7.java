/*
Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
 
 1 ,2 ,3, 4, 5 => [4, 5, 1, 2, 3]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;

public class Q7{
	public static void main(String x[]){
		ArrayList<Integer> ar = new ArrayList<>();
		int k=2;
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		
		// for(int i=0 ; i<k ; i++){
			
			// int temp = (int)ar.remove(0);
			
			// ar.add(temp);
		// }
		int p = ar.size() -k;
		
		for(int i =0 ; i<p ;i++){
			int temp = ar.remove(0);
			
			ar.add(temp);
		}
		System.out.println(ar);
	}
}