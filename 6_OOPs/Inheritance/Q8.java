/*
8. Question:
 Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.
*/
import java.util.*;
public class Q8{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Amount: ");
	int Amt = sc.nextInt();
	System.out.print("Year: ");
	int Yer = sc.nextInt();
	
	
	
	System.out.print("Amount: ");
	int Amt1 = sc.nextInt();
	System.out.print("Year: ");
	int Yer1 = sc.nextInt();
	
	
	Loan s = new HomeLoan(Amt , Yer);
	System.out.println("HomeLone :");
	System.out.println("EMI per Month: "+s.EMI());
	
	s = new CarLoan(Amt1 , Yer1);
	System.out.println("CarLoan: ");
	System.out.println("EMI per Month: "+s.EMI());

	
	}
}
class Loan{
	protected int amt;
	protected int yer;
	
	Loan(int amt , int yer){
		this.amt = amt;
		this.yer = yer;
	}
	
	
	
	double EMI(){
		return amt*0.02;
	}
}

class HomeLoan extends Loan{
	HomeLoan(int amt , int yer){
		super(amt , yer);
	}
	double EMI(){
		double total = amt + amt*0.07;
		double month = yer*12;
		return total/month;
	}
	
}

class CarLoan extends Loan{
	CarLoan(int amt , int yer){
		super(amt , yer);
	}
	double EMI(){
		double total = amt + amt*0.09;
		double month = yer*12;
		return total/month;
	}
}