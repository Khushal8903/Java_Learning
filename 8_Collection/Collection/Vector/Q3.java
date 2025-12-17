/*
Q3. Store any 7 integers in a Vector.
 Calculate and print the sum of all elements.
Addition operation
Looping through Vector


Explanation
Keep a variable sum initially 0, then add each element.*/
import java.util.*;
public class Q3{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 7 number:");
	 Vector v = new Vector();
	 for(int i=0 ; i<=7 ; i++){
		v.add(sc.nextInt());
	 }
	 
	 int sum=0;
	 
	 Iterator i = v.iterator();
	 
	
	 while(i.hasNext()){
			int n = (int)i.next();
			
			sum=sum+n;
	 }
	 
	 System.out.println("Total Sum :" + sum);
	 
	}
}