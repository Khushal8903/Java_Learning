//Q8. Write a Java program to check whether a year is a leap year or not.
import java.util.*;
public class CLApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Year:");
	int year = sc.nextInt();
	if(year % 400==0 ){
	System.out.printf("Year Is Leap");
	}else if(year %100 == 0){
	System.out.printf("Year is Not Leap Year");
	}else if(year %4 ==0){
		System.out.printf("Year Is Leap");
	}else{
	System.out.printf("Year is Not Leap Year");
	}
	
	}
}