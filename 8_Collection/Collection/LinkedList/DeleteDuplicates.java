/*
14. Delete Duplicates (Sorted II)
Description:
Remove all nodes with duplicate values.
Example:
Input: 1→2→3→3→4→4→5
Output: 1→2→5
*/
import java.util.*;
public class DeleteDuplicates{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the data set :");
		int n=sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0 ;i<n;i++){
			ll.add(sc.nextInt());
		}
		
		for(int i=0 ;i<ll.size();i++){
		boolean f=true;
			for(int j=i ;j<ll.size();j++){
				if((ll.get(i)==ll.get(j))&&(i!=j)){
					System.out.print(ll.get(i) +" ");
				}
			}
		}
	}
}
		
		