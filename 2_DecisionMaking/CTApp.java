//Q3. Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.
import java.util.*;
public class CTApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	
	System.out.printf("Enter the lenght of 1st side of Triangle:");
	int side1 =  sc.nextInt();
	System.out.printf("Enter the lenght of 2nd side of Triangle:");
	int side2 =  sc.nextInt();
	System.out.printf("Enter the lenght of 3rd side of Triangle:");
	int side3 =  sc.nextInt();
	
	if(side1 == side2 && side2 == side3){
	System.out.printf("Triangle is Equilateral");
	}else if(side1 == side2 || side2 ==side3 || side1 ==side3){
	System.out.printf("Triangle is Isoscale");
	}else{
	System.out.printf("Triangle is Scalene");
	}
	
	}
}