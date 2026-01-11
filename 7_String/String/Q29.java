/*
Q29. Write a java program to remove a, e, i, o, u from the string.
 Input : education
 Output : dctn
*/
import java.util.*;
public class Q29{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.nextLine();
	
	s = s.replaceAll("[aeiouAEIOU]" , "");
	System.out.println(s);
	
	}
}