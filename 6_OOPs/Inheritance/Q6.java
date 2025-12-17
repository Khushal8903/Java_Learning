/*
6. Question:
 Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.


Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.


Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.
*/
import java.util.*;
public class Q6{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Id: ");
	int id = sc.nextInt();
	System.out.print("Amount: ");
	int amt = sc.nextInt();
	
	
	System.out.print("Id: ");
	int id1 = sc.nextInt();
	System.out.print("Amount: ");
	int amt1 = sc.nextInt();
	Order s = new CODOrder(id , amt);
	System.out.println("Id: "+s.getId());
	System.out.println("Total Bill: "+s.totalAmt());
	
	s = new OnlinePaymentOrder(id1 , amt1);
	System.out.println("Id: "+s.getId());
	System.out.println("Total Bill: "+s.totalAmt());

	
	}
}
class Order{
	private int id;
	protected int amount;
	
	Order(int id , int amount){
		this.id=id;
		this.amount=amount;
	}
	public int getId(){
		return id;
	}
	int totalAmt(){
		return amount; 
	} 

}

class CODOrder extends Order{
	CODOrder(int id , int amount){
		super(id , amount);
	}
	int totalAmt(){
		return amount + 50; 
	} 

	

}

class OnlinePaymentOrder extends Order{
	OnlinePaymentOrder(int id , int amount){
		super(id , amount);
	}
	
	int totalAmt(){
			return amount-(int)(amount*0.05); 
		} 

}