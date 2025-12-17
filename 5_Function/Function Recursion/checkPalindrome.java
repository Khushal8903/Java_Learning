//Write a program to check whether a given number is a palindrome using recursion.
import java.util.*;
public class checkPalindrome{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number/String:");
	String ch = sc.nextLine();
	int s = 0 ;
	int e = ch.length();
		if(isPalindrome(ch , s , e-1)){
			System.out.print("Palindrome");
		}else{
			System.out.print("Not Palindrome");
		}
	
	}
	public static boolean isPalindrome(String ch , int s , int e){
		if(s>=e){
			return true;
		}
		if(ch.charAt(s) != ch.charAt(e)){
			return false;
		}
		
		return isPalindrome(ch , s+1 , e-1);
		
	}
}

