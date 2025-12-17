/*
Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/
import java.util.*;
public class ArrayPalindrome{
	int a[];
	public static void main(String x[]){
	
	ArrayPalindrome ap = new ArrayPalindrome();
	ap.inputArray();
	if(ap.isPalindrome(ap.a)){
		System.out.print("Array is Palindrome");
	}else{
		System.out.print("Array is Not Palindrome");
	}	
	
	}
	
	
	void inputArray(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of the Array:");
		int n = sc.nextInt();
		int []arr = new int[n];
		System.out.print("Enter the value of the Array:");
			for(int i = 0  ;  i<arr.length ; i++){
				arr[i] = sc.nextInt();
			}
			a  = arr;
		}
		
	boolean isPalindrome(int ...arr){
		
		for(int i = 0 ; i<arr.length ; i++){
		
			if(arr[i] != arr[arr.length-i-1]){
				return false;
			}
			
			
		}
		return true;
	}
}