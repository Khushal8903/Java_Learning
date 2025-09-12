//Q38. Write a Java program to check whether a year is leap year or not.
import java.util.*;
public class LeapYear{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Year: ");
	int year= sc.nextInt();
	
	String str = year % 400 ==0 ? "Leap Year" : 
				year%100 ==0 ? " Not Leap Year" : 
				year%4 ==0 ? "Leap Year"  : "Not Leap Year";
	 System.out.printf(str);
	}
}
