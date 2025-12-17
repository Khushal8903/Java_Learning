//Write a program to reverse a given number using recursion.
import java.util.*;
public class revNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int r =0;
	System.out.print(revNum(n ,r));
	
	
	}
	public static int revNum(int a , int rev){
		if(a==0){
		 return rev;
		}
		rev = rev*10+a%10;
		return revNum(a/10, rev);
		
			
	}
}
