//Q47. Write a java program to find the maximum between two numbers.
import java.util.*;
public class MaxOfTwo{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the first number: ");
	int a = sc.nextInt();
	System.out.printf("Enter the second number: ");
	int b = sc.nextInt();
	
	int num = a>b ? a: b;
	
	System.out.println(num);
	
	}
}