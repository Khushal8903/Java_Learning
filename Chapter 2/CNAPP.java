//Q4. Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
public class CNApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number:");
	int num = sc.nextInt();
	
	if(num > 0){
	System.out.printf("Number is Positive");
	}else if(num<0){
	System.out.printf("Number is Negative");
	}else{
	System.out.printf("Number is Zero");
	}
	}
}