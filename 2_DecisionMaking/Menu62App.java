/*
Q62. Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.
*/
import java.util.*;
public class Menu62App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Value \n1.Check Number is positive , negative or zero.\n2.Check Number is even or odd.\n3.Write a c program to find the max number using 2 numbers. \n:");
	int num = sc.nextInt();
	
	switch(num){
	case 1:
	  System.out.printf("Enter the number:");
	  int n = sc.nextInt();
	  if(n > 0){
	  System.out.printf("number is Positive");
	  }else if(n<0){
	  System.out.printf("number is Negative");
	  }else{
	  System.out.printf("number is Zero");
	  }
	break;
	case 2:
	  System.out.printf("Enter the number:");
	  int a = sc.nextInt();
	  if(a%2 == 0){
	  System.out.printf("Number is Even");
	  }else{
	  System.out.printf("Number is Odd");
	  }
	  break;
	case 3:
	  System.out.printf("Enter the First Number:");
	  int b = sc.nextInt();
	  System.out.printf("Enter the Second Number:");
	  int c = sc.nextInt();
	  if(b>c){
	   System.out.printf("First number is Greater");
	  }else{
	  System.out.printf("Second number is Greater");
	  }
	  break;
	}
	
	}
}