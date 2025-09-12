/*
 Q6. Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.
*/
import java.util.*;
public class Q6App{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Sales Amt:");
	int Amt = sc.nextInt();
	   int Com =0;
	if(Amt < 5000){
	   Com = Amt*2/100;
	   System.out.printf("Commission Amount: %d" , Com);
	}else if(Amt>=5000 && Amt<10000){
		Com = Amt*5/100;
	   System.out.printf("Commission Amount: %d" , Com);
	}else{
	   Com = Amt*10/100;
	   System.out.printf("Commission Amount: %d" , Com);
		
	}
	}
}

