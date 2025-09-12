/*
 Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/
import java.util.*;
public class SpyNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	
	int num = sc.nextInt();
	
	int num1 = num/1000;
	int num2 = num/100;
	int num3 = num/10;
	int num4 = num%10;
	
	int sum = num1 + num2 + num3 + num4 ;
	int mul = num1 + num2+ num3 + num4;
	
	String str = sum == mul ? "Number is Spy" : "Number is not Spy";
	System.out.println(str);
	}
}