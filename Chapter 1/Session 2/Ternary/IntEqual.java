//Q43. Write a java program to accept two integers and check whether they are equal or not.
import java.util.*;
public class IntEqual{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the first number: ");
	int a = sc.nextInt();
	System.out.printf("Enter the second number: ");
	int b = sc.nextInt();
	
	String str =  a==b ? "Equal" : "Not Equal" ;
	
	System.out.println(str);
	
	}
}