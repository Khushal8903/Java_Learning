//Write a program to find the sum of even numbers up to n using recursion.
import java.util.*;
public class sunOfEvenNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int i=0;
	int res = evenSum(n,i);
	System.out.print(res);
	
	}
	public static int evenSum(int a , int i){
	
		if(i > a){
		 return 0;
		}
		return i + evenSum( a,i+2);
	}
}
