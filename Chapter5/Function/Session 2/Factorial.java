//Write a function to calculate the factorial of a number (using loop only).
import java.util.*;
public class Factorial{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number:");
	int num = sc.nextInt();
	int res = calFact(num);
	System.out.print(res);
	
	}
	
	public static int calFact(int a){
		int f=1;
		while(a!=0){

		f= f*a;
		a--;
	}
	return f;
	}
}