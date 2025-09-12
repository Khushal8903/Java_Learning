/*
Q61. Write a menu-driven program in java using switch case.
           	1.Addition
           	2.Subtraction
           	3.Multiplication
           	4,Division
*/
import java.util.*;
public class Menu61App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int a = sc.nextInt();
	System.out.println("Enter the second number:");
	int b = sc.nextInt();
	System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division  \nEnter the Choice:");
	int num= sc.nextInt();
	switch(num){
	case 1:
		System.out.println(a+b);
		break;
	case 2:
		System.out.println(a-b);
		break;
	case 3:
		System.out.println(a*b);
		break;
	case 4:
		System.out.println(a/b);
		break;
	}
	}
}