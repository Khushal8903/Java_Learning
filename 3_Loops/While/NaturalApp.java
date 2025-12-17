//1.Write a C program to print all natural numbers from 1 to n. - using while loop
import java.util.*;
public class NaturalApp{
	public static void main(String x[]){
	Scanner sc  = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	int i = 1;
	while( i<=n){
	System.out.println(i);
	i++;
	}
	}
}