//Q41. Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits) for numbers from 1 to n.
import java.util.*;
public class HarshadApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int temp = num ,sum =0 , a =0;
	while(num!=0){
	   a = num%10;
	    sum = sum + a;
	   num = num/10;
	 
	}
	
	   if(temp%sum == 0){
	   System.out.printf("Given Number is the Harshad Number");
	   }else{
		   System.out.printf("Given Number is not Harshad Number");
	   }
	   
	
}}
	
	