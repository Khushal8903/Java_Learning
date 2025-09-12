/*
Q39. Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/

import java.util.*;
public class CommisionApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Sales Amount:");
	int sales = sc.nextInt();
	if(sales < 5000){
	   int Com = sales*2/100;
	   System.out.println(Com);
	}else if(sales >= 5000&&10000>sales){
	int Com1 = sales*5/100;
	   System.out.println(Com1);
	}else if(sales > 10000){
	int Com2 = sales*10/100;
	   System.out.println(Com2);
	}
	}
}