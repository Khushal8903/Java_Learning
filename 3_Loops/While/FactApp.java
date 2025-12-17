//Q17. Write a java program to find all factors of a number.
import java.util.*;
public class FactApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int n=1;
	while(n<=num/2){
	   if( num%n == 0){
	   System.out.println(n);
	   }
	   n++;
	}}}