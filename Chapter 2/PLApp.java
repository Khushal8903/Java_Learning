//Q7. Write a Java program to input cost price and selling price of a product and check profit or loss.
import java.util.*;
public class PLApp{
	public static void main(String xx[]){
	Scanner sc = new Scanner(System.in);
	System.out.printf("Enter the Sell Price of Product:");
	int sell = sc.nextInt();
	System.out.printf("Entee the Cost Price of Product:");
	int cost = sc.nextInt();
	
	if(sell > cost ){
	System.out.printf("Seller Makes Profit");
	}else{
	System.out.printf("Seller Makes Losses");
	}
	}
}