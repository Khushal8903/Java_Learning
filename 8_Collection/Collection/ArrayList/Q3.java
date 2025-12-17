/*
Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/
import java.util.*;
public class Q3{
	public static void main(String x[]){
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		ar.add(3);
		ar.add(2);
		ar.add(7);
		ar.add(6);
		ar.add(5);
		ar.add(4);
		ar.add(8);
		ar.add(10);
		ar.add(9);
		
		Vector<Integer> v = new Vector<>(ar);
		
		for(int i =0 ; i<v.size() ;i++){
			for(int j=i+1 ;j<v.size() ;j++){
			
				if(v.get(i)>v.get(j)){
					int temp = v.get(i);
					v.set(i , v.get(j));
					v.set(j , temp);
					
				}
			}
		}
		
		System.out.println(v);
		
		
	}
}