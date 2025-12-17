/*
Q57. Write a program to input an employee level (1-3) and display the salary range:
1: Junior (20,000 - 30,000)
2: Mid (31,000 - 50,000)
3: Senior (51,000 - 80,000)
Explanation:
 Use switch on the level number and print the salary range.
*/
import java.util.*;
public class EmpLelApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("1: Junior\n2: Mid\n3: Senior\nEnter the Salary Range:");
	int num= sc.nextInt();
	switch(num){
	case 1:
		System.out.printf("Junior (20,000 - 30,000)");
		break;
	case 2:
		System.out.printf("Mid (31,000 - 50,000)");
		break;
	case 3:
		System.out.printf("Senior (51,000 - 80,000)");
		break;
	}
	}
}