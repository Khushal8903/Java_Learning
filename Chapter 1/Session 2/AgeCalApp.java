import java.util.*;
public class AgeCalApp{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year of the birth: XXXX");
	int Year = sc.nextInt();
	
	System.out.println("Enter the Month of the birth: XX");
	int Month = sc.nextInt();
	
	System.out.println("Enter the Day of the birth: XX");
	int Day = sc.nextInt();
	
	Year = 2024 - Year;
	Month = 12 - Math.abs(07-Month);
	double Day1 = 30.5 - Math.abs(12-Day); 
	
	System.out.printf("Age is %d Year// %d Month // %d Day", Year,Month,Day);
	
	
	
	
	
	
	}

}