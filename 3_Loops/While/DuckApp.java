/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.
*/
import java.util.*;
public class DuckApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num =  sc.nextInt();
     boolean flag = false;
	while(num !=0){
	  int n= num%10;
	  if(n==0){
	  flag = true;
	  }
	  num = num/10;
	}
	String str = flag ? "Duck" : "Not Duck" ;
	System.out.printf(str);
}}
	
	