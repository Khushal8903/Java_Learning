//Check Palindrome Using Two Pointers
//Check if a string is a palindrome using the two-pointer approach.
import java.util.*;
public class CheckPalindrome{
	public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter the size of the Array:");
	int n =sc.nextInt();
	int a[] = new int[n];
	System.out.printf("Enter the %d value of the Array:",n);
	for(int i=0 ; i<n ; i++){
	   a[i] = sc.nextInt();
	}
	
	 int start = 0;
	 int end = a.length-1;
	boolean f=true;
	while(start<=end){
			if(a[start]!=a[end]){
				f=false;
				break;
			}
			start++;
			end--;
	}
	
	String str = f?"Palindrome" : "Not Palindrome";
	System.out.print(str);
	}
}