//Write a program to calculate the sum of all multiples of 3 or 5 up to n using recursion.
import java.util.*;

public class calculateSumofMultiple{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	System.out.print(printSum(n , 1 , 0));
	
	
	}
	public static int printSum(int a , int i , int sum){
			if(i>a){
				
				return sum ;
			}
				if(i%3==0 || i%5==0){
					 sum = sum + i;
				}
			return printSum(a , i+1 , sum);
			
	}
}