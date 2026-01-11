/*
18. Swap Nodes in Pairs
Description:
Swap every two adjacent nodes.
Example:
Input: 1→2→3→4
Output: 2→1→4→3
*/

import java.util.*;
public class SwapNodesinPairs{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the 1st data set :");
		int n=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0 ;i<n;i++){
			ll.add(sc.nextInt());
		}
		
		for(int i=0 ; i<ll.size() ; i+=2){
			int temp = ll.get(i);
			ll.set(i , ll.get(i+1));
			ll.set(i+1 , temp) ;
		}
		
		System.out.println(ll);
		
	}
}