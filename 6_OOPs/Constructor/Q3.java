/*
Q3.Problem:
 Create a class BankAccount with fields:
 accNo, accHolder, balance.
 Use:
A default constructor to set balance = 1000


A parameterized constructor to initialize all fields


A method deposit() to add money


A method display() to show details.


Hint: Use constructor overloading for default and parameterized constructors.
Explanation:
 This question tests constructor overloading — how multiple constructors can initialize objects differently.
*/
import java.util.*;
public class Q3{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Account Holder Name:");
	String name = sc.nextLine();
	System.out.println("Enter the Account Number:");
	int n = sc.nextInt();
	
	
	BankAccount b = new BankAccount();
	new BankAccount(n , name);
	System.out.println("Enter the Deposit Amount:");
	int d = sc.nextInt();
	b.deposit(d);
	b.display();
	}
}



class BankAccount{
	private int accNo;
	private String accHolder;
	private int balance;
	
	BankAccount(){
		this.balance=1000;
	}
	BankAccount(int accNo , String accHolder){
		this.accNo = accNo;
		this.accHolder = accHolder;
	}
	
	public void deposit(int bal){
		this.balance += bal; 
	}
	
	public void display(){
	System.out.println("Account Holder Name:" + accHolder);
	System.out.println("Account Number:" + accNo);
	System.out.println("Balance:" + balance);
	
	}
	
}