/*
Palindrome Check (Number or String)


Write a function isPalindrome(int n) that checks whether a number is palindrome or not.


Example: Input 121 → true.
*/
import java.util.*;
public class PalindromeCheck{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string:");
	String ch =sc.nextLine();
	
	char a[] = ch.toCharArray();
	
	
	
	isPalindrome(a);
	
	}
		public static void isPalindrome(char a[]){
			
			int start = 0 , end = a.length-1;
				boolean f = true;
			while(start<end){
		
				if(a[start] != a[end]){
						f = false;
						break;
				}
				start++;
				end--;
			}
			
			if(f){
				System.out.print("True");
				
			}else{
				System.out.print("False");
			}
			
			
			
		}
	
	}