//7.Write a C program to find the sum of all even numbers between 1 to n.
import java.util.*;
public class SumEven{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number");
	int n = sc.nextInt();
	int i = 0 , sum = 0;
	while(i <= n){
	   if(i%2 == 0){
	    sum = sum+i;
	   }
	    i++;
	}
	System.out.println(sum);
	}
}