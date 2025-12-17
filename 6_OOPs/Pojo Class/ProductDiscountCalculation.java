/*
9. Product Discount Calculation
Task:
 Create a Product class with fields: name, price, and discountPercentage.
 In the main method:
Create a Product object.
Calculate the discounted price and print the result.
Explanation:
 This teaches applying percentages and using object fields.
*/

import java.util.*;
class Product{
	private int price;
	private int disPercentage;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDisPercentage() {
		return disPercentage;
	}
	public void setDisPercentage(int disPercentage) {
		this.disPercentage = disPercentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class ProductDiscountCalculation{
	public static void  main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	Product p = new Product();
	
	System.out.print("Enter the Product Name  , Price , Discount:");
	String s = sc.nextLine();
	int pr = sc.nextInt();
	int d = sc.nextInt();
	
	p.setDisPercentage(d);
	p.setName(s);
	p.setPrice(pr);
	
	double res = (double)(p.getPrice() *p.getDisPercentage())/100;
	
	System.out.println("Total amt is " + (p.getPrice() - res));
	
	
	}
}