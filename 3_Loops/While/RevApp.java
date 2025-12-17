//Q13. Write a java program to enter a number and print its reverse.
import java.util.*;
public class RevApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int n=0;
	while(num > 0){
		n = n*10+num%10;
	    num = num/10;
	}
	System.out.println(n);
}}