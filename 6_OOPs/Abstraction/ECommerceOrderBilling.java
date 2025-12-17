/*
Q3. E-Commerce Order Billing – Abstract Billing Class
Abstract class: Order
Fields:
id, price

Method:
abstract double finalPrice()

Child classes:
ElectronicsOrder
GST = 18%
If price > 50,000 → add luxury tax = 5%
GroceryOrder
GST = 5%
If member = true → 3% discount
FashionOrder
GST = 12%
If price > 5,000 → discount = 10%

Task:
Create 9 orders.
Calculate final price of each.
Print:
total bill
order with minimum final price
Explanation
Uses :
Abstract class with only one abstract method
Complex logical conditions inside child implementations
Summation and min-value detection
*/
import java.util.*;
abstract class Order{
	int id ;
	double price;
	
	Order(int id , double price){
		this.id=id;
		this.price=price;
	}
	abstract double finalPrice();
}
class ElectronicsOrder extends Order{
	
	ElectronicsOrder(int id , double price){
		super(id , price);
	}
	
	public double finalPrice(){
		if(price > 50000){
			return price*0.18 + price*0.05 + price ;
		}else{
			return price + price*0.18;
		}
	}
	
}
class GroceryOrder extends Order{
	boolean member ;
	
	GroceryOrder(int id , double price , boolean member){
		super(id , price);
		this.member=member;
	}
	
	
	public double finalPrice(){
		if(member){
			return price*0.02+price;
		}else{
			return price*0.05+price;
		}
	}

}
class FashionOrder extends Order{
	
	FashionOrder(int id , double price){
		super(id , price);
	}
	
	public double finalPrice(){
		if(price > 5000){
			return price+price*0.02;
		}else{
			return price+price*0.12;
		}
	}
}

public class ECommerceOrderBilling{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		Order or[] = new Order[3];
		
		for(int i=0 ; i<or.length ; i++){
			
			System.out.println("Enter the Type of the Order: 1.ElectronicsOrder 2.GroceryOrder 3.FashionOrder");
				int type = sc.nextInt();
				
			System.out.println("Enter the Id of the order and Price of the order:");
			int id = sc.nextInt();
			double price = sc.nextDouble();
				
				switch(type){
					case 1:
						or[i] = new ElectronicsOrder(id , price);
						break;
					case 2:
						System.out.println("Enter the Member or not(true/false)");
						boolean member = sc.nextBoolean();
						or[i] = new GroceryOrder(id , price , member);
						break;
					case 3:
						or[i] = new FashionOrder(id , price);
						break;
					default : 
						System.out.println("Invalid Input");
						i--;	
				}
		}
		
		double minP = totalBill(or);
		System.out.println("Minimum Final Price of the order is : "  +minP);
	}
	
	public static double totalBill(Order or[]){
		double total=0;
		double minPrice=or[0].finalPrice();
		System.out.println("-----------------------------------------------------");
		System.out.println(" \t Order-Category \t\t Id \t\t Final-Price ");
		System.out.println("-----------------------------------------------------");

		for(int i=0 ; i<or.length;i++){
		
				double fprice = or[i].finalPrice();
				total+=fprice;
				if(fprice < minPrice){
					minPrice = fprice;
				}
			
		System.out.println((i+1) +"\t" +or[i].getClass().getSimpleName() +" \t\t "+ or[i].id+" \t\t "+fprice);
			
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("									="+total );

		return minPrice;
	}
}