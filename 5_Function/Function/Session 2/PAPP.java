//Write a function to calculate the factorial of a number (using loop only).
import java.util.*;
public class PAPP{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a=12 , b=18;
	int mul = a*b;
	while(b!=0){
		int temp = b;
		b = a%b ;
		a=temp;
	}
	int res=a;
	System.out.print(mul/res);
	
	}
}