// Q4. Write a java program to check whether number is palindrome or not palindrome using  ternary operators.
import java.util.*;
public class Q4App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Number:");
	int num = sc.nextInt();
	int temp =num;
	
// for 3digit number;
	int rev =0;
	
	int n1 = num%10;
	num = num/10;
	rev = rev+ n1;
	
	 n1 = num%10;
	 rev = rev*10+n1;
	 num=num/10;
	rev = rev*10 + num;
	
	
	
	String str = rev==temp ? "Palindrome" : "Not Palindrome" ;
	System.out.println(str);
	
	}
}
	
	