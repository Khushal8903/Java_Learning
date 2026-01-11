/*
12. Partition List
Description:
Partition around value x, keeping original order.
Example:
Input: 1→4→3→2→5→2, x=3
Output: 1→2→2→4→3→5
*/
import java.util.*;
public class PartitionList{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	LinkedList<Integer> ll = new LinkedList<>();
	int k=3;
	
	System.out.println("Enter the size of the adta set: ");
	int n=sc.nextInt();
	for(int i=0 ; i<n ;i++){
		ll.add(sc.nextInt());
	}
				
	for(int i=0 ;i<k;i++){
	int min=Integer.MAX_VALUE;
	int idx=i;
		for(int j=i ; j<ll.size(); j++){
			if(ll.get(j)<min){
				min=ll.get(j);
				idx=j;
			}
		}
		ll.remove(idx);
		ll.add(i ,min);
		
	}
	System.out.println(ll);
	
	
	
	}
}