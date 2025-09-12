//Q37. Write a java program to enter a number and print it in words.
import java.util.*;
public class NumtoWordApp{
	public static void main(String x[]){
	Scanner sc =  new Scanner(System.in);
	System.out.printf("Enter the number :");
	int num = sc.nextInt();
	int i=0, a=0 ;
	while(num!=0){
	  a = a*10+num%10;
	  num=num/10;
	}
	while(a!=0){
	   int n = a%10;
	   a=a/10;
	
	switch(n){
	 case 0:
			System.out.printf("Zero");
			break;
	 case 1:
			System.out.printf("One ");
			break;
	 case 2:
			System.out.printf("Two ");
			break;
	 case 3:
			System.out.printf("Three ");
			break;
	 case 4:
			System.out.printf("Four ");
			break;
	 case 5:
			System.out.printf("Five ");
			break;
	 case 6:
			System.out.printf("Six ");
			break;
	 case 7:
			System.out.printf("Seven ");
			break;
	 case 8:
			System.out.printf("Eight ");
			break;
	 case 9:
			System.out.printf("Nine ");
			break;
	}
	}
}}