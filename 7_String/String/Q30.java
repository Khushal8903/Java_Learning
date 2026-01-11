/*
Q30. Write a java program to arrange characters in ascending order.
 Input : dcba
 Output : abcd
*/
import java.util.*;
public class Q30{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String :");
	String s = sc.nextLine();
	
	char ch[] = s.toCharArray();
	Arrays.sort(ch);
	for(char c: ch){
		System.out.print(c);	}
	
	}
}