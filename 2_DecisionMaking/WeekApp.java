//Q31. Write a java program to input week number(1-7) and print the corresponding day of week name using if else.
// How to print day of week using if else in java programming.
import java.util.*;
public class WeekApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number: ");
        int num = sc.nextInt();
		switch(num){
			case 1:
				 System.out.printf("Sunday"); 
				 break;
			case 2:
				 System.out.printf("Monday"); 
				 break;
			case 3:
				 System.out.printf("Tuesday"); 
				 break;
			case 4:
				 System.out.printf("Wednsaday"); 
				 break;
			case 5:
				 System.out.printf("Thrusday"); 
				 break;
			case 6:
				 System.out.printf("Friday"); 
				 break;
			case 7:
				 System.out.printf("Saterday"); 
				 break;
			default:
				System.out.printf("Invalid Input");
				}
}}