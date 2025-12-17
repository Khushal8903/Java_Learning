/*
Q1. Write a Java program to store 5 integers in a Vector.
 Print only the even numbers using a loop.
Vector creation
Adding elements
Logical condition: num % 2 == 0


Explanation
Even numbers are divisible by 2, so we check each number using modulus operator.
*/
import java.util.*;
public class Q1{
	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		
		Vector v = new Vector();
		
		for(int i=0 ; i<=4 ; i++){
			System.out.println("Enter the Element : ");
			//int n =sc.nextInt();
			v.add(sc.nextInt());
		}
		
		
		//System.out.println(v);
		
		//Iterator i = v.iterator();
		
		// while(i.hasNext()){
					
			// Object obj = v.next();
			
			// //System.out.println(obj);
			
			// int n = (int)obj;
			// if(n%2==0){
				// System.out.println(n);
			// }
		// }
		
		
		
		// for(int k : v){
			// System.out.println(k);
		// }
		
		
		// for(int j=0 ; j<v.size() ; j++){
			// //System.out.println(v.get(j));
		// }
		
		// Enumeration e = v.elements();
		
		// while(e.hasMoreElements()){
					
			// Object obj = e.nextElement();
			
			// System.out.println(obj);
			
			// int n = (int)obj;
			// if(n%2==0){
				// System.out.println(n);
			// }
		// }
		
		
		//ListIterator l = v.listIterator();
		
		// while(l.hasNext()){
					
			// Object obj = l.next();
			
			// System.out.println(obj);
			
			// int n = (int)obj;
			// if(n%2==0){
				// System.out.println(n);
			// }
		// }
		
		ListIterator l = v.listIterator(v.size());
		
		while(l.hasPrevious()){
					
			Object obj = l.previous();
			
			//System.out.println(obj);
			
			int n = (int)obj;
			if(n%2==0){
				System.out.println(n);
			}
		}
		
	}
}