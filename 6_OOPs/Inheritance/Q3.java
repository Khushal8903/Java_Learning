/*
3. Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount)
 and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
Explanation:
 This tests constructor chaining and method overriding for price calculation.
*/
import java.util.*;
public class Q3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the id of the product:");
	int id1 = sc.nextInt();
	System.out.println("Enter the price of the product:");
	int price1 = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of the product:");
	String name1 = sc.nextLine();
	
	
	
	System.out.println("Enter the id of the product:");
	int id2 = sc.nextInt();
	
	System.out.println("Enter the price of the product:");
	int price2 = sc.nextInt();
	sc.nextLine();
	System.out.println("Enter the name of the product:");
	String name2 = sc.nextLine();
	
	Product p = new Electronics(id1 , name1, price1);
	System.out.println("Id: " + id1);
	System.out.println("Name: " + name1);
	System.out.println("Price: " + p.finalPrice());
	
	p = new Clothing(id2 , name2, price2);
	System.out.println("Id: " + id2);
	System.out.println("Name: " + name2);
	System.out.println("Price: " + p.finalPrice());
	
	 
	
	}
}

class Product{
	private int id;
	protected int price;
	private String name;
	Product(int id, String name , int price){
		this.id = id;
		this.name = name;
		this.price=price;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	double finalPrice(){
		return price;
	}
}

class Electronics extends Product{
	Electronics(int id , String name , int price){
		super(id , name, price);
	}
	
	double finalPrice(){
		return price-price*0.10;
	}
	
}

class Clothing extends Product{
	Clothing(int id , String name , int price){
		super(id , name, price);
	}
	
	double finalPrice(){
		return price-price*0.20;
	}
}