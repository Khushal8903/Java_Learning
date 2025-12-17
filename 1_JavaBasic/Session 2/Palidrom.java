//Write a java program to check whether number is palindrome or not.
import java.util.*;
public class Palidrom{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the sequence of number:");
	int num = sc.nextInt();
	
	int last = num%10;
	int first =  num/100;
	
	String str = first  == last ? "Number in Palidrom" : "Number is not Palidrom";
	System.out.println(str);
	
	}
}