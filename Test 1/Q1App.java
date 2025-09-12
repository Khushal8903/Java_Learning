//  Q1. Write a Java program to convert seconds to hours, minutes and seconds. 

import java.util.*;
public class Q1App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the total Seconds:");
	int secds = sc.nextInt();
	
	int sec = secds%60;
	
	int temp = secds/60;
	
	int min = temp%60;
	
	int hr = temp/60;
	
	System.out.printf("Hr : %d - Min : %d - Sec : %d" , hr , min , sec);
	
	
	}
}