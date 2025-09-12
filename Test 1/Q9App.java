/*
Q9. Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform 
the corresponding operation. 
 Explanation: 
 Use a switch on the operator to handle different arithmetic operations. Add  
default to handle invalid operators. 
*/
import java.util.*;
public class Q9App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the First Number:");
	int a = sc.nextInt();
	System.out.printf("Enter the Second Number:");
	int b = sc.nextInt();
	System.out.printf("Enter the Operator :");
	char ch = sc.next().charAt(0);
	break;
	switch(ch){
	case '+':
			System.out.printf("Addition: %d" , a+b);
			break;
	case '-':
			System.out.printf("Substractoin: %d" , a-b);
			break;
	case '*':
			System.out.printf("Multiplication: %d" , a*b);
			break;
	case '/':
			System.out.printf("Division: %d" , a/b);
			break;
	case '%':
			System.out.printf("Addition: %d" , a%b);
			break;
	default:
			System.out.printf("Invalid Operator");
	}
	}
}