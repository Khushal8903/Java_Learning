//Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.*;
public class DivBy5And11{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number: ");
	int num = sc.nextInt();
	
	String str = num%5 ==0 && num%11 ==0 ? "Number is Divisible by 5 and 11" : 
				"The Number is not Divisible by 5 or 11" ;
	System.out.printf(str);
	
	}
}