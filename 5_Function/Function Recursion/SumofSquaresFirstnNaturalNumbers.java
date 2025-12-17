// 17. Write a program to find the sum of squares of first n natural numbers using recursion.
import java.util.*;
public class SumofSquaresFirstnNaturalNumbers{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();

	int res = sumSq(n ,1);
	System.out.print(res);
	
	}
	public static int sumSq(int a,int i){
		if(i>a){
		 return 0;
		}
		
		return i*i + sumSq(a,++i);	
	}
}
