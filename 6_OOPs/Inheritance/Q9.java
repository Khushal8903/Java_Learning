/*
9. Question:
 Create base class Product with fields id, name, and basePrice.
LuxuryProduct adds 20% tax.
EssentialProduct adds 5% tax.
 Write a program to print final price using polymorphism.
Explanation:
 Tests inheritance where logic changes depending on product type.
*/
import java.util.*;
public class Q9{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Id: ");
	int id = sc.nextInt();
	sc.nextLine();
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("basePrice: ");
	int price = sc.nextInt();
	
	
	System.out.print("Id: ");
	int id1 = sc.nextInt();
	sc.nextLine();
	System.out.print("Name: ");
	
	String name1 = sc.nextLine();
	
	System.out.print("basePrice: ");
	int price1 = sc.nextInt();
	
	
	Product s = new LuxuryProduct(id , name , price);
	System.out.println("Product Id: "+s.getId());
	System.out.println("Product Name: "+s.getName());
	System.out.println("Final Price: "+s.Price());
	
	s = new EssentialProduct(id1 , name1 , price1);
	System.out.println("Product Id: "+s.getId());
	System.out.println("Product Name: "+s.getName());
	System.out.println("Final Price: "+s.Price());

	
	}
}


class Product {
	private int id;
	private String name;
	protected int basePrice;
	
	Product(int id , String name , int basePrice){
		this.id=id;
		this.name=name;
		this.basePrice=basePrice;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	
	double Price(){
		return basePrice;
	}
}

class LuxuryProduct extends Product{
	LuxuryProduct(int id , String name , int basePrice){
		super(id , name , basePrice);
	}
	double Price(){
		return basePrice+basePrice*0.20;
	}
	
}

class EssentialProduct extends Product{
	EssentialProduct(int id , String name , int basePrice){
		super(id , name , basePrice);
	}
	
	double Price(){
		return basePrice+basePrice*0.05;
	}
	
}