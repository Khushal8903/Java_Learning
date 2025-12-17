//Q50. Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
import java.util.*;
public class PerSq{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the Num:");
	int num = sc.nextInt();
	
	double Sqroot = Math.sqrt(num);
	
	String str = Sqroot == Math.floor(Sqroot) ? "Number is Perfect Sqroot" : "Number is not Perfect Sqroot";
	System.out.printf(str);
	
	}
}