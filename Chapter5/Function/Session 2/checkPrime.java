//Write a function to check whether a number is prime or not.
import java.util.*;
public class checkPrime{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	isPrime(num);
	
	}
	
	public static void isPrime(int a){
		boolean f= true;
		int i=2;
			while(i<a){
				if(a%i==0){
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