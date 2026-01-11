/*
11. Reorder List
Description:
Reorder as: L1 → Ln → L2 → Ln-1 ...
Example:
Input: 1→2→3→4
Output: 1→4→2→3
*/

import java.util.*;
public class ReorderList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<>();
		LinkedList<Integer> ll1 = new LinkedList<>();
		System.out.println("Enter the size of the data set: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ll.add(sc.nextInt());
		}
		
		 
		int p=0;
		for(int i=0 ; i<(ll.size())/2;i++){
			ll1.add(ll.get(i));
			ll1.add(ll.get((ll.size())-i-1));
			p=i;
		}
		if(ll.size()%2!=0){
			ll1.add(ll.get(++p));
		}
		System.out.println(ll1);
	}
}