/*
10. Bank Account Balance Update
Task:
 Create a BankAccount class with fields: accountHolderName and balance.
 In the main method:
Create a BankAccount object.
Deposit an amount into the account and print the updated balance.
Explanation:
 This introduces updating object fields and performing logical operations.
*/
import java.util.*;
class BankAccount{
	private int balance;
	private String accountHolderName;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccHolderName() {
		return accountHolderName;
	}
	public void setAccHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
}

public class BankAccountBalanceUpdate{
	public static void  main(String x[]){
	Scanner sc = new Scanner(System.in);
	
	BankAccount ba = new BankAccount();
	
	System.out.println("Enter the Account Holder Name , Balance:");
	String s = sc.nextLine();
	int b = sc.nextInt();
	ba.setAccHolderName(s);
	ba.setBalance(b);
	
	
	System.out.print("Enter the Deposit Amt:");
	int dps = sc.nextInt();
	
	ba.setBalance(ba.getBalance()+dps);
	
	System.out.print("Name: "+ba.getAccHolderName() +"\nBalance: "+ ba.getBalance());
	
	}
}
	