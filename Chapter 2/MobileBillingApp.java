/*
Q42. Mobile plan billing system:
Input: Minutes used in a month
Logic:
Up to 100 mins → Base ₹199
101–300 mins → ₹199 + ₹1/min for extra
301–500 mins → ₹199 + ₹1.5/min for extra
Above 500 mins → ₹199 + ₹2/min for extra
Output: Total monthly bill.
*/

import java.util.*;
public class MobileBillingApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the How Much Minutes Used in a Month:");
	int minuts = sc.nextInt();
	int baseplan = 199;
	
	if(minuts <= 100){
	 System.out.println("Total monthly bill:" + baseplan);
	}else if(minuts>=101 && minuts<=300){
	   int extra=(minuts-100)*1;
	  int total= extra+baseplan;
	 System.out.println("Total monthly bill:" + total);
	}else if(minuts>=301 && minuts<=500){
	 double extra1=(minuts-100)*1.5;
	  double total1= extra1+baseplan;
	 System.out.println("Total monthly bill:" + total1);
	}else if(minuts>=500){
	   double extra2=(minuts-100)*2;
	  double total2= extra2+baseplan;
	 System.out.println("Total monthly bill:" + total2);
	}else{
	System.out.printf("Invalid Input");
	}
	}
}