//Q2. Write a java program swap two number without using third variable. 
import java.util.*;
public class Q2App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Number:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second Number:");
	int b = sc.nextInt();
	
	a =a - b;
	
	b = b + a;
	
	a = b -a;
	
	System.out.printf("a : %d \n b : %d " , a ,b);
     
	}
}