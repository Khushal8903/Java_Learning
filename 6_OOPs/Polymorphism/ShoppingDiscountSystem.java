/*
Q4. Shopping Discount System – Multiple Inheritance Style (via classes)
parent class: product
Fields: name, price
 Method: getFinalprice()
 
Child classes:
Electronics
If price > 20,000 → 18% discount
Else 10%
Clothing
If seasonalSale → 30% discount
Else 5%
Groceries
No discount unless member = true → 3%

Task:
Accept 15 items.
Apply discounts via overridden methods.

print:

Item with minimum final price
Total bill for all items
Items where discount given > 1000.

Concepts
Overriding discount logic
Boolean logic + arithmetic
Aggregation and filtering

*/

import java.util.*;

class product{
	private String name;
	private double price;
	
	product(String name , double price){
		this.name = name;
		this.price=price;
	}
	
	public String getName(){
		return name;
	} 
	
	public double getprice(){
		return price;
	}
	
	public double getFinalprice(){
		return price;
	}
	
	public String toString(){
		return name+"\t\t"+getFinalprice();
	}
}

class Electronics extends product{
	Electronics(String name , double price){
		super(name , price);
	}
	public double getFinalprice(){
		if(getprice()>20000){
			return getprice() - (getprice()*0.18);
		}else {
			return getprice() - (getprice()*0.10);
			}
	}
}
class Clothing extends product{
	private boolean seasonalSale;
	Clothing(String name , double price , boolean seasonalSale){
		super(name , price);
		this.seasonalSale=seasonalSale;
	}
	public double getFinalprice(){
		if(seasonalSale){
			return getprice() - (getprice()*0.30);
		}else{
			return getprice() - (getprice()*0.05);
		}
	}
}

class Groceries extends product{
	private boolean member;	
	Groceries(String name , double price , boolean member){
		super(name , price);
		this.member=member;
	}	
	public double getFinalprice(){
		if(member){
			return getprice() - (getprice()*0.03);
		}else{
			return getprice();
		}
	}		
}

public class ShoppingDiscountSystem{
	public static void main(String x[]){
	
		Scanner sc = new Scanner(System.in);
		
		 product p[] = new product[5];
		
		for(int i=0 ; i<p.length ; i++){
			System.out.println("Enter the type og the product: 1.Electronics 2.Clothing 3.Groceries");
			int type  = sc.nextInt();
			
			System.out.println("Enter the Name and price of the product:");
			String n = sc.next();
			double pr = sc.nextDouble();
			
			
			switch(type){
				case 1:
					p[i] = new Electronics(n , pr);
					break;
				case 2:
					System.out.println("Sale is Seasonal or not(True/False):");
					boolean s = sc.nextBoolean();
					p[i] = new Clothing(n ,pr ,s);
					break;
				case 3:
					System.out.println("Customer is Member or not(True/False):");
					boolean m = sc.nextBoolean();
					p[i] = new Groceries(n , pr , m);
					break;
				default:
					System.out.println("Invalid Input");	
					i--;
			}
		}
		ShoppingDiscountSystem sd = new ShoppingDiscountSystem();
		
	System.out.println("Minimum Final price:" + sd.minFinalprice(p));
	System.out.println("Total Bill Amt:" + sd.totalBill(p));
	System.out.println("Discount over 1000 :" );
	 sd.discount(p);
	
		
	}
	public double minFinalprice(product p[]){	
		
		double minprice = p[0].getFinalprice();
		
		for(int i=0 ; i<p.length ; i++){
			if(p[i].getFinalprice() < minprice){
					minprice = p[i].getFinalprice();
			}
		}
		return minprice;
	}
		
	public double totalBill(product p[]){
		double totalBill = 0;
		
		for(int i=0 ; i<p.length ; i++){
			
			totalBill = totalBill + p[i].getFinalprice();
			
		}
		return totalBill;
	}
		
	public void discount(product p[]){
		System.out.println("-------------------------------------------------------");
		for(int i=0 ; i<p.length ; i++){
			double dis =p[i].getprice() -  p[i].getFinalprice(); 
			if(dis > 1000){
				System.out.println(p[i]);
			}
		}
	}
	
	
		
		
	
}


