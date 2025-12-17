/*
Q2. Create a Vector of integers.
Store 10 numbers and count how many numbers are greater than 50.
Iteration
Logical comparison: num > 50
Counter concept


Explanation
Use a counter that increases each time the number is greater than 50.
*/
import java.util.*;
public class Q2{
	public static void main(String x[]){
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 10 number:");
	 Vector v = new Vector();
	 for(int i=0 ; i<=9 ; i++){
		v.add(sc.nextInt());
	 }
	 
	 int cnt=0;
	 
	 Iterator i = v.iterator();
	 
	 System.out.println("The number above 50:");
	 while(i.hasNext()){
			int n = (int)i.next();
			
			if(n>50){
				cnt++;
				System.out.println(n);
			}
	 }
	 
	 System.out.println("Total count :" + cnt);
	 
	}
}