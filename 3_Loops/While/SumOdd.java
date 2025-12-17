//8.Write a C program to find the sum of all odd numbers between 1 to n.
import java.util.*;
public class SumOdd{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	
	int i = 1 , sum = 0;
	while(i<=n){
		if(i%2 !=0){
		   sum = sum+i;
		}
		i++;
	}
	System.out.println(sum);
	}
}