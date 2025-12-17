//Write a program to check whether a given number is prime using recursion.
import java.util.*;
public class checkPrime{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int i=2;
	
	if(n<=1){
		System.out.print("Not Prime Number");
	}else if(isPrime(n ,i)){
		System.out.print("Prime Number");
	}else{
		System.out.print("Not Prime Number");
	}
	
	
	}
	
	public static boolean isPrime(int a,int i){
		if(i+i>a){
			return true;
		}
		
		if(a%i==0){
			return false;
		}
		return isPrime(a ,++i);
	}
}
