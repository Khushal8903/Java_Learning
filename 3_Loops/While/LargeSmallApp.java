/*
Q43. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
*/
import java.util.*;
public class LargeSmallApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number 1st number:");
	int num = sc.nextInt();
	 int sm=9, lg=0 ,a;
	 while(num!=0){
		a = num%10;
					 if(a>lg){
					   lg =a;
					 }
					 if(a<sm){
					   sm =a;
					 }
					 num = num/10;				 
	}
	System.out.println("Smallest no:"+ sm);
	System.out.println("Largest no:"+lg);
}}