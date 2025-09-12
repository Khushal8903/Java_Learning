//Q1. Write a Java program to check whether a number is even or odd.
import java.util.*;
public class EOApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num= sc.nextInt();
	if(num%2==0){
	  System.out.printf("%d : is Even " ,num);
	}else{
	  System.out.printf("%d : is Odd" , num);
	}
	}
}