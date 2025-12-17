//Q51: Write a Java program using a switch case to input a month number (1-12) and display the number of days in that month. Consider leap year for February.
import java.util.*;
public class Year1App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the month number:");
	int num = sc.nextInt();
	switch(num){
	case 1: 
	     System.out.printf("January =31days");
		 break;
    case 2: 
	     System.out.printf("February =28days");
		 break; 
	case 3: 
	     System.out.printf("Maarch =31days");
		 break;
	case 4: 
	     System.out.printf("April =31days");
		 break;
	case 5: 
	     System.out.printf("May =31days");
		 break;
    case 6: 
	     System.out.printf("June =31days");
		 break;
	case 7: 
	     System.out.printf("July =31days");
		 break;
	case 8: 
	     System.out.printf("August =31days");
		 break;
	case 9: 
	     System.out.printf("September =31days");
		 break;
    case 10: 
	     System.out.printf("October =31days");
		 break;
	case 11: 
	     System.out.printf("November =31days");
		 break;
	case 12: 
	     System.out.printf("December =31days");
		 break;
	default:
		 System.out.printf("Invalid Input");
		 break;
	}
	}
}