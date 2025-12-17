//Write a program to calculate the sum of digits of a given number using recursion.
import java.util.*;
public class sumOfDigit{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	
	int sum =0 ;
	System.out.print(sumDigit(n , sum));
	}
	public static int sumDigit(int a, int b){
		if(a==0){
		return b;
		}
		b=b+a%10;
		return sumDigit(a/10,b);
	}
}
