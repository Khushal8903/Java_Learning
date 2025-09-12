/*
Check Prime Number


Write a function isPrime(int n) that checks if a number is prime or not.


Use it in main() to test different inputs.
*/
import java.util.*;
public class CheckPrimeNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the input:");
	int t = sc.nextInt();
	isPrime(t);

	}
		public static void isPrime(int a){
			int i=2; 
				boolean f = true;
			while(i<a){
				if(a%i == 0){
					f = false;
					break;
				}
				i++;
			}
			
			if(f){
				System.out.print("Prime");
			}else{
				System.out.print("Not Prime");
			}
		}
	
	}