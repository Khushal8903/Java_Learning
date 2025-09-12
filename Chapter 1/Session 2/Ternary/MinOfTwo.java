//Q45. Write a java program to find the minimum between two numbers. 
import java.util.*;
public class MinOfTwo{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the 1st number:");
	int num1 = sc.nextInt();
	System.out.printf("Enter the 2nd number:");
	int num2 = sc.nextInt();
	
	int num = num1 > num2 ? num2 : num1 ;

		System.out.println(num);
	
	}
}