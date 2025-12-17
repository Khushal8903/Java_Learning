/*
Q4. Take a Vector and add 8 integers.
 Accept a number from the user and check if it exists in the Vector.
Searching using loop
Logical condition:
 if (vector.get(i) == searchValue)


Explanation
Compare each element with the search number.
 If matched, set a boolean flag to true.
*/
import java.util.*;
public class Q4{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the 8 number:");
	 Vector v = new Vector();
	 for(int i=0 ; i<=8 ; i++){
		v.add(sc.nextInt());
	 }
	 System.out.println("Enter the number for search :");
	int search =sc.nextInt();

	 boolean f=true;
	 for(int i=0 ; i<v.size() ;i++){
	 if(search == (int)v.get(i)){
		System.out.println("Found !....");
		f=false;
		break;
	 }
	 }
	 if(f){
		
		System.out.println("Not Found !....");
	 }
	
	 
	
}
}