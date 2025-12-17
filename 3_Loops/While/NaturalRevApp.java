//2.Write a C program to print all natural numbers in reverse (from n to 1). - using while loop
import java.util.*;
public class NaturalRevApp{
	public static void main(String x[]){
	Scanner sc  = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int n = sc.nextInt();
	int i = 1;
	while( n>=i){
	System.out.println(n);
	n--;
	}
	}
}