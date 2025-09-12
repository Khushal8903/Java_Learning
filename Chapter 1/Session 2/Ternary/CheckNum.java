//Q34. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class CheckNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	String str = num > 0  ? "Number is Positive" : num < 0 ? "Number is Negative" : "Number is Zero" ;
	System.out.printf(str);
	
	}
}