//Q54.Given a number 1–7, print the day name.
import java.util.*;
public class DayName{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the number between 1-7: ");
	int num = sc.nextInt();
	
	String str = num==1 ? "Monday" : num==2 ? "Tuesday" :
			     num==3 ? "Wednsday" : num==4 ? "Thusday" :
				 num==5 ? "Friday" : num==6 ? "Saturday" :
				 num==7 ? "Sunday" : "Invalid Input" ;
				 
	System.out.printf(str);
	}
}