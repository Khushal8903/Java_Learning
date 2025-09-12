//Write a Java program and compute the sum of an integer's digits.
//Input : 123
//Output : 6


import java.util.*;
public class SumOfDigit{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the Number:");
	int num = sc.nextInt();
	
	int last = num%10;
	
	int num1 = num/10;
	
	int num2 = num1%10;
	
	int num3 = num1/10;
	
	
	System.out.println((num2) +(num3)+ (last) );
	}

}
