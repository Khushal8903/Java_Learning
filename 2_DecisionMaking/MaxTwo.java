//Q17. Write a java program to find the maximum between two numbers.
import java.util.*;
public class MaxTwo{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.printf("Enter the first number:");
	int num1 = sc.nextInt();
	 System.out.printf("Enter the second number:");
	int num2 = sc.nextInt();
	
	if(num1>num2){
	System.out.println(num1);
	}else{
	System.out.println(num2);
	}
}}
