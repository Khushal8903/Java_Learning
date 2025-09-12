//Q2. Write a Java program to check whether a triangle is valid or not
import java.util.*;
public class VTApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Angle of tringle: ");
	int angle1 = sc.nextInt();
	System.out.printf("Enter the second Angle of tringle: ");
	int angle2 = sc.nextInt();
	System.out.printf("Enter the third Angle of tringle: ");
	int angle3 = sc.nextInt();
	
	if(angle1+angle2+angle3 == 180){
	System.out.printf("Triangle is Valid");
	}else{
	System.out.printf("Triangle is Invalid");
	}
}}