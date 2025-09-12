public class DayToYearWeekDayApp{
	public static void main(String x[]){
	
	int day1 = Integer.parseInt(x[0]);
	
	int year = day1/365;
	 
	int week1 = day1%365;
	
	int week = week1/7;
	 
	int day = week1%7;
	
	System.out.printf("Year:%d // Week:%d // Day:%d " , year ,  week ,  day);
	
	}
}