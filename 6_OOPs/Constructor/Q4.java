/*
Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.


A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/
import java.util.*;
public class Q4{
	public static void main(String []x){
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the name of Product:");
	String name = sc.nextLine();
	System.out.println("Enter the id: ");
	int id = sc.nextInt();
	System.out.println("Enter the price of the product:");
	int price = sc.nextInt();
	Product p = new Product(id , name , price);
	Product p1 = new Product(p);
	p.Disp();
	p1.Disp();
	}
}

class Product{
	private int id;
	private String name;
	private int price;
	
	Product(int id , String name , int price){
		this.id = id;
		this.name = name ;
		this.price=price;
	}
	
	Product(Product p){
		id =p.id;
		name = p.name;
		price = p.price;
	}
	
	void Disp(){
		System.out.println("Product Id: "+ id);
		System.out.println("Product Name: "+ name);
		System.out.println("Product Price: "+ price);
		
	}
	
	
}