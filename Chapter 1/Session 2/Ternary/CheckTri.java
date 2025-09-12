// Write a Java program to check whether a triangle is equilateral , isoscale or scalene.

import java.util.*;
public class CheckTri{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("Enter the First side of triangle:");
	int side1 = sc.nextInt();
	System.out.printf("Enter the second side of triangle:");
	int side2 = sc.nextInt();
	System.out.printf("Enter the third side of triangle:");
	int side3 = sc.nextInt();
	
	String str = (side1==side2 && side1==side3) ? "Triangle is Equilateral" :
				(side1 == side2 || side2==side3 || side1==side3) ? " Isoscale" :
				"Scalene";
	System.out.printf(str);
	
	
	}
}