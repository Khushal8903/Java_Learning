/*
Q41. Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/
import java.util.*;
public class SalryHikeApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Basic Salary:");
	int sal = sc.nextInt();
	System.out.printf("Enter the Year of service:");
	int year = sc.nextInt();
	System.out.printf("Enter te Performance rating(1-5):");
	int rating=sc.nextInt();
	
	if(rating >= 4 && year > 5){
	  int sal1 =sal+(sal*20/100);
	  System.out.println("New Salary:" + sal1);
	}else if(rating >= 3){
	   int sal2 = sal+(sal*10/100);
	   System.out.println("New Salary:" + sal2);
	}else{
	   int sal3 = sal+(sal*5/100);
	   System.out.println("New Salary:" + sal3); 
	}
	
	}
}
