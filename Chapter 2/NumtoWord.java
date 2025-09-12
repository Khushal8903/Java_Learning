/*
Q56. Create a Java program using switch to convert a given number (1-5) to its word equivalent (One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.
Explanation:
 Switch with cases 1 to 5; default to handle invalid numbers.
*/
import java.util.*;
public class NumtoWord{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number (1-5)");
	int num= sc.nextInt();
	switch(num){
	case 1:
		System.out.printf("One");
		break;
	case 2:
		System.out.printf("Two");
		break;
	case 3:
		System.out.printf("Three");
		break;
	case 4:
		System.out.printf("Four");
		break;
	case 5:
		System.out.printf("Five");
		break;
	default:
		System.out.printf("invalid number");
	}}}