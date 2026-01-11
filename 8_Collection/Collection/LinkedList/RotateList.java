/*
13. Rotate List
Description:
Rotate list right by k steps.
Example:
Input: 1→2→3→4→5, k=2
Output: 4→5→1→2→3
*/
import java.util.*;
public class RotateList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the data set :");
		int n=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0 ;i<n;i++){
			ll.add(sc.nextInt());
		}
		
		int k=2;
		for(int i=0 ;i<ll.size()-k ;i++){
			int num = ll.remove(0);
			ll.add(num);
		}
		
		System.out.println(ll);
		
	}
}