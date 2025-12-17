//Write a program to print the first n Fibonacci numbers using recursion.
import java.util.*;
public class calFibonacci{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int num = sc.nextInt();
	int i=0;
	while(i<num){
			System.out.print(findFibonacci(i));
			i++;
	}

	}
	
	public static int findFibonacci(int n){
		
		if(n==0){
			return 0;
		}
		if(n==1){
			return 1;
		}
		
		return (findFibonacci(n-1)+findFibonacci(n-2));
		
	}
}