//Q16. Write a java program to find power of a number.
import java.util.*;
public class Pow1App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Base:");
	int base = sc.nextInt();
	System.out.printf("Enter the Index:");
	int idx = sc.nextInt();
	int i = 1 , p =1 ;
	while(i<=idx){
	     p = p*base;
		 i++;
	}
	System.out.println(p);
	
	
	
	
	
	
	
	
	}
	
	
}