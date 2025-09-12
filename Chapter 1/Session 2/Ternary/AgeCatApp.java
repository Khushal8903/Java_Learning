/*
Q53.Given age, print category:
Teen (13–19)


Adult (20–59)


Senior (60+)
*/

import java.util.*;
public class AgeCatApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Age:");
	int age = sc.nextInt();
	
	String str = 13<=age && age<=19 ? "Teen" :
				 20<= age && age<=59 ? "Adult" :
				 60<=age ? "Senior" : "Child" ;
				 
	System.out.printf(str);
	}
}