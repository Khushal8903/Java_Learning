//Q30. Write a java program to enter month number between(1-12) and print number of days in month using if else.
// How to print the number of days in a given month using if else in java programming.
import java.util.*;
public class YApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int num = sc.nextInt();
		switch(num){
			case 1:
				 System.out.printf("January"); 
				 break;
			case 2:
				 System.out.printf("February"); 
				 break;
			case 3:
				 System.out.printf("March"); 
				 break;
			case 4:
				 System.out.printf("April"); 
				 break;
			case 5:
				 System.out.printf("May"); 
				 break;
			case 6:
				 System.out.printf("June"); 
				 break;
			case 7:
				 System.out.printf("July"); 
				 break;
			case 8:
				 System.out.printf("Agust"); 
				 break;
			case 9:
				 System.out.printf("September"); 
				 break;
			case 10:
				 System.out.printf("October"); 
				 break;
			case 11:
				 System.out.printf("November"); 
				 break;
			case 12:
				 System.out.printf("December"); 
				 break;
			default:
				 System.out.printf("Invalid Input"); 
				 break;
				 }
}}