//Q41. Write a java program to find maximum between three numbers.
import java.util.*;
public class MaxOfThree{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the 1st Number:");
	int a = sc.nextInt();
	System.out.printf("Enter the 2nd Number:");
	int b = sc.nextInt();
	System.out.printf("Enter the 3rd Number:");
	int c = sc.nextInt();
	
	int num = a>b&&a>c ? a : b>a&&b>c ? b:c;
	System.out.println(num);
	}
}
