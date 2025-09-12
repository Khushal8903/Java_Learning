/*
Fibonacci Series (n terms)


Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.


Example: Input 5 → 0 1 1 2 3
*/
import java.util.*;
public class FibonacciSeries{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the nth input:");
	int p = sc.nextInt();
	printFibonacci(p);
	 
	}
		public static void printFibonacci(int a){
			int b=0 ,c=1;
				System.out.print(b+ " ");
				System.out.print(c+ " ");
			while(a-2!=0){
					int temp = b+c;
					b=c;
					c=temp;
					System.out.print(temp+ " ");
					a--;
			}
		}
	
	}