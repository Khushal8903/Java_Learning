// Write a program to find the sum of factorials from 1 to n using recursion.
import java.util.*;
public class findSumofFactorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int res =sum(n);
	System.out.println(res);
	
	}
	public static int sum(int n){
		if(n==1){
			return 1;
		}
		return fact(n) + sum(n-1);
	}
	
	public static int fact(int a){
		if(a==1){
			return 1;
		}
		int i =a;
		int f=1;
		while(i!=0){
			f=f*i;
			--i;
		}
		return f;
		
	}
	
	
	
	
	
	
	
	
	
	
/*
Using Single Function:
	
	public static int factorialSum(int a ){
		
		if(a==1){
			return 1;
		}
		int i=a;
		int f=1;
		
			while(i!=0){
				f= f * i;
				i--;
			}
		
		
		return f + factorialSum(--a );	
	
	}
*/	


}
