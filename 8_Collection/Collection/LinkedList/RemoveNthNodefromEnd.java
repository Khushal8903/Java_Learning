/*
17. Remove N-th Node from End
Description:
Remove node that is n positions from the end.
Example:
Input: 1→2→3→4→5, n=2
Output: 1→2→3→5
*/
import java.util.*;
public class RemoveNthNodefromEnd{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the 1st data set :");
		int n=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0 ;i<n;i++){
			ll.add(sc.nextInt());
		}
		int k=2;
		int idx = ll.size()-k;
		ll.remove(idx);
		System.out.println(ll);
	}
}