 //Q7. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
 import java.util.*;
public class Q7App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Side:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second Side:");
	int b = sc.nextInt();
	System.out.printf("Enter the Third Side:");
	int c = sc.nextInt();
	
	if( a==b && b==c){
		System.out.printf("Equilateral");
	}else if(a==b || b==c || a==c ){
		System.out.printf("Isoscale");
	}else{
		System.out.printf("Scalene");
	}
	}
}
	
	
	
	