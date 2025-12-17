//Q39. Write a java program to find LCM of two numbers.
import java.util.*;
public class LCMApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number 1st number:");
	int a = sc.nextInt();
	System.out.printf("Enter the number 1st number:");
	int b = sc.nextInt();
	 int rem, a1=a , b1 =b;
	 
	 while(a%b!=0){
	 rem = a%b;
	 a=b;
	 b=rem;
	 }
	 
	 int c = Math.abs(a1*b1);
	 
	 int lcm = c/b;
	 
	 System.out.println("LCM of the number is:" + lcm);
}}
	 