/*
Q38. Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
*/
import java.util.*;
public class ScholarApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Attendance:");
	int att = sc.nextInt();
	System.out.printf("Enter the marks:");
	int marks = sc.nextInt();
	
	if(marks>=80 && att >=75){
	System.out.printf("Eligible for Scholaship");
	}else{
	System.out.printf("Not Eligible for Scholaship");
	}
	}
}