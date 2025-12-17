/*
Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;
public class Q1{
	public static  void main(String x[]){
			int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		// ArrayList<Integer> ar = new ArrayList<>();
		
		// for(int i: arr){
			// ar.add(i);
		// }
		
		// Iterator<Integer> i = ar.iterator();
		
		// while(i.hasNext()){
			// int num = i.next();
			// if(num%2==0){
				// i.remove();
			// }
		// }
		
		// for(int k:ar){
			// System.out.println(k);
		// }
		
		ArrayList ar = new ArrayList();
		
		for(int i:arr){
			ar.add(i);
		}
		
		Iterator i = ar.iterator();
		
		while(i.hasNext()){
			int num = (int)i.next();
			if(num%2==0){
				i.remove();
			}
			
		}
		System.out.println("-------------------------------------------------------------");
		for(Object obj : ar){
			// int k = (int)obj;
			// System.out.println(k);
			System.out.println(obj);
		}
	}
}