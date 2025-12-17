/*
 Create a class BankAccount with a method calculateInterest(). Create subclasses 
 SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/
import java.util.*;
public class Q2{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Balance :");
		int bal = sc.nextInt();
		
		SavingsAccount s = new SavingsAccount(bal);
		System.out.println("Saving account total balance : "+s.calculateInterest());
		
		CurrentAccount c = new CurrentAccount(bal);
		System.out.println("Current account total balance :"+c.calculateInterest());
		
	}
}
class BankAccount{

	int bal;
	
	BankAccount(int bal){
		this.bal=bal;
		
	}
	
	double calculateInterest(){
		return bal;
	}
}

class SavingsAccount extends BankAccount{
	SavingsAccount(int bal){
		super(bal);
	}
	double calculateInterest(){
		System.out.println("Savings Account :");
		return (double)bal+bal*0.05;
	}
}

class CurrentAccount extends BankAccount{
	CurrentAccount(int bal){
		super(bal);
	}
	
	double calculateInterest(){
		System.out.println("Current Account :");
		return (double)bal+bal*0.03;
	}
	
	
}