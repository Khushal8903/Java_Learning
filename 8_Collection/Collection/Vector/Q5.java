/*
Q5. Create a Vector of 10 integers (including negative numbers).
 Remove all negative values and print the updated Vector.
Condition: num < 0
Removing elements
Using loop carefully when removing values


Explanation
Negative numbers are less than 0.
 You can use a loop with index backward to safely remove elements.
*/
import java.util.*;
public class Q5{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 10 number:");
	 Vector v = new Vector();
	 for(int i=0 ; i<10 ; i++){
		v.add(sc.nextInt());
	 }
	 
	 for(int i=0 ; i<v.size() ; i++){
		if((int)v.get(i)<0){
			v.remove(i);
		}
	 }
	 
	 System.out.println(v);
	 
	 
	 }
}
