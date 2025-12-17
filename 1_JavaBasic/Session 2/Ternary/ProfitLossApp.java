//Q37. Write a Java program to input cost price and selling price of
// a product and check profit or loss.
import java.util.*;
public class ProfitLossApp{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Cost Price: ");
	int cost = sc.nextInt();
	System.out.printf("Enter the Selling Price:");
	int sell =sc.nextInt();
	
	String str = sell>cost ? "Profit" : "Loss" ;
	
	System.out.printf(str);
	
	}
}