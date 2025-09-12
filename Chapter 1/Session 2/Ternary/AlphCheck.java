//Q36. Write a Java program to check whether character is alphabetic or not.
import java.util.*;
public class AlphCheck{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Char:");
	char ch = sc.next().charAt(0);
	
	String str = 'A'<=ch && 'Z'>=ch || 'a'<=ch && 'z'>=ch ? "Input is Alphabetic" : "Input is Not Alphabetic";
	System.out.printf(str);
	
	}
}