/*
Q1. Bank Interest Calculation – Abstract Class
Abstract class: BankAccount
Fields:
accountNumber
balance
Methods:
abstract double calculateInterest()
void deposit(double amt)
void withdraw(double amt)
Child classes:
SavingAccount → interest = balance × 6%
CurrentAccount → interest = balance × 4%
FixedDepositAccount → interest = balance × 7.5%
Task:
Create an array of 6 accounts (mix of all three types).
For each, calculate interest and update balance.
Find the account with the highest interest earned.
Explanation:
This checks:
Abstract class with normal + abstract methods
Different calculation logic in child classes
Using polymorphism to store mixed objects
Finding maximum value
*/
import java.util.*;

abstract class BankAccount{
	 int accountNumber;
	 double balance=0;
	 
	 BankAccount(int ac , double bal){
		accountNumber =ac;
		balance += bal;
	 }
	
	abstract double calculateInterest();
	void deposit(double amt){
		balance+=amt;
		System.out.println("Amount Deposited!");
		System.out.println("Total Balance: " + balance);
	}
	void withdraw(double amt){
		balance-=amt;
		System.out.println("Amount Withdeawed!");
		System.out.println("Total Balance: " + balance);
	}
}

class  SavingAccount extends BankAccount{
	
	SavingAccount(int acc , double bal){
		super(acc , bal);
	}
	
	double calculateInterest(){
		return balance*0.06;
	}
	
}
class  CurrentAccount extends BankAccount{
	
	CurrentAccount(int acc , double bal){
		super(acc , bal);
	}
	
	double calculateInterest(){
		return balance*0.04;
	}
	
}
class  FixedDepositAccount extends BankAccount{
	
	FixedDepositAccount(int acc , double bal){
		super(acc , bal);
	}
	
	double calculateInterest(){
		return balance*0.075;	
	}
	
}

public class BankInterestCalculation{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		BankAccount ba[] = new BankAccount[6];
		
		for(int i=0 ;i<ba.length ; i++){
			System.out.println("Enter the typr of Bank Account :  1.SavingAccount  2.CurrentAccount  3.FixedDepositAccount");
			int type=sc.nextInt();
			System.out.println("Enter the Acc.no. and Bal");
			int ac = sc.nextInt();
			double bal = sc.nextDouble();
			switch(type){
				case 1:
					ba[i] = new SavingAccount(ac , bal);
					break;
				case 2:
					ba[i] = new CurrentAccount(ac , bal);
					break;
				case 3:
					ba[i] = new FixedDepositAccount(ac , bal);
					break;
				default:
					System.out.println("Enter the Valid input");
					i--;
			}
		}
		
		BankInterestCalculation bc = new BankInterestCalculation();
		int h = bc.updateBal(ba);
		System.out.println("Highest Interest Account : " + ba[h].accountNumber);
	}
	
	public int updateBal(BankAccount ba[]){
		double maxInt=0;
		int idx=0;
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Acc.No \t\t Balance \t\t Interest \t\t Total Amt");
		System.out.println("----------------------------------------------------------------");

		for(int i=0 ; i<ba.length;i++){
			
			double inte = ba[i].calculateInterest();
			if(inte > maxInt){
				maxInt=inte;
				idx=i;
			}
			
			
		System.out.println(ba[i].accountNumber +" \t\t "+ba[i].balance+" \t\t "+inte+" \t\t "+(ba[i].balance+inte));
			ba[i].balance +=inte;
			
			
		}
		return idx;
	}
}