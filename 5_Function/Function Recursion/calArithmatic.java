//18. Write a program to calculate the nth term of an arithmetic series using recursion.
import java.util.*;
public class calArithmatic{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Number:");
	int n = sc.nextInt();
	System.out.print("Enter the Difference:");
	int d = sc.nextInt();
	System.out.print("Enter the First term:");
	int i = sc.nextInt();
	
	int count =0;
	
	int res =calArithmatic(n,d,i,count);
	System.out.print(res);
	
	}
	public static int calArithmatic(int n , int k , int i,int count){
		if(count == n-1){
		 return  i;
		}
		count++;
		return  calArithmatic(n, k ,i+k , count);
	}
}
