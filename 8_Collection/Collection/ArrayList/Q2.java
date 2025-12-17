/*
Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class Q2{

	public static void main(String x[]){
	
	ArrayList ar1 = new ArrayList();
	ar1.add(1);
	ar1.add(2);
	ar1.add(3);
	ar1.add(4);
	ar1.add(5);
	ar1.add(6);
	ar1.add(7);
	ArrayList ar2 = new ArrayList();
	ar2.add(5);
	ar2.add(6);
	ar2.add(7);
	ar2.add(8);
	ar2.add(9);
	ar2.add(10);
	
	// ArrayList<Integer> ar = new ArrayList<>();
	
	// for(int i : ar1){
		// boolean b = ar.contains(i);
		// if(!b){
			// ar.add(i);
		// }
	// }
	// for(int j : ar2){
		// boolean b = ar.contains(j);
		// if(!b){
			// ar.add(j);
		// }
	// }
	// for(int k :ar){
		// System.out.println(k);
	// }
	
	ArrayList ar = new ArrayList(ar1);
	for(Object obj:ar2){
		if(!(ar.contains(obj))){
			ar.add(obj);
		}
	}
	System.out.println(ar);
	
	}
}