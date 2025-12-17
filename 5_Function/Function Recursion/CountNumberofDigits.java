//Write a program to count the number of digits in a given number using recursion.
import java.util.*;
public class CountNumberofDigits{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	
	int res = countNum(n);
	
	System.out.print(res);
	
	}
	public static int countNum(int a){
		if(a==0){
			return 0;
		 
		}
		
		return 1+countNum(a/10);
			
	}
}
