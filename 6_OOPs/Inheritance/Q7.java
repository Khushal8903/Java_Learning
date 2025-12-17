/*
7. Question:
 Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.
*/
import java.util.*;
public class Q7{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Name: ");
	String n = sc.nextLine();
	System.out.print("Price: ");
	int p = sc.nextInt();
	
	
	
	System.out.print("Name: ");
	sc.nextLine();
	String n1 = sc.nextLine();
	System.out.print("Price: ");
	int p1 = sc.nextInt();
	
	
	Ticket s = new MovieTicket(n , p);
	System.out.println("Name: "+s.getn());
	System.out.println("Total Bill: "+s.calculatePrice());
	
	s = new BusTicket(n1 , p1);
	System.out.println("Name: "+s.getn());
	System.out.println("Total Bill: "+s.calculatePrice());

	
	}
}

class Ticket{
	private String name;
	protected int price;
	
	Ticket(String name , int price){
		this.name=name;
		this.price=price;
	}
	
	public String getn(){
		return name;
	}
	
	
	double calculatePrice(){
		return price;
	}
	
}

class MovieTicket extends Ticket{
	MovieTicket(String name , int price){
		super(name , price);
	}
	
	double calculatePrice(){
		return price+price*0.18;
	}
}

class BusTicket extends Ticket{
	BusTicket(String name , int price){
		super(name , price);
	}
	double calculatePrice(){
		return price+price*0.05;
	}
}