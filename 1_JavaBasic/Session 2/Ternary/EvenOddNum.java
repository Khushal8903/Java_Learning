// Q31. Write a Java program to check whether a number is even or odd. 
import java.util.*;
public class EvenOddNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num= sc.nextInt();
	
	String str = (num%2 ==0) ? "Number is Even" : "Number is Odd";
	
	System.out.printf(str);
	
	}
}