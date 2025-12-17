//Q46. Write a java program to find a minimum between three numbers. 
import java.util.*;
public class MinOfThree{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the 1st number:");
	int a = sc.nextInt();
	System.out.printf("Enter the 2nd number:");
	int b = sc.nextInt();
	System.out.printf("Enter the 3rd number:");
	int c = sc.nextInt();
	
	int num = a<b&&a<c ? a : b<a&&b<c  ? b : c;
		System.out.println(num);
	
	}
}