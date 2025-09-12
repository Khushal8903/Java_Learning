/*
Q43. Calculate fine for library book return:
Input: Number of days late 
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/
import java.util.*;
public class LibraryApp{
	public static void main(String x[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the no. of day late:");
	int day = sc.nextInt();
	int total = 0;
	if(day<=5){
	 total = day*2;
	System.out.println("Total fine:"+ total+ "\nMembership status:Valid");
	total = 0;
	}else if(day>5 && day <=10){
	 total = day*3;
	System.out.println("Total fine:"+ total+ "\nMembership status:Valid");
	total = 0;
	}else if(day>10 && day<=30){
	 total = day*5;
	System.out.println("Total fine:"+ total+ "\nMembership status:Valid");
	total = 0;
	}else{
	System.out.println("Total fine:"+500 + "\nMembership status:Membership canceled");
	}
	}
}