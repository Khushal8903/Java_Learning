/*
6. Food Item Price Comparison
Task:
 Create a FoodItem class with fields: name and price.
 In the main method:
Create two FoodItem objects.
Compare their prices and print the name of the cheaper food item.
Explanation:
 This helps understand comparison logic with custom objects.
*/
import java.util.*;
class FoodItem{
	private String name;
	private int price;
	
	public void setName(String name){
			this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public int getPrice(){
		return price;
	}
}

public class FoodItemPriceComparison{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the No of food items:");
	int n = sc.nextInt();
	sc.nextLine();

	FoodItem fi[] = new FoodItem[n];
	
	for(int i=0 ; i<fi.length;i++){
		
		fi[i] = new FoodItem();
		System.out.print("Enter the Name of the Food Item:");
		String f = sc.nextLine();
		fi[i].setName(f);
		
		System.out.print("Enter the price of the Food Item:");
		int p = sc.nextInt();
		sc.nextLine();
		fi[i].setPrice(p);
	}
	int minPrice=fi[0].getPrice() , k=0;
	for(int i=0 ; i<fi.length ; i++){
		if(fi[i].getPrice() < minPrice){
			minPrice = fi[i].getPrice();
			k=i;
		}
	}
	
	System.out.println();
	System.out.print("Cheaper food item name is: " + fi[k].getName() );
	
	}
}