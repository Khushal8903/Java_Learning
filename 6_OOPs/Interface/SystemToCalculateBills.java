/*
Q1. Create a system to calculate bills for different types of customers:
Requirements
Create an abstract class Customer with:
name
customerId
abstract method: double calculateBill(int units)
Create an interface Discountable with:
method: double applyDiscount(double bill)
Create three child classes:
ResidentialCustomer
CommercialCustomer
IndustrialCustomer

Bill calculation logic:
Residential → 5₹ per unit
Commercial → 8₹ per unit
Industrial →
first 100 units → 10₹
above 100 → 12₹

Some customers get discount:
Residential → 5%
Commercial → 8%
Industrial → no discount

Perform:
Input customer type
Input units
Calculate bill
Apply discount if applicable
Show final bill
Explanation
This problem checks:
Abstract method overriding
Interface implementation
Conditional billing logic
Multiple child behavior
*/

import java.util.*;

interface Discountable{
	double applyDiscount(double bill);
}

abstract class Customer{
	
	String name;
	int id;
	
	Customer( int id ,String name ){
		this.name=name;
		this.id=id;
	}
	
	abstract double calculateBill(int units);
	
}

class ResidentialCustomer extends Customer implements Discountable{
	
		ResidentialCustomer(int id , String name , int unit){
			super(id , name);
	
		}
		public double calculateBill(int unit){
			return 5*unit;
			
		}
		public double applyDiscount(double bill){
			return bill-bill*0.05;
		}
		
}
class CommercialCustomer extends Customer implements Discountable{
		
		CommercialCustomer(int id , String name , int unit){
			super(id , name);
			
		}
		public double calculateBill(int unit){
			return 8*unit;
			
		}
		public double applyDiscount(double bill){
			return bill-bill*0.08;
		}
}
class IndustrialCustomer extends Customer implements Discountable{
		
		IndustrialCustomer(int id , String name , int unit){
			super(id , name);
			
		}
		public double calculateBill(int unit){
			if(unit<=100){
			return 10*unit;
			}else{
				return 12*unit;
			}
			
		}
		public double applyDiscount(double bill){
			return bill;
		}
}
public class SystemToCalculateBills{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter the Customer Type: 1.ResidentialCustomer  2.CommercialCustomer  3.IndustrialCustomer");
		int type=sc.nextInt();
		System.out.println("Enter the name and id:");
		String name = sc.next();
		int id = sc.nextInt();
		int unit = sc.nextInt();
		Customer cr = null;
		Discountable d=null;
		switch(type){
			case 1:
				 cr = new ResidentialCustomer(id , name , unit);
				 d = (Discountable) cr;
				break;
			case 2:
				 cr = new CommercialCustomer(id , name , unit);
				 d = (Discountable) cr;
				break;
			case 3:
				 cr = new IndustrialCustomer(id , name , unit);
				 d = (Discountable) cr;
				break;
			default:
				System.out.println("Invalid Input...");
		}
		
		double amt = cr.calculateBill(unit);
		double finalAmt = d.applyDiscount(amt);
		System.out.println("The final Bill is:" + finalAmt );
	
		
	}
	
}