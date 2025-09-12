//Q12. Write a java program to calculate the product of digits of a number.
import java.util.*;
public class MulDigit{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	int sum = 1 , n = 0;
	while(num >0){
	    n = num%10;
		sum = sum*n;
		num = num/10;
		
	}
	System.out.println(sum);
	}
}