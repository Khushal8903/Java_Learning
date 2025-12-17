//Write a program to calculate the power of a number (x^n) using recursion.
import java.util.*;
public class calculatePower{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Power:");
	int power = sc.nextInt();
	System.out.print("Enter the base:");
	int base = sc.nextInt();

	int a = findPower(power , base);
		System.out.print(a);
	}
	
	public static int findPower(int p ,int b){
		
		if(p==1){
			return b;
		}
		
		return b*findPower(--p , b);
	}
}