//Write a program to calculate the nth triangular number using recursion.
import java.util.*;
public class calnthTriangularNumber{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	int res = sumTriangular(n);
	System.out.print(res);
	
	}
	public static int sumTriangular(int a){
		if(a==1){
		 return 1;
		}
		return a + sumTriangular(a-1);	
	}
}
