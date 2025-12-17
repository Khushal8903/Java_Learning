//10.Write a C program to count the number of digits in a number.
import java.util.*;
public class CountDigit{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int n , i =0 ;
	
	while(num != 0){
	   n = num %10;
	   num = num /10;
	   i ++;
	}
	System.out.println(i);
	}
}