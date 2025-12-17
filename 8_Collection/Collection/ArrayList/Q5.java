/*
Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
import java.util.*;
public class Q5{
	public static void main(String x[]){
		
		int arr[] = {1,2,23,56,76,44,12,34,56,78,90,9,87,65,43,21};
		
		Vector  v = new Vector();
		
		for(int i: arr){
			v.add(i);
		}
		
		int max = (int)v.get(0);
		for(Object k : v){
			int d = (int)k;
				 if(max <d){
					max =d;
					}
				}
		int smax = (int)v.get(0);
		
		for(Object k : v){
			if((int)k>smax && (int)k<max){
				smax = (int)k;
			}
		}
		System.out.println(smax);
		
		// int largest = v.get(0);
		// int t=0;
		// while(t<2){
			// for(int k : v){
				// if(largest <k){
					// largest =k;
				// }
			// }	
			// --t;
		// }
	}
}