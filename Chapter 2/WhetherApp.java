/*
Q37. Check whether the month number is valid and display season.
 
    Input: 1 to 12
    Logic: if-else if to map to Winter/Spring/Summer/Autumn.
    Output: Season.
*/
import java.util.*;
public class WhetherApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the month number:");
	int num = sc.nextInt();
	
	if(num == 1 || num==2 || num==12){
	System.out.printf("Winter");
	}else if(num==3||num==4||num==5){
	System.out.printf("Summer");
	}else if(num==6||num==7||num==8){
	System.out.printf("Monsoon");
	}else{
	System.out.printf("Post-Monsoon");
	}
	}
}