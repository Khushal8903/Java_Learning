/*
Q23. Write a java program to Check Number Is Spy Number or Not.
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
public class SpyApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	int num , sum=0 , temp , prod;
	
	System.out.printf("Enter the number:");
	 num = sc.nextInt();
	
	 sum = num%10;
	 prod = sum;
	 temp = num/10;
	 sum = sum+temp%10;
	 prod = prod*temp%10;
	 temp = temp/10;
	 sum = sum+temp%10;
	 prod = prod*temp%10;
	 temp = temp/10;
	 sum = sum+temp%10;
	 prod = prod*temp%10;
	 
	 if(prod == sum){
	 System.out.printf("Number is Spy");
	 }else{
	 System.out.printf("Number is not Spy");
	 }
	 
	
	}
}