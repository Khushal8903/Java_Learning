//Q16. Write a java program to find a minimum between three numbers.
import java.util.*;
public class MinThreeApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Number:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second Number:");
	int b = sc.nextInt();
	System.out.printf("Enter the Third Number:");
	int c = sc.nextInt();
	if(a>b && c>b){
	  System.out.printf("%d is Minimum", b);
	}else if(b>a && c>a){
	  System.out.printf("%d  is Minimum", a);
	}else{
	  System.out.printf("%d is Minimum", c);
	}
	
	}
}