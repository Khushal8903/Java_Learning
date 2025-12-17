/*
Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/
import java.util.*;
public class Q6{
	public static void main(String x[]){
		
		Vector<Integer> v = new Vector<>();
		v.add(1);
		v.add(2);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(4);
		v.add(3);
		v.add(3);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(6);
		v.add(7);
		v.add(1);
		
	
		for(int i=0 ; i<v.size() ;i++){
			for(int j=i+1 ; j<v.size() ; j++){
				if(v.get(i) == v.get(j)){
					v.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(v);
		
	}
}